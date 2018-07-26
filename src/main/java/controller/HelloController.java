package controller;

import bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/hello")
public class HelloController {
    private final Person person;

    @Autowired
    public HelloController(Person person) {
        this.person = person;
    }

    @RequestMapping("")
    @ResponseBody
    public Person helloJson(){
        return person;
    }
}
