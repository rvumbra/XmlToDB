package org.example.data.SupplierInfo.Inclusions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Inclusions")
@XmlAccessorType(XmlAccessType.FIELD)
public class Inclusions {

    @XmlElement(name = "Inclusions")
    private Inclusion inclusions;

    public Inclusion getInclusions() {
        return inclusions;
    }

    public void setInclusionList(Inclusion inclusions) {
        this.inclusions = inclusions;
    }
}
