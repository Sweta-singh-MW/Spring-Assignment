const port1 = 8081
var firstName;
var lastName;
var DateOfBirth;
var address;
var phone;

let myData = [];
async function getapi(e) {

    const response = await fetch('http://localhost:' + port1 + '/resume/' + e.textContent)
    var data = await response.json();
    myFunction(0, data)
    console.log(myData)

}

async function delapi(e) {

    const response = await fetch('http://localhost:' + port1 + '/delete/' + e.id, {
        method: 'DELETE',
        headers: {
            'Content-Type': 'application/json'
        }
    })

    var data = await response.json();
    window.location = 'http://127.0.0.1:5500/MW%20Assignment/Resume.html';

    console.log(data)

}
const myFunction = (e, data) => {
    if (e == 0) {

        console.log(data)
        var firstName = data.firstName;
        var lastName = data.lastName;
        var DateOfBirth = data.dateOfBirth;
        var address = data.address;
        var phone = data.phone;
        var email = data.email;

    }
    else {
        var firstName = document.getElementById("myText").value;
        var lastName = document.getElementById("lname").value;
        var DateOfBirth = document.getElementById("myDOB").value;
        var address = document.getElementById("myAdd").value;
        var phone = document.getElementById("myPhone").value;
        var email = document.getElementById("myemail").value;

        fetch('http://localhost:' + port1 + '/resume/', {

            method: "POST",

            body: JSON.stringify({
                "address": address,
                "firstName": firstName,
                "email": email,
                "phone": phone,
                "lastName": lastName,
                "dateOfBirth": DateOfBirth
            }),

            headers: {
                "Content-type": "application/json; charset=UTF-8"
            }
        })

            .then(response => response.json())

    }


    document.getElementById("container").style.display = 'none';
    document.getElementById("home").style.display = 'none';
    document.getElementById("container-2").style.display = 'block';
    console.log(firstName);
    if (firstName == "") {
        document.getElementById('firstname').innerHTML = "This field is required";
        // return false;
    }
    if (!isNaN(firstName)) {
        document.getElementById('firstname').innerHTML = "Sweta";
    }

    var fullname = firstName + " " + lastName;
    document.getElementById('full-name').innerHTML = fullname;
    document.getElementById('full-name-1').innerHTML = fullname;
    console.log(DateOfBirth);
    if (DateOfBirth == "") {
        document.getElementById('DateOfBirth').innerHTML = "This field is required";
        //return false;
    }
    document.getElementById('daob').innerHTML = DateOfBirth;
    console.log(address);
    if (address == "") {
        document.getElementById('address').innerHTML = "This field is required";
        // return false;
    }
    document.getElementById('addr').innerHTML = address;
    console.log(phone);
    if (phone == "") {
        document.getElementById('phone').innerHTML = "This field is required";
        // return false;
    }
    document.getElementById('ph').innerHTML = phone;
    console.log(email);
    if (email == "") {
        document.getElementById('email').innerHTML = "This field is required";
        //  return false;
    }
    document.getElementById('mail').innerHTML = email;

}
