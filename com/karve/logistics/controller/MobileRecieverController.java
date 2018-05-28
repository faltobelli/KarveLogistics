package com.karve.logistics.controller;


import org.springframework.data.rest.webmvc.support.ETagArgumentResolver;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/reciever")
@RestController
public class MobileRecieverController {

    // **********************************
    // Next Delievery Truck ETA
    @RequestMapping({"", "/", "/nextdelivery"})
    public String mrNextDeliveryETA(@RequestParam(name = "userId", required = true) int userId,
                                 @RequestParam(name="locationId", required=true) int locationId,
                                 Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("locationId", locationId);
        return "mrNextDelivery";
    }

    // **********************************
    // Trucks Onsite
    @RequestMapping({"", "/", "/trucksonsite"})
    public String mrTrucksOnsite(@RequestParam(name = "userId", required = true) int userId,
                                    @RequestParam(name="locationId", required=true) int locationId,
                                    Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("locationId", locationId);
        return "mrTrucksOnsite";
    }

    // **********************************
    // Field Ticket Authorization
    @RequestMapping({"", "/", "/fieldtickeauth"})
    public String mrfieldTicketAuth(@RequestParam(name = "userId", required = true) int userId,
                                 @RequestParam(name="locationId", required=true) int locationId,
                                 Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("locationId", locationId);
        return "mrfieldTicketAuthorization";
    }

}
