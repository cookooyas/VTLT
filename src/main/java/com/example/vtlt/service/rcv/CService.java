package com.example.vtlt.service.rcv;

import org.springframework.stereotype.Service;

@Service
public class CService {
    public void doC() {
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println("CService.doC failed.");
        }
    }
}
