package com.seavus.talent.WebCalculator;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {


    @RequestMapping(path = "/calculate", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public int index(@RequestParam int firstOperand, @RequestParam String operator, @RequestParam int secondOperand) {
        int result = 0;
        if (operator.equals("+")) {
            result = firstOperand + secondOperand;
        }
        else if (operator.equals("-")) {
            result = firstOperand - secondOperand;
        }
        return result;
    }
}


