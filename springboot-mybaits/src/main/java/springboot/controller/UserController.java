package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.mapper.UserMapper;
import springboot.model.User;

@RestController
public class UserController {

	
	@Autowired
  	private UserMapper uMapper;
	
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    
 @RequestMapping("/api/user")
 public User Test() {
	 User t = uMapper.selectOne();
	 return t;
 }
}
