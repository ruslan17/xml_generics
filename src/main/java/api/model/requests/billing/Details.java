package api.model.requests.billing;

import api.jaxb.DetailsMethodAdapter;
import api.model.requests.billing.account.AccountDetails;
import api.model.requests.billing.payment.PaymentDetails;
import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlJavaTypeAdapter(DetailsMethodAdapter.class)
@XmlSeeAlso({PaymentDetails.class, AccountDetails.class})
public class Details {

    @XmlAttribute(name = "Type")
    private String type;

}