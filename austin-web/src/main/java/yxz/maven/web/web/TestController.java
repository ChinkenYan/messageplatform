package yxz.maven.web.web;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Reference;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yxz.maven.dao.MessageTemplateDao;
import yxz.maven.domain.MessageTemplate;

import javax.annotation.Resource;
import java.util.List;


@RestController
@Slf4j
public class TestController {
    @Resource
    private MessageTemplateDao messageTemplateDao;

    @GetMapping("/test")
    public String Test(){
        log.info("压力太大我好难受");
        return "hello,Austin";
    }

    @RequestMapping("/database")
    private String testDataBase() {
        List<MessageTemplate> list = messageTemplateDao.findAllByIsDeletedEquals(0, PageRequest.of(0, 10));
        return JSON.toJSONString(list);
    }


}
