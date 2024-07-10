package yxz.maven.web.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
    @GetMapping("/test")
    public String Test(){
        log.info("压力太大我好难受");
        return "hello,Austin";
    }
}
