package api.model.requests.billing.account;

import api.model.requests.billing.Details;
import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Request")
public class AccountDetails extends Details {

    @XmlElement(name = "RegNum")
    private String registrationNumber;

}