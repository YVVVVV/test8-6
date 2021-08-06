package main.com.test;

import main.com.dao.StudentDao;
import main.com.domain.Student;
import main.com.util.SqlSessionutil;

import java.util.List;

public class test2 {
    public static void main(String[] args) {
        StudentDao studentDao = SqlSessionutil.getSession().getMapper(StudentDao.class);

//        List<Student> slist1 = studentDao.like1("%y%");
//        for (Student s1:slist1){
//            System.out.println(s1);
//        }


//模糊查询
//        List<Student> slist = studentDao.like("y");
//        for (Student s1:slist){
//            System.out.println(s1);
//        }


//        //动态模糊查询
//        Student s = new Student();
//        s.setUsername("y");
//        s.setEmail("123");
//
//        List<Student> slist = studentDao.donglike(s);
//        for (Student s1 : slist) {
//            System.out.println(s1);
//        }
    }
}
