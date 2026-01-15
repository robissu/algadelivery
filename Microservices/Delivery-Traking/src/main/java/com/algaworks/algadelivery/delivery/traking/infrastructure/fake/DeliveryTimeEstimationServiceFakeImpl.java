package com.algaworks.algadelivery.delivery.traking.infrastructure.fake;

import com.algaworks.algadelivery.delivery.traking.domain.model.ContactPoint;
import com.algaworks.algadelivery.delivery.traking.domain.service.DeliveryEstimate;
import com.algaworks.algadelivery.delivery.traking.domain.service.DeliveryTimeEstimationService;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
public class DeliveryTimeEstimationServiceFakeImpl implements DeliveryTimeEstimationService {
    @Override
    public DeliveryEstimate estimate(ContactPoint sender, ContactPoint receiver) {
        return new DeliveryEstimate(
                Duration.ofHours(3), 3.1);
    }
}
