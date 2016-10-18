package com.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2016/10/17.
 */
@Service
public class SpringAnnotationMethod {
    @Resource
    SpringAnnotation springAnnotation;

    public void springtest(){
        springAnnotation.springmethod();
    }

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringContext.xml");
        SpringAnnotationMethod method= (SpringAnnotationMethod) context.getBean("springAnnotationMethod");
        method.springtest();
    }
}
