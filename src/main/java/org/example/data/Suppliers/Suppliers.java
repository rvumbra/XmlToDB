package org.example.data.Suppliers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Suppliers")
@XmlAccessorType(XmlAccessType.FIELD)
public class Suppliers {

    @XmlElement(name = "Suppliers")
    private Supplier[] supplier;

    public Supplier[] getSuppliers() {
        return supplier;
    }

    public void setSuppliers(Supplier[] suppliers) {
        supplier = suppliers;
    }
}
