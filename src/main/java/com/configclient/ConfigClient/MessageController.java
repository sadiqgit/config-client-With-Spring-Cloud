package com.configclient.ConfigClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/rest")
public class MessageController {
     @Value("${message:Default Message}")
     private String message;
    @GetMapping("/message")
    public String message ()
    {
        return message;
    }


}
