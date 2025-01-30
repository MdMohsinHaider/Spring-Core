package com.mohsin;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Core Spring
 *
 */
public class App {
    public static void main( String[] args ) {
        try {

            BeanFactory beanFactory = new ClassPathXmlApplicationContext("myspring.xml");

            Samsung samsungMobile = (Samsung)beanFactory.getBean("mySamsung");
            samsungMobile.call();
            samsungMobile.mail();
            samsungMobile.massage();
            samsungMobile.snapShot();

            Iphone iphone = (Iphone) beanFactory.getBean("myIphone");
            iphone.call();
            iphone.mail();
            iphone.massage();
            iphone.snapShot();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
