package com.example.ci_cd.service;

import com.example.ci_cd.model.Message;
import lombok.Data;
import org.springframework.stereotype.Service;


public interface MessageService {
    Message inMessage = new Message();
    String printMessageServer(String message);
    String printMessageClient();
}
