package top.luyuni.sb2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.luyuni.sb2.service.TestService;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/testInitializer/{id}")
    public String testInitializer(@PathVariable("id") Long id){
        return testService.test(id);
    }
}
