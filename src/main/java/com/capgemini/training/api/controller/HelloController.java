package com.capgemini.training.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class HelloController {

  @GetMapping(value = "/hello")
  public ResponseEntity<String> getCustomerDetails() {
    return ResponseEntity.ok("HELLOW WORLD");
  }
}
