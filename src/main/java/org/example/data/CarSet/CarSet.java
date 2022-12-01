package org.example.data.CarSet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CarSet")
@XmlAccessorType(XmlAccessType.FIELD)
public class CarSet {

    @XmlElement(name = "Car")
    private Car[] cars;

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }
}
