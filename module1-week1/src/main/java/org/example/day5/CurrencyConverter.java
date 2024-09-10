package org.example.day5;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private final Map<String, Double> exchangeRates = new HashMap<>();

    // consider to set predefined exchange rates
    public CurrencyConverter() {
        exchangeRates.put("USD_TO_EUR", 0.92);
        exchangeRates.put("EUR_TO_USD", 0.64);
        exchangeRates.put("USD_TO_GBP", 0.79);
        exchangeRates.put("USD_TO_JPY", 147.65);
    }

    // method to convert currency
    public double convertCurrency(double amount, String sourceCurrency, String targetCurrency) {
        String key = sourceCurrency + "_TO_" + targetCurrency;
        if (exchangeRates.containsKey(key)) {
            return amount * exchangeRates.get(key);
        } else {
            System.out.println("Conversion rate not available.");
            return -1;
        }
    }
}
