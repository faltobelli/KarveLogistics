package com.karve.logistics.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/customer")
@RestController
public class EndCustomerController {

    // Driver Tracking (GPS)
    @RequestMapping({"", "/", "/drivertracker"})
    public String DriverTracking(@RequestParam(name = "userId", required = true) int userId,
                                 @RequestParam(name="locationId", required=true) int locationId,
                                 Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("locationId", locationId);
        return "ecDriverTracker";
    }

    // Searchable Routes for the DAy
    @RequestMapping({"", "/", "/searchableRoutes"})
    public String searchableRoutes(@RequestParam(name = "userId", required = true) int userId,
                                 @RequestParam(name="locationId", required=true) int locationId,
                                 Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("locationId", locationId);
        return "ecSearchableRoutes";
    }

    // Field Tickets
    @RequestMapping({"", "/", "/fieldticket"})
    public String fieldTicket(@RequestParam(name = "userId", required = true) int userId,
                                 @RequestParam(name="locationId", required=true) int locationId,
                                 Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("locationId", locationId);
        return "ecFieldTicket";
    }
}
