package geo.geoSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PageController {

   @GetMapping("/live-location")
   public String live(){
      return "/live-location";
   }

   @GetMapping("location-log")
   public String log(){
      return "location-log";
   }

   @GetMapping("register")
   public String registerPage() {
      return "register";
   }

   @GetMapping("login")
   public String loginPage() {
      return "login";
   }
}