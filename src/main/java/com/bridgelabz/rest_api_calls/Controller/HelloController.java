package com.bridgelabz.rest_api_calls.Controller;

import com.bridgelabz.rest_api_calls.Model.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String getHelloMessage(){
        return "Hello Bridgelabz";
    }

    @GetMapping("hello/query")
    public String getHelloMessageWithName(@RequestParam String name){
        return "Hello Bridgelabz " +name;
    }

    @GetMapping("hello/param/{name}")
    public String getHelloMessageName(@PathVariable String name){
        return "Hello Bridgelabz " +name;
    }

    @PostMapping("hello/message")
    public Person getHelloMessageWithFnameAndLname(@RequestBody Person person ){
        return person;
    }

    @PutMapping("/hello/put/{fname}")
    public String getHelloMessageFnameAndLname(@PathVariable String fname,@RequestParam String lname){
        return "Hello Bridgelabz " +fname+" "+lname;
    }

}
