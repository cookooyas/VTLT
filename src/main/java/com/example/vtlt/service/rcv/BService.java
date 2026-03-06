package com.example.vtlt.service.rcv;

import org.springframework.stereotype.Service;

@Service
public class BService {
    public void doB() {
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println("BService.doB failed.");
        }
    }
}
