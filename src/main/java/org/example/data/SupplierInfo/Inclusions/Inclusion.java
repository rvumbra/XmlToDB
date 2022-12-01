package org.example.data.SupplierInfo.Inclusions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Inclusions")
@XmlAccessorType(XmlAccessType.FIELD)
public class Inclusion {

    @XmlElement(name = "Product")
    private String product;
    @XmlElement(name = "Inclusion")
    private String inclusion;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getInclusion() {
        return inclusion;
    }

    public void setInclusion(String inclusion) {
        this.inclusion = inclusion;
    }
}
