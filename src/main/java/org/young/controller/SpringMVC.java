package org.young.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("handler")
public class SpringMVC {
	//请求类型,在jsp里面是name="name2"...
	@RequestMapping(value = "welcome", method = RequestMethod.POST, params = {"name2=zs", "age2=13"})
    public String welcome(){
		System.out.println();
        return "success";
    }

	//请求头
	@RequestMapping(value = "welcome2", headers = {"Accept=text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"})
	public String welcome2() {
		return "success";
	}
	//还有一些ant ,路径问题

	//请求头
	@RequestMapping(value = "welcome33/{name}")
	public String welcome33(@PathVariable("name") String name) {
		System.out.println(name);
		return "success";
	}
}
