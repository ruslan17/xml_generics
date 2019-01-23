package api.controller;

import api.model.requests.billing.BillingRequest;
import api.model.requests.billing.payment.PaymentDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @PostMapping("/payment")
    public void payment(@RequestBody BillingRequest<PaymentDetails> response) {
        System.out.println(response);
    }

}