package com.algaworks.algadelivery.delivery.traking.domain.service;

import com.algaworks.algadelivery.delivery.traking.domain.model.ContactPoint;

public interface DeliveryTimeEstimationService {
    DeliveryEstimate estimate(ContactPoint sender, ContactPoint receiver);
}
