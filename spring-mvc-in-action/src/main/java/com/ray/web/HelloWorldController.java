package com.ray.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloWorld {@link Controller}
 *
 * @author shirayner
 * @since 2018/12/6
 */
@Controller
public class HelloWorldController {


	@RequestMapping("")
	public String index() {
		return "index";
	}
}
