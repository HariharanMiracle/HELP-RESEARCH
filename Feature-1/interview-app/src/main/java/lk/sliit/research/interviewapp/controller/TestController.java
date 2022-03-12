package lk.sliit.research.interviewapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import static lk.sliit.research.interviewapp.util.Constant.ERROR_LOG;

@Slf4j
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView();

        try{
            modelAndView.setViewName("test");
            modelAndView.addObject("text", "INTERVIEW-APP");
        }
        catch (Exception e){
            modelAndView.setViewName("error/page");
            modelAndView.addObject("error", e.getMessage());
            log.error(ERROR_LOG, e);
        }
        return modelAndView;
    }

}
