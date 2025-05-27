package com.example.ci_cd.service.impls;

import com.example.ci_cd.model.Message;
import com.example.ci_cd.service.MessageService;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpls implements MessageService {
    @Override
    public String printMessage(String message) {
        Message userMessage = new Message();
        userMessage.setMessage(message);
        System.out.println("New Message\n" + message);
        return userMessage.getMessage();
    }
}
