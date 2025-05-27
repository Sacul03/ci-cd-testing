package com.example.ci_cd.service;

import lombok.Data;
import org.springframework.stereotype.Service;


public interface MessageService {
    String printMessage(String message);
}
