package com.study.spring.model;

import com.study.spring.config.BeanConfiguration;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * description
 *
 * @author shira 2019/08/14 10:27
 */
public class SpringApplicationTest {

    @Test
    public void launchByBeanFactory(){
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Person bean = (Person) beanFactory.getBean("person");
        System.out.println(bean);

    }

    @Test
    public void launchByAnnotationConfigApplicationContext(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);

        String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String name : namesForType) {
            System.out.println(name);
        }
    }

}