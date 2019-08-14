package com.study.spring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description
 *
 * @author shira 2019/08/14 10:36
 */
@Data
@NoArgsConstructor
public class Cat extends Pet {
    private String type = "cat";
}
