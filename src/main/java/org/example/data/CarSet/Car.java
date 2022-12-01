package org.example.data.CarSet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Car")
@XmlAccessorType(XmlAccessType.FIELD)
public class Car {

    @XmlElement(name = "Status")
    private String status;
    @XmlElement(name = "Category")
    private int category;
    @XmlElement(name = "Size")
    private int size;
    @XmlElement(name = "Name")
    private String name;
    @XmlElement(name = "Code")
    private String code;
    @XmlElement(name = "URL")
    private String url;
    @XmlElement(name = "Luggage")
    private int luggage;
    @XmlElement(name = "Passengers")
    private int passengers;
    @XmlElement(name = "Doors")
    private int doors;
    @XmlElement(name = "Currency")
    private String currency;
    @XmlElement(name = "TotalCharge")
    private float totalCharge;
    @XmlElement(name = "Costs")
    private Costs costs;
    @XmlElement(name = "RateQualifier")
    private String rateQualifier;
    @XmlElement(name = "IsAirCon")
    private String isAirCon;
    @XmlElement(name = "IsAutomatic")
    private String isAutomatic;
    @XmlElement(name = "CarType")
    private String carType;
    @XmlElement(name = "CarDescription")
    private String carDescription;
    @XmlElement(name = "SupplierCode")
    private String supplierCode;
    @XmlElement(name = "Supplier")
    private String supplier;
    @XmlElement(name = "DropCharge")
    private int dropCharge;
    @XmlElement(name = "DropChargeCurrency")
    private String dropChargeCurrency;
    @XmlElement(name = "ERP")
    private int erp;
    @XmlElement(name = "Information")
    private Information information;

    public String getStatus() {
        return status;
    }

    public int getCategory() {
        return category;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getUrl() {
        return url;
    }

    public int getLuggage() {
        return luggage;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getDoors() {
        return doors;
    }

    public String getCurrency() {
        return currency;
    }

    public float getTotalCharge() {
        return totalCharge;
    }

    public Costs getCosts() {
        return costs;
    }

    public String getRateQualifier() {
        return rateQualifier;
    }

    public String getIsAirCon() {
        return isAirCon;
    }

    public String getIsAutomatic() {
        return isAutomatic;
    }

    public String getCarType() {
        return carType;
    }

    public String getCarDescription() {
        return carDescription;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public String getSupplier() {
        return supplier;
    }

    public int getDropCharge() {
        return dropCharge;
    }

    public String getDropChargeCurrency() {
        return dropChargeCurrency;
    }

    public int getErp() {
        return erp;
    }

    public Information getInformation() {
        return information;
    }
}
