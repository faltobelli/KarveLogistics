package com.karve.logistics.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/md")
@Controller
public class MobileDeliveryController { // MobileTrucker??

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    // **********************************
    // Field Ticket
    @RequestMapping({"", "/", "/fieldticketDetail"})
    public String FieldTicketDetail(@RequestParam(name = "userId", required = true) int userId,
                                    @RequestParam(name = "fieldTicketNum", required = true, defaultValue = "-1") int fieldTicketNum,
                                    Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("fieldTicketNum", fieldTicketNum);
        return "mdFieldTicketDetail";
    }

    @RequestMapping({"", "/", "/fieldtickets"})
    public String mobileDelieveryTickets(@RequestParam(name = "userId", required = true) int userId,
                                        Model model) {
        String name = "Billy Bob";
        model.addAttribute("userId", userId);
        return "mdFieldTicket";
    }


    // **********************************
    // Routes for the day (Searchable)
    @RequestMapping({"", "/", "/routes"})
    public String mdRoutes(@RequestParam(name = "userId", required = true) int userId,
                           Model model) {
        model.addAttribute("userId", userId);
        return "mdRoutes";
    }

    @GetMapping("/routedetail")
    public String mdRoutesDetail(@RequestParam(name = "userId", required = true) int userId,
                                 @RequestParam(name="routeId", required=true) int routeId,
                                 Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("routeId", routeId);
        return "mdRouteDetail";
    }

    // **********************************
    // GPS Routing
    @RequestMapping({"", "/", "/maproute"})
    public String mdMapRoute(@RequestParam(name = "userId", required = true) int userId,
                                 @RequestParam(name="routeId", required=true) int routeId,
                                 Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("routeId", routeId);
        return "mdMapRoute";
    }
}
