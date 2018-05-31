package com.karve.logistics.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/logistics")
@Controller
public class TruckingLogisticsController {

    // Driver Tracking (GPS)
    @GetMapping("/drivertracking")
    public String driverTracking(@RequestParam(name = "userId", required = true) int userId,
                              @RequestParam(name="locationId", required=true) int locationId,
                              Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("locationId", locationId);
        return "lgDriverTracking";
    }

    // Searchable Route for the day
    @GetMapping("/searchableroutes")
    public String searchableRoutes(@RequestParam(name = "userId", required = true) int userId,
                              @RequestParam(name="locationId", required=true) int locationId,
                              Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("locationId", locationId);
        return "lgSearchableRoutes";
    }

    // Field Tickets
    @GetMapping("/fieldticket")
    public String fieldTicket(@RequestParam(name = "userId", required = true) int userId,
                              @RequestParam(name="locationId", required=true) int locationId,
                              Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("locationId", locationId);
        return "lgFieldticket";
    }

}
