package com.algaworks.algadelivery.courier.management.domain.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class CourierPayoutService {
    public BigDecimal calculate(Double distanceinKm){
        return new BigDecimal("10")
                .multiply(new BigDecimal(distanceinKm))
                        .setScale(2, RoundingMode.HALF_EVEN);
    }
}
