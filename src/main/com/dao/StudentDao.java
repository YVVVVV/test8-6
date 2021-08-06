package main.com.dao;

import main.com.domain.Student;

import java.util.List;

public interface StudentDao {



    public Student get(String username);

    public void save(Student s);

    List<Student> getAll();

    List<Student> like(String s);

    List<Student> like1(String s);

    List<Student> donglike(Student s);
}
