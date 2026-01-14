package com.example.NoteProject;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public Response index() {
        return new Response("Hello world!");
    }
}
