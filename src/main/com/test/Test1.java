package main.com.test;

import main.com.dao.StudentDao;
import main.com.domain.Student;
import main.com.service.StudentService;
import main.com.service.impl.StudentSrviceImpl;
import main.com.util.ServiceFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = null;
//        try {
//            inputStream = Resources.getResourceAsStream(resource);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        SqlSessionFactory sqlSessionFactory =
//                new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession session = sqlSessionFactory.openSession();
//
//       Student s = session.selectOne("test1.get","y");
//        System.out.println(s);
//       session.close();


        StudentService ss = (StudentService)ServiceFactory.getservice(new StudentSrviceImpl());

//        Student s =new Student();
//        s.setEmail("yyy");
//        s.setPassword("yy");
//        s.setSex("yy");
//        s.setUsername("yy");
//        ss.save(s);

        Student s =ss.get("21");
        System.out.println(s);

//        List<Student> slist=ss.getAll();
//        for (Student s:slist){
//            System.out.println(s);
//        }

    }
}
