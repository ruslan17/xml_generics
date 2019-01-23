package api;

import api.model.requests.billing.BillingRequest;
import api.model.requests.billing.Details;
import api.model.requests.billing.account.AccountDetails;
import api.model.requests.billing.payment.PaymentDetails;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class Main {

    private static final String XML = "<mBilling Version=\"1.3\">\n" +
            "  <STAN>190115</STAN>\n" +
            "  <Request Type=\"payment\">\n" +
            "    <Amount>310.0</Amount>\n" +
            "  </Request>\n" +
            "</mBilling>";

    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(BillingRequest.class);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        BillingRequest req = (BillingRequest) unmarshaller.unmarshal(new StringReader(XML));

        System.out.println(req.getOperationDetails().getClass());

    }

}
