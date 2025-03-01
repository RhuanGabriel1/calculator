package com.rhuan.calculator.services;

import com.rhuan.calculator.models.enums.OperationEnum;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CalculatorService {

    public double calculate(double num1, double num2, OperationEnum operationEnum){
        return  switch (operationEnum){
            case SUM -> num1 + num2;
            case SUBTRACT -> num1 - num2;
            case MULTIPLY -> num1 * num2;
            case DIVIDE -> num1 / num2;
        };
    }
}
