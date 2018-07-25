package stater;


import bean.Person;
import dao.ActivityDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@EnableJpaRepositories(basePackages = {"dao"})
@EntityScan(basePackages = "entity")
@SpringBootApplication(scanBasePackages = {"bean", "stater", "controllers", "interceptor", "service"})
public class ApplicationController implements WebMvcConfigurer {



    @Resource(name = "MyInterceptor")
    private HandlerInterceptorAdapter interceptorAdapter;

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

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(interceptorAdapter);
    }


    public static void main(String[] args) {
        SpringApplication.run(ApplicationController.class, args);
    }
}
