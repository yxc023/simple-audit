package com.yangxiaochen.audit;

import com.yangxiaochen.audit.core.annotation.Audit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {
    @Audit
    @GetMapping("/data")
    public String getData(String param, String param2) {
        return "data";
    }
}
