package org.example.data.SupplierInfo;

import org.example.data.SupplierInfo.AvailableExtras.AvailableExtras;
import org.example.data.SupplierInfo.DropOffDetails.DropOffDetails;
import org.example.data.SupplierInfo.Inclusions.Inclusions;
import org.example.data.SupplierInfo.PickUpDetails.PickUpDetails;
import org.example.data.SupplierInfo.TermsAndConditions.TermsAndConditions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Details")
@XmlAccessorType(XmlAccessType.FIELD)
public class Details {

    @XmlElement(name = "Supplier")
    private String supplier;
    @XmlElement(name = "Inclusions")
    private Inclusions inclusions;
    @XmlElement(name = "FuelPolicy")
    private String fuelPolicy;
    @XmlElement(name = "ExcessPolicy")
    private String excessPolicy;
    @XmlElement(name = "PickUpDetails")
    private PickUpDetails pickUpDetails;
    @XmlElement(name = "DropOffDetails")
    private DropOffDetails dropOffDetails;
    @XmlElement(name = "TermsAndConditions")
    private TermsAndConditions termsAndConditions;
    @XmlElement(name = "AvailableExtras")
    private AvailableExtras availableExtras;

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Inclusions getInclusions() {
        return inclusions;
    }

    public void setInclusions(Inclusions inclusions) {
        this.inclusions = inclusions;
    }

    public String getFuelPolicy() {
        return fuelPolicy;
    }

    public void setFuelPolicy(String fuelPolicy) {
        this.fuelPolicy = fuelPolicy;
    }

    public String getExcessPolicy() {
        return excessPolicy;
    }

    public void setExcessPolicy(String excessPolicy) {
        this.excessPolicy = excessPolicy;
    }

    public PickUpDetails getPickUpDetails() {
        return pickUpDetails;
    }

    public void setPickUpDetails(PickUpDetails pickUpDetails) {
        this.pickUpDetails = pickUpDetails;
    }

    public DropOffDetails getDropOffDetails() {
        return dropOffDetails;
    }

    public void setDropOffDetails(DropOffDetails dropOffDetails) {
        this.dropOffDetails = dropOffDetails;
    }

    public TermsAndConditions getTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(TermsAndConditions termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public AvailableExtras getAvailableExtras() {
        return availableExtras;
    }

    public void setAvailableExtras(AvailableExtras availableExtras) {
        this.availableExtras = availableExtras;
    }
}
