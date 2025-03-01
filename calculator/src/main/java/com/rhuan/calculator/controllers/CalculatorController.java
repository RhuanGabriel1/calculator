package com.rhuan.calculator.controllers;

import org.springframework.ui.Model;
import com.rhuan.calculator.models.enums.OperationEnum;
import com.rhuan.calculator.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    public static final String INDEX = "index";

    @Autowired
    CalculatorService calculatorService;

    @GetMapping("/")
    public String showCalculator() {
        return INDEX;
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam double num1,
                            @RequestParam double num2,
                            @RequestParam OperationEnum operation,
                            Model model) {
        double result = calculatorService.calculate(num1, num2, operation);
        model.addAttribute("result", result);
        return INDEX;
    }

}
