package com.example.vtlt.controller;

import com.example.vtlt.service.rcv.AService;
import com.example.vtlt.service.rcv.BService;
import com.example.vtlt.service.rcv.CService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rcv")
@RequiredArgsConstructor
public class LoadReceiveController {
    private final AService aService;
    private final BService bService;
    private final CService cService;

    @RequestMapping("/inOrder")
    public ResponseEntity<String> inOrder(){
        aService.doA();
        bService.doB();
        cService.doC();
        return null;
    }
}
