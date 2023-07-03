package com.sample.multiproject.B.multiprojectB;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleBController {

    @GetMapping("sampleB")
    @ResponseBody
    public String index() {
        return "hello worldB";
    }
}