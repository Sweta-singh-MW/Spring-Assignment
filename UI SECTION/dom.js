const list = document.getElementById("list1");
const port = 8081
const api = () => {
    fetch('http://localhost:' + port + '/resume/')
        .then(response => response.json())
        .then(data => {
            let l, a;
            for (x in data) {
                l = document.createElement("LI");
                l.setAttribute('class', 'list-group-item d-inline-flex')
                a = document.createElement("a")
                a.setAttribute('onclick', 'getapi(this)')// 'http://localhost:'+port+'/resume/'+data[x].firstName)
                a1 = document.createElement("a")
                a1.setAttribute('onclick', 'delapi(this)')
                a1.setAttribute('class', 'ms-auto btn btn-danger')
                a1.setAttribute('id', data[x].firstName)
                console.log(data[x].firstName)
                var view = document.createTextNode(data[x].firstName);
                var del = document.createTextNode('Delete');
                a.appendChild(view);
                a1.appendChild(del);

                l.appendChild(a); l.appendChild(a1);
                list.appendChild(l);
            }

            console.log(data)
        });
}

api();

