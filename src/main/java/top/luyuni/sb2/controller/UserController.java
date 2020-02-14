package top.luyuni.sb2.controller;

import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.luyuni.sb2.service.TestService;
import top.luyuni.sb2.service.UserService;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    TestService testService;
    @RequestMapping("/hello/{id}")
    @ResponseBody
    public String hello(@PathVariable("id") Long id){
        System.out.println(id + " -------------");
        return userService.getUserById(id).toString();
    }
    @RequestMapping("/testInitializer/{id}")
    @ResponseBody
    public String test(@PathVariable("id") Long id){
        return testService.test(id);
    }
}
