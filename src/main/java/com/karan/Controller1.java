package com.karan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller1 {
@RequestMapping("/hello")
public String view1(){

    return  "view1";
}




}
