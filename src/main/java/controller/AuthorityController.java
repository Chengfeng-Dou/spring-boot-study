package controller;

import bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AuthorityController {

    @RequestMapping(name = "/login")
    public String loginPage(){
        return "login";
    }


    @RequestMapping("/")
    public String index(Model model){
        Person single = new Person().setName("xx").setAge(11);

        List<Person> people = new ArrayList<>(3);
        Person p1 = new Person().setName("xx").setAge(11);
        Person p2 = new Person().setName("yy").setAge(22);
        Person p3 = new Person().setName("zz").setAge(33);
        people.add(p1);
        people.add(p2);
        people.add(p3);

        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);

        return "index";
    }
}
