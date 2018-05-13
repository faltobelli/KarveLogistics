package com.karve.logistics.controller;


import com.karve.logistics.domain.viewModels.LocationViewModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RequestMapping("/api")
@Controller
public class AccessController {

    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    // don't know we need this

    @PostMapping("/add/location")
    public ResponseEntity<LocationViewModel> addLoc(@Valid @RequestBody LocationViewModel location) {
        // TODO: Implement Service and functionality
        return new ResponseEntity<LocationViewModel>(location,HttpStatus.OK);
    }

    @GetMapping("/get/location")
    public ResponseEntity<List<LocationViewModel>> getLoc(@Valid @RequestBody List<LocationViewModel> locations) {
        // TODO: Implement Service and functionality
        return new ResponseEntity<List<LocationViewModel>>(locations, HttpStatus.OK);
    }

}
