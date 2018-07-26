package config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;

@Controller
@EnableJpaRepositories(basePackages = {"dao"})
@EntityScan(basePackages = "domain")
@SpringBootApplication(scanBasePackages = {"bean", "config", "controller", "interceptor", "impl"})
public class ApplicationInitializer implements WebMvcConfigurer {

    @Resource(name = "MyInterceptor")
    private HandlerInterceptorAdapter interceptorAdapter;

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(interceptorAdapter);
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationInitializer.class, args);
    }
}
