package cn.soft.demo.service;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StuServiceTest {

    @Test
    public void test1() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//      Date date = sdf.parse("2017-08-28");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        StuService stuService = applicationContext.getBean("stuService", StuService.class);
        System.out.println(stuService);
        System.out.println(stuService.getName());
        System.out.println(sdf.format(stuService.getDate()));

        System.out.println(sdf.format(new Date(2017, 1, 2)));
    }
    
    @Test
    public void test2(){
        System.out.println("Hello World!");
    }
}
