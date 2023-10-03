package com.example.demo0310;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld() {
        System.out.println("Received request for /hello");
        String response = "Hello, World!";
        System.out.println("Sending response: " + response);
        return response;
    }

    @GetMapping("/reverse")
    public String reverseText(@RequestParam String text) {
        System.out.println("Received request for /reverse with text: " + text);
        StringBuilder sb = new StringBuilder(text);
        String response = sb.reverse().toString();
        System.out.println("Sending response: " + response);
        return response;
    }

    // operation to remove vowels from a given text
    @GetMapping("/remove-vowels")
    public String removeVowels(@RequestParam String text) {
        System.out.println("Received request for /remove-vowels with text: " + text);
        String response = text.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Sending response: " + response);
        return response;
    }

    
}
