package br.com.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    // http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{a}/{b}")
    public double sum (
            @PathVariable("a") String a,
            @PathVariable("b") String b) {

        return 1D;

    }

    @RequestMapping("/sub")
    public int sub (
            @RequestParam(value="a/b")
            int a, int b) {

        return a - b;

    }

    public int sub (
            @RequestParam(value="a/b")
            int a, int b) {

        return a - b;

    }
}
