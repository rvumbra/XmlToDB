package org.example.data;

import org.example.data.CarSet.CarSet;
import org.example.data.SupplierInfo.SupplierInfo;
import org.example.data.Suppliers.Suppliers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CarAvailabilityResult")
@XmlAccessorType(XmlAccessType.FIELD)
public class CarAvailabilityResult {
    @XmlElement(name = "ReturnCode")
    private int returnCode;
    @XmlElement(name = "ErrorMessage")
    private String errorMessage;
    @XmlElement(name = "Count")
    private int count;
    @XmlElement(name = "Suppliers")
    private Suppliers suppliers;
    @XmlElement(name = "SupplierInfo")
    private SupplierInfo supplierInfo;
    @XmlElement(name = "CarSet")
    private CarSet carSet;

    public int getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Suppliers getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Suppliers suppliers) {
        this.suppliers = suppliers;
    }

    public SupplierInfo getSupplierInfo() {
        return supplierInfo;
    }

    public void setSupplierInfo(SupplierInfo supplierInfo) {
        this.supplierInfo = supplierInfo;
    }

    public CarSet getCarSet() {
        return carSet;
    }

    public void setCarSet(CarSet carSet) {
        this.carSet = carSet;
    }
}
