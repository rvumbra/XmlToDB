package org.example.data.SupplierInfo.AvailableExtras;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AvailableExtras")
@XmlAccessorType(XmlAccessType.FIELD)
public class AvailableExtras {

    @XmlElement(name = "ExtraDetails")
    private ExtraDetail[] extraDetails;

    public ExtraDetail[] getExtraDetails() {
        return extraDetails;
    }

    public void setExtraDetails(ExtraDetail[] extraDetails) {
        this.extraDetails = extraDetails;
    }
}
