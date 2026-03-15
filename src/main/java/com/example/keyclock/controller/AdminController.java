package com.example.keyclock.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @PreAuthorize("hasRole('admin')")
    @GetMapping("/admin")
    public String admin() {
        return "Admin page. Welcome!";
    }
}
