package itspace.first_boot.rest.simple.exception.services;

import itspace.first_boot.rest.simple.exception.exceptions.NoMonyException;
import itspace.first_boot.rest.simple.exception.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw  new NoMonyException();
    }
}
