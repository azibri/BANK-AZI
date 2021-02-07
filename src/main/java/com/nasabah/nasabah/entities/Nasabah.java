/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasabah.nasabah.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author asus
 */
@Entity
@Table(name = "nasabah")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nasabah.findAll", query = "SELECT n FROM Nasabah n")
    , @NamedQuery(name = "Nasabah.findByNasabahId", query = "SELECT n FROM Nasabah n WHERE n.nasabahId = :nasabahId")
    , @NamedQuery(name = "Nasabah.findByNasabahNama", query = "SELECT n FROM Nasabah n WHERE n.nasabahNama = :nasabahNama")
    , @NamedQuery(name = "Nasabah.findByNasabahAlamat", query = "SELECT n FROM Nasabah n WHERE n.nasabahAlamat = :nasabahAlamat")
    , @NamedQuery(name = "Nasabah.findByNasabahTempatlahir", query = "SELECT n FROM Nasabah n WHERE n.nasabahTempatlahir = :nasabahTempatlahir")
    , @NamedQuery(name = "Nasabah.findByNasabahTanggallahir", query = "SELECT n FROM Nasabah n WHERE n.nasabahTanggallahir = :nasabahTanggallahir")
    , @NamedQuery(name = "Nasabah.findByNasabahNoktp", query = "SELECT n FROM Nasabah n WHERE n.nasabahNoktp = :nasabahNoktp")
    , @NamedQuery(name = "Nasabah.findByNasabahNohandphone", query = "SELECT n FROM Nasabah n WHERE n.nasabahNohandphone = :nasabahNohandphone")
    , @NamedQuery(name = "Nasabah.findByNasabahEmail", query = "SELECT n FROM Nasabah n WHERE n.nasabahEmail = :nasabahEmail")})
public class Nasabah implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "nasabah_id")
    private Integer nasabahId;
    @Basic(optional = false)
//    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nasabah_nama")
    private String nasabahNama;
    @Basic(optional = false)
//    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nasabah_alamat")
    private String nasabahAlamat;
    @Basic(optional = false)
//    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nasabah_tempatlahir")
    private String nasabahTempatlahir;
    @Basic(optional = false)
//    @NotNull
    @Column(name = "nasabah_tanggallahir")
    @Temporal(TemporalType.DATE)
    private Date nasabahTanggallahir;
    @Basic(optional = false)
//    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "nasabah_noktp")
    private String nasabahNoktp;
    @Basic(optional = false)
//    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "nasabah_nohandphone")
    private String nasabahNohandphone;
    @Basic(optional = false)
//    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nasabah_email")
    private String nasabahEmail;

    public Nasabah() {
    }

    public Nasabah(Integer nasabahId) {
        this.nasabahId = nasabahId;
    }

    public Nasabah(Integer nasabahId, String nasabahNama, String nasabahAlamat, String nasabahTempatlahir, Date nasabahTanggallahir, String nasabahNoktp, String nasabahNohandphone, String nasabahEmail) {
        this.nasabahId = nasabahId;
        this.nasabahNama = nasabahNama;
        this.nasabahAlamat = nasabahAlamat;
        this.nasabahTempatlahir = nasabahTempatlahir;
        this.nasabahTanggallahir = nasabahTanggallahir;
        this.nasabahNoktp = nasabahNoktp;
        this.nasabahNohandphone = nasabahNohandphone;
        this.nasabahEmail = nasabahEmail;
    }

    public Integer getNasabahId() {
        return nasabahId;
    }

    public void setNasabahId(Integer nasabahId) {
        this.nasabahId = nasabahId;
    }

    public String getNasabahNama() {
        return nasabahNama;
    }

    public void setNasabahNama(String nasabahNama) {
        this.nasabahNama = nasabahNama;
    }

    public String getNasabahAlamat() {
        return nasabahAlamat;
    }

    public void setNasabahAlamat(String nasabahAlamat) {
        this.nasabahAlamat = nasabahAlamat;
    }

    public String getNasabahTempatlahir() {
        return nasabahTempatlahir;
    }

    public void setNasabahTempatlahir(String nasabahTempatlahir) {
        this.nasabahTempatlahir = nasabahTempatlahir;
    }

    public Date getNasabahTanggallahir() {
        return nasabahTanggallahir;
    }

    public void setNasabahTanggallahir(Date nasabahTanggallahir) {
        this.nasabahTanggallahir = nasabahTanggallahir;
    }

    public String getNasabahNoktp() {
        return nasabahNoktp;
    }

    public void setNasabahNoktp(String nasabahNoktp) {
        this.nasabahNoktp = nasabahNoktp;
    }

    public String getNasabahNohandphone() {
        return nasabahNohandphone;
    }

    public void setNasabahNohandphone(String nasabahNohandphone) {
        this.nasabahNohandphone = nasabahNohandphone;
    }

    public String getNasabahEmail() {
        return nasabahEmail;
    }

    public void setNasabahEmail(String nasabahEmail) {
        this.nasabahEmail = nasabahEmail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nasabahId != null ? nasabahId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nasabah)) {
            return false;
        }
        Nasabah other = (Nasabah) object;
        if ((this.nasabahId == null && other.nasabahId != null) || (this.nasabahId != null && !this.nasabahId.equals(other.nasabahId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nasabah.nasabah.entities.Nasabah[ nasabahId=" + nasabahId + " ]";
    }
    
}
