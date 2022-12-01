package org.example.data.SupplierInfo.TermsAndConditions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TandCs")
@XmlAccessorType(XmlAccessType.FIELD)
public class TandCs {

    @XmlElement(name = "Header")
    private String header;
    @XmlElement(name = "Paragraph")
    private String paragraph;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }
}
