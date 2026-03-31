package com.whatsapp.chatbot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @PostMapping("/webhook")
    public String handleMessage(@RequestBody MessageRequest request) {

        String msg = request.getMessage();

        System.out.println("Incoming message: " + msg);

        if(msg.equalsIgnoreCase("Hi")){
            return "Hello";
        }

        else if (msg.equalsIgnoreCase("Bye")){
            return "Goodbye";
        }

        else{
            return "I dont't understand";
        }

    }


}
