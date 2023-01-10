package com.example.module.support.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SupportService {

    public void hello() {
        log.info("Hello! This is support project.");
    }

}
