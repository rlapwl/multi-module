package com.example.module.core.service;

import com.example.module.support.service.SupportService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class CoreService {

    private final SupportService supportService;

    public void printAll() {
        supportService.hello();
        log.info("Hello!! This is core project.");
    }

}
