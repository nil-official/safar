/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;



/**
 *
 * @author mohit
 */
@Entity
@Table(name = "HOTEL", catalog = "", schema = "TECHNO")
@NamedQueries({
    @NamedQuery(name = "Hotel.findAll", query = "SELECT h FROM Hotel h")
    , @NamedQuery(name = "Hotel.findByHid", query = "SELECT h FROM Hotel h WHERE h.hid = :hid")
    , @NamedQuery(name = "Hotel.findByHname", query = "SELECT h FROM Hotel h WHERE h.hname = :hname")
    , @NamedQuery(name = "Hotel.findByDt", query = "SELECT h FROM Hotel h WHERE h.dt = :dt")
    , @NamedQuery(name = "Hotel.findByRatings", query = "SELECT h FROM Hotel h WHERE h.ratings = :ratings")
    , @NamedQuery(name = "Hotel.findByTag", query = "SELECT h FROM Hotel h WHERE h.tag = :tag")
    , @NamedQuery(name = "Hotel.findByBreakfast", query = "SELECT h FROM Hotel h WHERE h.breakfast = :breakfast")
    , @NamedQuery(name = "Hotel.findByDescription", query = "SELECT h FROM Hotel h WHERE h.description = :description")
    , @NamedQuery(name = "Hotel.findByRent", query = "SELECT h FROM Hotel h WHERE h.rent = :rent")})
@SuppressWarnings("IdDefinedInHierarchy")
public class Hotel implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HID")
    private Integer hid;
    @Column(name = "HNAME")
    private String hname;
    @Column(name = "DT")
    @Temporal(TemporalType.DATE)
    private Date dt;
    @Column(name = "RATINGS")
    private String ratings;
    @Column(name = "TAG")
    private String tag;
    @Column(name = "BREAKFAST")
    private String breakfast;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "RENT")
    private Integer rent;

    public Hotel() {
    }

    public Hotel(Integer hid) {
        this.hid = hid;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        Integer oldHid = this.hid;
        this.hid = hid;
        changeSupport.firePropertyChange("hid", oldHid, hid);
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        String oldHname = this.hname;
        this.hname = hname;
        changeSupport.firePropertyChange("hname", oldHname, hname);
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        Date oldDt = this.dt;
        this.dt = dt;
        changeSupport.firePropertyChange("dt", oldDt, dt);
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        String oldRatings = this.ratings;
        this.ratings = ratings;
        changeSupport.firePropertyChange("ratings", oldRatings, ratings);
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        String oldTag = this.tag;
        this.tag = tag;
        changeSupport.firePropertyChange("tag", oldTag, tag);
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        String oldBreakfast = this.breakfast;
        this.breakfast = breakfast;
        changeSupport.firePropertyChange("breakfast", oldBreakfast, breakfast);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        String oldDescription = this.description;
        this.description = description;
        changeSupport.firePropertyChange("description", oldDescription, description);
    }

    public Integer getRent() {
        return rent;
    }

    public void setRent(Integer rent) {
        Integer oldRent = this.rent;
        this.rent = rent;
        changeSupport.firePropertyChange("rent", oldRent, rent);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hid != null ? hid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hotel)) {
            return false;
        }
        Hotel other = (Hotel) object;
        if ((this.hid == null && other.hid != null) || (this.hid != null && !this.hid.equals(other.hid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Home.Hotel[ hid=" + hid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
