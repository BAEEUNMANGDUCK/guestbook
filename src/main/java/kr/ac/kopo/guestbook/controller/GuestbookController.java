package kr.ac.kopo.guestbook.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/guestbook")
@Log4j2
public class GuestbookController {


    @GetMapping({"/","/list"})
    public String list(){
        log.info("list() 실행됨");

        return "/guestbook/list";
    }


}
