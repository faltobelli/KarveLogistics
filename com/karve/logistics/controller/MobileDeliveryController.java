package com.karve.logistics.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/md")
@Controller
public class MobileDeliveryController { // MobileTrucker??

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    // **********************************
    // Field Ticket

    @GetMapping("/fieldticketDetail")
    public String FieldTicketDetail(@RequestParam(name = "userId", required = true) int userId,
                                    @RequestParam(name = "fieldTicketNum", required = true, defaultValue = "-1") int fieldTicketNum,
                                    Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("fieldTicketNum", fieldTicketNum);
        return "mdFieldTicketDetail";
    }

    @GetMapping("/fieldtickets")
    public String mobileDelieveryTickets(@RequestParam(name = "userId", required = true) int userId,
                                        Model model) {
        String name = "Billy Bob";
        model.addAttribute("userId", userId);
        return "mdFieldTicket";
    }


    // **********************************
    // Routes for the day (Searchable)

    @GetMapping("/mdroutes")
    public String mdRoutes(@RequestParam(name = "userId", required = true) int userId,
                           Model model) {
        model.addAttribute("userId", userId);
        return "mdRoutes";
    }

    @GetMapping("/mdroutedetail")
    public String mdRoutesDetail(@RequestParam(name = "userId", required = true) int userId,
                                 @RequestParam(name="routeId", required=true) int routeId,
                                 Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("routeId", routeId);
        return "mdRouteDetail";
    }

    // **********************************
    // GPS Routing

    @GetMapping("/mdmaproute")
    public String mdMapRoute(@RequestParam(name = "userId", required = true) int userId,
                                 @RequestParam(name="routeId", required=true) int routeId,
                                 Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("routeId", routeId);
        return "mdMapRoute";
    }
}
