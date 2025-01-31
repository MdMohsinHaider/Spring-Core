package com.mohsin;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Core Spring
 *
 */
public class MobileApp {
    public static void main( String[] args ) {
        try {
            BeanFactory beanFactory = new ClassPathXmlApplicationContext("myspring.xml");

            samsungMobile(beanFactory);
            iphoneMobile(beanFactory);
            setterInjectionNokiaMobile(beanFactory);
            constructorInjectionNokiaMobile(beanFactory);

        } catch (BeansException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void samsungMobile(BeanFactory beanFactory){
        try {
            Samsung samsungMobile = (Samsung)beanFactory.getBean("mySamsung");
            samsungMobile.call();
            samsungMobile.mail();
            samsungMobile.massage();
            samsungMobile.snapShot();
        } catch (BeansException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void iphoneMobile(BeanFactory beanFactory){
        try {
            Iphone iphone = (Iphone) beanFactory.getBean("myIphone");
            iphone.call();
            iphone.mail();
            iphone.massage();
            iphone.snapShot();
        } catch (BeansException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void setterInjectionNokiaMobile(BeanFactory beanFactory){
        try {
            Nokia nokia = (Nokia) beanFactory.getBean("myNokia");
            System.out.println(nokia);

            System.out.println(nokia.getId());
            System.out.println(nokia.getName());
            System.out.println(nokia.getEmail());

            nokia.setName("Devil");
            System.out.println(nokia.getName());

        } catch (BeansException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void constructorInjectionNokiaMobile(BeanFactory beanFactory){
        try {
            Nokia nokia1 = (Nokia) beanFactory.getBean("myNokia2");
            System.out.println("before "+nokia1);

            nokia1.setName("Mohsin");
            System.out.println("after "+nokia1);

        } catch (BeansException e) {
            System.err.println(e.getMessage());
        }
    }
}
