package com.example.CurrencyCalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyCantroler {

    private final CurrencyService currencyService;

    public CurrencyCantroler(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/")
    public CurrencyModel getCurrencyValue(){
        return currencyService.getCurencyValue();
    }

}
