package api.model.requests.billing;

import com.demo_xml_bank_response.model.requests.billing.account.AccountDetails;
import com.demo_xml_bank_response.model.requests.billing.payment.PaymentDetails;
import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({PaymentDetails.class, AccountDetails.class})
public class Details {

    @XmlAttribute(name = "Type")
    private String type;

}