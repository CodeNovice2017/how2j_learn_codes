package com.how2java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.pojo.Category;
import com.how2java.pojo.Production;
import com.how2java.service.ProductService;
import com.how2java.service.TestJDBCService;

public class TestSpring {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        Category c = (Category)context.getBean("c");
        System.out.println(c.getName());
        Production p = (Production)context.getBean("p");
        System.out.println(p.getCategory().getName());

        //AOP
        ProductService s = (ProductService)context.getBean("s");
        s.doSomeService();
        TestJDBCService s1 = (TestJDBCService)context.getBean("s1");
        s1.doSomeJDBCService();
    }
}
