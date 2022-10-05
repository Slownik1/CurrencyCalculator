package com.example.CurrencyCalculator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class CurrencyService {

    private RestTemplate restTemplate = new RestTemplate();

    public CurrencyService getCurencyValue(){

        String response = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/A/CHF/", String.class);
        log.info(response);
        return null;

    }

}
