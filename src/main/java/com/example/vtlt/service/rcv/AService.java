package com.example.vtlt.service.rcv;

import org.springframework.stereotype.Service;

@Service
public class AService {
    public void doA() {
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println("AService.doA failed.");
        }
    }
}
