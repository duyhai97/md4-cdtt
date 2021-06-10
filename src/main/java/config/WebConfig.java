package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
//package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan("controller") //Scan den thu muc con troller
public class WebConfig implements WebMvcConfigurer {

    @Bean
    InternalResourceViewResolver resolver(){
        System.out.println("GOI WebConfig");
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/view"); //tuong ứng config xuống webapp/view
        resolver.setSuffix(".jsp");
        return resolver;
    }
}