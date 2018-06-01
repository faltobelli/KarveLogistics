package com.karve.logistics.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ec")
@RestController
public class EndCustomerController {


    @GetMapping("/")
    public String index() {
        return "hello";
    }

    // Driver Tracking (GPS)
    @GetMapping("/drivertracker")
    public String DriverTracking(@RequestParam(name = "userId", required = true) int userId,
                                 @RequestParam(name="locationId", required=true) int locationId,
                                 Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("locationId", locationId);
        return "ecDriverTracker";
    }

    // Searchable Route for the DAy
    @GetMapping("/searchableRoutes")
    public String searchableRoutes(@RequestParam(name = "userId", required = true) int userId,
                                 @RequestParam(name="locationId", required=true) int locationId,
                                 Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("locationId", locationId);
        return "ecSearchableRoutes";
    }

    // Field Tickets
    @GetMapping("/fieldticket")
    public String fieldTicket(@RequestParam(name = "userId", required = true) int userId,
                                 @RequestParam(name="locationId", required=true) int locationId,
                                 Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("locationId", locationId);
        return "ecFieldTicket";
    }
}
