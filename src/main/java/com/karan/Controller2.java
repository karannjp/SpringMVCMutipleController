package com.karan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller2 {
@RequestMapping("/hello1")
public String display(){

    return  "view2";
}

}
