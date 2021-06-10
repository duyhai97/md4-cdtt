package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
    @GetMapping("/convert")
    public ModelAndView showForm(){
        return new ModelAndView("/convert");
    }

    @PostMapping("/convert")
    public ModelAndView convert(double rate, double usd){
        ModelAndView modelAndView = new ModelAndView("/convert");
        double result = rate*usd;
        modelAndView.addObject("result", result);

        return modelAndView;

    }
}
