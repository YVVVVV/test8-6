package main.com.service;

import main.com.domain.Student;

import java.util.List;

public interface StudentService {

    public Student get(String username);

    public void save(Student s);

    List<Student> getAll();

}
