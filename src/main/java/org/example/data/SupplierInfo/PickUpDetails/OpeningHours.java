package org.example.data.SupplierInfo.PickUpDetails;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OpeningHours")
@XmlAccessorType(XmlAccessType.FIELD)
public class OpeningHours {

    @XmlElement(name = "Mon_Open")
    private String lunesAbrir;
    @XmlElement(name = "Mon_Close")
    private String lunesCerrar;
    @XmlElement(name = "Tue_Open")
    private String martesAbrir;
    @XmlElement(name = "Tue_Close")
    private String martesCerrar;
    @XmlElement(name = "Wed_Open")
    private String miercolesAbrir;
    @XmlElement(name = "Wed_Close")
    private String miercolesCerrar;
    @XmlElement(name = "Thu_Open")
    private String juevesAbrir;
    @XmlElement(name = "Thu_Close")
    private String juevesCerrar;
    @XmlElement(name = "Fri_Open")
    private String viernesAbrir;
    @XmlElement(name = "Fri_Close")
    private String viernesCerrar;
    @XmlElement(name = "Sat_Open")
    private String sabadoAbrir;
    @XmlElement(name = "Sat_Close")
    private String sabadoCerrar;
    @XmlElement(name = "Sun_Open")
    private String domingoAbrir;
    @XmlElement(name = "Sun_Close")
    private String domingoCerrar;

    public String getLunesAbrir() {
        return lunesAbrir;
    }

    public void setLunesAbrir(String lunesAbrir) {
        this.lunesAbrir = lunesAbrir;
    }

    public String getLunesCerrar() {
        return lunesCerrar;
    }

    public void setLunesCerrar(String lunesCerrar) {
        this.lunesCerrar = lunesCerrar;
    }

    public String getMartesAbrir() {
        return martesAbrir;
    }

    public void setMartesAbrir(String martesAbrir) {
        this.martesAbrir = martesAbrir;
    }

    public String getMartesCerrar() {
        return martesCerrar;
    }

    public void setMartesCerrar(String martesCerrar) {
        this.martesCerrar = martesCerrar;
    }

    public String getMiercolesAbrir() {
        return miercolesAbrir;
    }

    public void setMiercolesAbrir(String miercolesAbrir) {
        this.miercolesAbrir = miercolesAbrir;
    }

    public String getMiercolesCerrar() {
        return miercolesCerrar;
    }

    public void setMiercolesCerrar(String miercolesCerrar) {
        this.miercolesCerrar = miercolesCerrar;
    }

    public String getJuevesAbrir() {
        return juevesAbrir;
    }

    public void setJuevesAbrir(String juevesAbrir) {
        this.juevesAbrir = juevesAbrir;
    }

    public String getJuevesCerrar() {
        return juevesCerrar;
    }

    public void setJuevesCerrar(String juevesCerrar) {
        this.juevesCerrar = juevesCerrar;
    }

    public String getViernesAbrir() {
        return viernesAbrir;
    }

    public void setViernesAbrir(String viernesAbrir) {
        this.viernesAbrir = viernesAbrir;
    }

    public String getViernesCerrar() {
        return viernesCerrar;
    }

    public void setViernesCerrar(String viernesCerrar) {
        this.viernesCerrar = viernesCerrar;
    }

    public String getSabadoAbrir() {
        return sabadoAbrir;
    }

    public void setSabadoAbrir(String sabadoAbrir) {
        this.sabadoAbrir = sabadoAbrir;
    }

    public String getSabadoCerrar() {
        return sabadoCerrar;
    }

    public void setSabadoCerrar(String sabadoCerrar) {
        this.sabadoCerrar = sabadoCerrar;
    }

    public String getDomingoAbrir() {
        return domingoAbrir;
    }

    public void setDomingoAbrir(String domingoAbrir) {
        this.domingoAbrir = domingoAbrir;
    }

    public String getDomingoCerrar() {
        return domingoCerrar;
    }

    public void setDomingoCerrar(String domingoCerrar) {
        this.domingoCerrar = domingoCerrar;
    }
}
