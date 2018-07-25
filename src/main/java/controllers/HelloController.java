package controllers;

import bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private Person person;

    @RequestMapping("/")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/json")
    @ResponseBody
    public Person helloJson(){
        return person;
    }
}
