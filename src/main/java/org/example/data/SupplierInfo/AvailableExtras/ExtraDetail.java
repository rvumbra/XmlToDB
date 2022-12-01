package org.example.data.SupplierInfo.AvailableExtras;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ExtraDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExtraDetail {

    @XmlElement(name = "Name")
    private String name;
    @XmlElement(name = "SupplierCode")
    private String supplierCode;
    @XmlElement(name = "ExtraID")
    private int extraID;
    @XmlElement(name = "Price")
    private float price;
    @XmlElement(name = "Currency")
    private String currency;
    @XmlElement(name = "Period")
    private String period;
    @XmlElement(name = "MaxAmount")
    private int maxAmount;
    @XmlElement(name = "Information")
    private String information;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public int getExtraID() {
        return extraID;
    }

    public void setExtraID(int extraID) {
        this.extraID = extraID;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(int maxAmount) {
        this.maxAmount = maxAmount;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
