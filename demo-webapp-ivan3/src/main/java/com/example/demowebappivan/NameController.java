package com.example.demowebappivan;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/esercizio03")
public class NameController {
        @GetMapping(path = "/{name}")
        public String restituisciName(@PathVariable String name) {
            return name;
        }

        @PostMapping(path = "/{name}")
        public String nomeAlContrario(@PathVariable String name) {
            return new StringBuilder(name).reverse().toString();
        }
}