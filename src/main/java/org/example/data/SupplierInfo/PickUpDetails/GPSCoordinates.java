package org.example.data.SupplierInfo.PickUpDetails;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GPSCoordinates")
@XmlAccessorType(XmlAccessType.FIELD)
public class GPSCoordinates {

    @XmlElement(name = "Longitude")
    private float lon;
    @XmlElement(name = "Latitude")
    private float lat;

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }
}
