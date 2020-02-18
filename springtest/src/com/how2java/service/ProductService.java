package com.how2java.service;

import org.springframework.stereotype.Component;

//service核心业务类

@Component("s")
public class ProductService {
    public void doSomeService(){
        System.out.println("doSomeService");
    }
}
