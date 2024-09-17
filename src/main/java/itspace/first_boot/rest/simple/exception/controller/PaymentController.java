package itspace.first_boot.rest.simple.exception.controller;

import itspace.first_boot.rest.simple.exception.exceptions.NoMonyException;
import itspace.first_boot.rest.simple.exception.model.ErrorDetails;
import itspace.first_boot.rest.simple.exception.model.PaymentDetails;
import itspace.first_boot.rest.simple.exception.services.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController {

//    private final PaymentService paymentService;
//
//    public PaymentController(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    private  static Logger log = Logger.getLogger(PaymentController.class.getName());

    @GetMapping("/payment")
    public ResponseEntity<PaymentDetails>makePayment(@RequestBody PaymentDetails paymentDetails){

           // PaymentDetails paymentDetails = paymentService.processPayment();
            log.info("Making payment details " + paymentDetails.getAmount());
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);

    }
}
