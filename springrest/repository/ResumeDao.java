package com.springrest.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.Resume;

public interface ResumeDao extends JpaRepository<Resume,String> {

}
