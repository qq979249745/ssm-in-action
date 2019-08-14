package com.study.spring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description
 *
 * @author shira 2019/07/20 12:46
 */
@Data
@NoArgsConstructor
public class Person {

    private Long id;
    private String name;
    private Integer age;

    private Pet pet;
}
