package com.example.ci_cd.controller;

import com.example.ci_cd.service.MessageService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("message")
@Data
public class MessageController {
    private final MessageService messageService;

    @PostMapping("/post")
    ResponseEntity<String> printMessageServer(@RequestBody String message){
        String newMessage = messageService.printMessageServer(message);
        return ResponseEntity.ok("200");
    }

    @GetMapping("/get")
    ResponseEntity<String> printMessageClient(){
        String newMessage = messageService.printMessageClient();
        return ResponseEntity.ok(newMessage);
    }
}
