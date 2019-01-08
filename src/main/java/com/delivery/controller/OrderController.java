package com.delivery.controller;

import com.delivery.entity.Order;
import com.delivery.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class OrderController {

    @Autowired
    public OrderService orderService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/callcenter")
    public String getAllOrders(Model model){
        model.addAttribute("postponedorders",orderService.findPostponed());
        model.addAttribute("allorders",orderService.findAll());
        return "callcenter";
    }

    @GetMapping("/deliveryboy")
    public String getUndeliveredOrders(Model model){
        model.addAttribute("undeliveredorders",orderService.findUndelivered());
        return "deliveryboy";
    }

    @GetMapping("/addOrder")
    public String createOrderPage(){
        return "createOrder";
    }

    @PostMapping("/addOrder")
    public String createOrder(@ModelAttribute("order") Order order){
        orderService.save(order);
        return "redirect:/callcenter";
    }

    @GetMapping("/update/{id}")
    public String updateOrderPage(@PathVariable("id") int id, Model model){
        model.addAttribute("order", orderService.GetById(id));
        return "editOrder";
    }

    @PostMapping("/updateOrder")
    public String updateOrder(@ModelAttribute("order") Order order){
        orderService.update(order);
        return "redirect:/callcenter";
    }

    @GetMapping("/postpone/{id}")
    public String postponeOrder(@PathVariable("id") int id){
        orderService.postpone(id);
        return "redirect:/deliveryboy";
    }

    @GetMapping("/delivere/{id}")
    public String delivereOrder(@PathVariable("id") int id){
        orderService.delivere(id);
        return "redirect:/deliveryboy";
    }

    @GetMapping("/delete/{id}")
    public String deleteOrder(@PathVariable("id") int id){
        orderService.delete(id);
        return "redirect:/callcenter";
    }

}
