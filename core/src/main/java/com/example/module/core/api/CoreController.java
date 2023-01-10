package com.example.module.core.api;

import com.example.module.core.service.CoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CoreController {

    private final CoreService coreService;

    @GetMapping("/hello-core")
    public ResponseEntity<?> printAll() {
        coreService.printAll();
        return ResponseEntity.noContent().build();
    }

}
