package main.com.service.impl;

import main.com.dao.StudentDao;
import main.com.domain.Student;
import main.com.service.StudentService;
import main.com.util.SqlSessionutil;

import java.util.List;

public class StudentSrviceImpl implements StudentService {

    private StudentDao studentDao = SqlSessionutil.getSession().getMapper(StudentDao.class);

    @Override
    public Student get(String username) {
        Student s =studentDao.get(username);

        return s;
    }

    @Override
    public void save(Student s) {
        studentDao.save(s);

    }

    @Override
    public List<Student> getAll() {

        List<Student> slist = studentDao.getAll();
        return slist;

    }


}
