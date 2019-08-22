package com.deni.web.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DigestController {

    @GetMapping("/digest")
    public String getDigest() {
        return "Digest";
    }
}
