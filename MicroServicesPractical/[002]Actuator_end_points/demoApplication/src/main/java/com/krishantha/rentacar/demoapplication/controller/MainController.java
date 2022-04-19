package com.krishantha.rentacar.demoapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Annotate with rest controller annotation
@RestController
public class MainController {


    // This is java method, we are going to call this from service. That means it is http ( url).
    //requestMapping annotation is used to map the url. It maps the request in the java method.
    // if someone is call the url call 'hello'. then come to this method.

    // This method is capable to handle both get and post request
    /*
    @RequestMapping(value = "/hello")
    public String greeting(){
        return "Hello Springboot";
    }

     */

    // separate method for get request
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting1(){
        return "Hello Springboot from get";
    }

    // separate method for post request
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greeting2(){
        return "Hello Springboot from post";
    }


}

// we don't need any servlet container. Because tomcat is embured with it. So, we just need to run this.
// we just need the rest client to deal with the service. Can use any rest client. here i am using postman as the rest client.
//Since postman is having some limitation.

// In the springboot application there are multiple places. Eg: If u put something on the class path, spring is going to read it
// and also it is going to put in resource directory
// In the maven project of we put anything in the resource (application.yml) directly ,it will consider as a class path in a run time
// if u put something in a config directory , that also take as a property file.
