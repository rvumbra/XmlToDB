package org.example.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Body")
@XmlAccessorType(XmlAccessType.FIELD)
public class CochesXML {
    @XmlElement(name = "CarAvailabilityResponse")
    private CarAvailabilityResponse carAvailabilityReponse;

    public CarAvailabilityResponse getCarAvailabilityReponse() {
        return carAvailabilityReponse;
    }

    public void setCarAvailabilityReponse(CarAvailabilityResponse carAvailabilityReponse) {
        this.carAvailabilityReponse = carAvailabilityReponse;
    }
}
