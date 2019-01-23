package api.model.requests.billing;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@ToString
@XmlRootElement(name = "mBilling")
@XmlAccessorType(XmlAccessType.FIELD)
public class BillingRequest<T extends Details> {

    @XmlAttribute(name = "Version")
    private String version;

    @XmlElement(name = "STAN")
    private Long stan;

    @XmlElement(name = "Request")
    private T operationDetails;

}