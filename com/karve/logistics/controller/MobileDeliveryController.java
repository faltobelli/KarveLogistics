package com.karve.logistics.controller;


import com.karve.logistics.service.mobileDelivery.face.MobileDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/md")
@Controller
public class MobileDeliveryController {

    private MobileDeliveryService mobileDeliveryService;

    @Autowired
    public MobileDeliveryController(MobileDeliveryService mobileDeliveryService) {
        this.mobileDeliveryService = mobileDeliveryService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    // **********************************
    // Field Ticket
    @GetMapping("/fieldticketDetail")
    public String getFieldTicketDetail(@RequestParam(name = "userId", required = true) int userId,
                                    @RequestParam(name = "fieldTicketNum", required = true, defaultValue = "-1") int fieldTicketNum,
                                    Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("fieldTicketNum", fieldTicketNum);
        model.addAttribute(mobileDeliveryService.getFieldTicketDetail(fieldTicketNum));

        return "mdFieldTicketDetail";
    }

    @GetMapping("/fieldtickets")
    public String getMobileDelieveryTickets(@RequestParam(name = "userId", required = true) int userId,
                                        Model model) {
        String name = "Billy Bob";
        model.addAttribute("userId", userId);
        return "mdFieldTicket";
    }


    // **********************************
    // Routes for the day (Searchable)
    @GetMapping("/routes")
    public String getRoutes(@RequestParam(name = "userId", required = true) int userId,
                           Model model) {
        model.addAttribute("userId", userId);
        return "mdRoutes";
    }

    @GetMapping("/routedetail")
    public String getRoutesDetail(@RequestParam(name = "userId", required = true) int userId,
                                 @RequestParam(name="routeId", required=true) int routeId,
                                 Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("routeId", routeId);
        return "mdRouteDetail";
    }

    // **********************************
    // GPS Routing
    @GetMapping("/maproute")
    public String getMapRoute(@RequestParam(name = "userId", required = true) int userId,
                                 @RequestParam(name="routeId", required=true) int routeId,
                                 Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("routeId", routeId);
        return "mdMapRoute";
    }
}
