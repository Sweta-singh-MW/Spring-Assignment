package com.springrest.springrest.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Resume;
import com.springrest.springrest.repository.ResumeDao;


@Service
public class MyService {

	@Autowired
    private ResumeDao repo;
	public List<Resume> listAll() {
        return repo.findAll();
    }
     
    public void save(Resume std) {
        repo.save(std);
    }

	public void saveOrUpdate(Resume resume) {
		repo.save(resume);
		}

	public Resume getResumeById(String id) {
		return 
			repo.findById(id).get();
	}

	public void delete(String id) {
		repo.deleteById(id);
		
	}
 
}

