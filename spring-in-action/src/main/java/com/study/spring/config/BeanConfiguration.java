package com.study.spring.config;

import com.study.spring.model.Dog;
import com.study.spring.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description
 *
 * @author shira 2019/08/14 10:29
 */
@Configuration
public class BeanConfiguration {

    @Bean
    public Person person(){
        Dog dog = new Dog();
        dog.setAge(2);
        dog.setName("大黄");

        Person person = new Person();
        person.setId(1L);
        person.setName("tom");
        person.setAge(22);
        person.setPet(dog);
        return person;
    }
}
