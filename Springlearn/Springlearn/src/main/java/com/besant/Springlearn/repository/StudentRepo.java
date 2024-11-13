package com.besant.Springlearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.besant.Springlearn.entity.Student;

//repository must be interface
//if the repository is interface we can only declared methods and body can't be given
//if we extends jparepository mean whatever in jparepo it;s come to sudentrepo interface also

@Repository
public interface StudentRepo extends JpaRepository< Student, Integer>{
	
	//User Creation Methods to access Student name
	public List<Student> getFindByStudName(String name);

}
