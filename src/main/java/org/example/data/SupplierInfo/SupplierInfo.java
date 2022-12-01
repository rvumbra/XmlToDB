package org.example.data.SupplierInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SupplierInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class SupplierInfo {

    @XmlElement(name = "Details")
    private Details[] details;

    public Details[] getDetails() {
        return details;
    }

    public void setDetails(Details[] details) {
        this.details = details;
    }
}
