package org.example.data.SupplierInfo.PickUpDetails;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PickUpDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class PickUpDetails {

    @XmlElement(name = "GPSCoordinates")
    private GPSCoordinates gpsCoordinate;
    @XmlElement(name = "LocationType")
    private String locationType;
    @XmlElement(name = "LocationInformation")
    private String locationInformation;
    @XmlElement(name = "Address1")
    private String address1;
    @XmlElement(name = "Address2")
    private String address2;
    @XmlElement(name = "Address3")
    private String address3;
    @XmlElement(name = "City")
    private String city;
    @XmlElement(name = "ZipCode")
    private int codPostal;
    @XmlElement(name = "PhoneNo")
    private String phone;
    @XmlElement(name = "OpeningHours")
    private OpeningHours openingHours;

    public GPSCoordinates getGpsCoordinate() {
        return gpsCoordinate;
    }

    public void setGpsCoordinate(GPSCoordinates gpsCoordinate) {
        this.gpsCoordinate = gpsCoordinate;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getLocationInformation() {
        return locationInformation;
    }

    public void setLocationInformation(String locationInformation) {
        this.locationInformation = locationInformation;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public OpeningHours getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(OpeningHours openingHours) {
        this.openingHours = openingHours;
    }
}
