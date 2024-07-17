package org.coding.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Mycontroller {

    @RequestMapping("m")
    public static String my(String[] args) {
        return "<h1>Hello World</h1>";
    }

@GetMapping("mei")
public static String getData(@RequestParam int ao,@RequestParam int b ){
   int an=ao+b;
    return "Result ="+an;
}

}
