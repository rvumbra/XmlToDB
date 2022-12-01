package org.example.data;

import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CarAvailabilityResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class CarAvailabilityResponse {

    @XmlElement(name = "CarAvailabilityResult")
    private CarAvailabilityResult carAvailabilityResult;

    public CarAvailabilityResult getCarAvailabilityResult() {
        return carAvailabilityResult;
    }

    public void setCarAvailabilityResult(CarAvailabilityResult carAvailabilityResult) {
        this.carAvailabilityResult = carAvailabilityResult;
    }
}
