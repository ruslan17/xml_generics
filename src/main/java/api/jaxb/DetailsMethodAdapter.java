package api.jaxb;

import api.model.requests.billing.Details;
import api.model.requests.billing.account.AccountDetails;
import api.model.requests.billing.payment.PaymentDetails;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.math.BigDecimal;
import java.util.Objects;

import static java.util.Objects.isNull;

public class DetailsMethodAdapter extends XmlAdapter<DetailsMethodAdapter.DetailsAdaptor, Details> {


    @Override
    public Details unmarshal(DetailsAdaptor v) throws Exception {
        if(isNull(v)) {
            return null;
        }
        Details details = null;

        if(Objects.equals(v.type, "payment")) {
            PaymentDetails paymentDetails = new PaymentDetails();
            paymentDetails.setType(v.type);
            paymentDetails.setAmount(v.amount);
            details = paymentDetails;
        } else if(Objects.equals(v.type, "account")) {
            AccountDetails accountDetails = new AccountDetails();
            accountDetails.setType(v.type);
            accountDetails.setRegistrationNumber(v.registrationNumber);
            details = accountDetails;
        }

        return details;
    }

    @Override
    public DetailsAdaptor marshal(Details v) throws Exception {
        if(isNull(v)) {
            return null;
        }
        DetailsAdaptor detailsAdaptor = new DetailsAdaptor();
        detailsAdaptor.type = v.getType();
        if(v instanceof PaymentDetails) {
            PaymentDetails paymentDetails = (PaymentDetails) v;
            detailsAdaptor.amount = paymentDetails.getAmount();
        } else if(v instanceof AccountDetails) {
            AccountDetails accountDetails = (AccountDetails) v;
            detailsAdaptor.registrationNumber = accountDetails.getRegistrationNumber();
        }
        return detailsAdaptor;
    }

    public static class DetailsAdaptor {
        @XmlAttribute(name = "Type")
        public String type;
        @XmlElement(name = "RegNum")
        public String registrationNumber;
        @XmlElement(name = "Amount")
        public BigDecimal amount;

        /**
         * Add all your fields from subclasses
         */
    }

}
