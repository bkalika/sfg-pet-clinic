package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bogdan.kalika@gmail.com
 * Date: 3/19/2024
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({ "", "/", "/index", "/index.html"})
    public String listOwners() {
        return "owners/index";
    }
}
