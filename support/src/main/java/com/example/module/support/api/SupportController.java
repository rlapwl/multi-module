package com.example.module.support.api;

import com.example.module.support.service.SupportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class SupportController {

    private final SupportService supportService;

    @GetMapping("/hello")
    public ResponseEntity<?> getHello() {
        supportService.hello();
        return ResponseEntity.noContent().build();
    }

}
