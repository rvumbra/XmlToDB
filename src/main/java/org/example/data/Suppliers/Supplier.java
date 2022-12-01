package org.example.data.Suppliers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Suppliers")
@XmlAccessorType(XmlAccessType.FIELD)
public class Supplier {
    @XmlElement(name = "Supplier")
    private String supplierName;
    @XmlElement(name = "Status")
    private String status;
    @XmlElement(name = "Count")
    private int count;

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
