package com.karve.logistics.controller;


import com.karve.logistics.domain.viewModels.LocationViewModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/api")
@RestController
public class AccessController {

    @PostMapping("/add/location")
    public ResponseEntity<LocationViewModel> addLoc(@Valid @RequestBody LocationViewModel location) {
        // TODO: Implement Service and functionality
        return new ResponseEntity<LocationViewModel>(location,HttpStatus.OK);
    }

    @GetMapping("/get/location")
    public ResponseEntity<List<LocationViewModel>> getLoc(@Valid @RequestBody List<LocationViewModel> locations) {
        // TODO: Implement Service and functionality
        return ResponseEntity<List<LocationViewModel>>(locations, HttpStatus.OK);
    }

}
