package org.example.data.SupplierInfo.TermsAndConditions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TermsAndConditions")
@XmlAccessorType(XmlAccessType.FIELD)
public class TermsAndConditions {

    @XmlElement(name = "TandCs")
    private TandCs[] tandCsList;

    public TandCs[] getTandCsList() {
        return tandCsList;
    }

    public void setTandCsList(TandCs[] tandCsList) {
        this.tandCsList = tandCsList;
    }
}
