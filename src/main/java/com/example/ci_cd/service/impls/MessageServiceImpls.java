package com.example.ci_cd.service.impls;

import com.example.ci_cd.model.Message;
import com.example.ci_cd.service.MessageService;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpls implements MessageService {
    Message inMessage = new Message();

    @Override
    public String printMessageServer(String message) {
        inMessage.setMessage(message);
        String newMessage = inMessage.getMessage();
        System.out.println("New Message\n" + newMessage);
        return newMessage;
    }


    // For Testing CI/CD
    @Override
    public String printMessageClient() {
        return "Your message is" + inMessage.getMessage();
    }
}
