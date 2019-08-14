package com.study.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description
 *
 * @author shira 2019/08/14 10:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dog extends Pet {
    private String type = "dog";
}
