package com.example.ci_cd.controller;

import com.example.ci_cd.service.MessageService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
@Data
public class MessageController {
    private final MessageService messageService;

    @PostMapping("/post")
    ResponseEntity<String> printMessage(@RequestBody String message){
        String newMessage = messageService.printMessage(message);
        return ResponseEntity.ok("200");
    }
}
