package org.sandeep.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/route")
public class RouteController {


    @GetMapping("/")
    boolean isValidRoute(){
        return true;
    }
}
