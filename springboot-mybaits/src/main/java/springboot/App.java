package springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springboot.App;

@SpringBootApplication
@ComponentScan
@MapperScan("springboot.mapper")
public class App { 

	 public static void main(String[] args) { 
		  SpringApplication.run(App.class, args); 
	 } 
} 

