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
 * @author nilad
 */
@Entity
@Table(name = "FLIGHT_DETAILS", catalog = "", schema = "TECHNO")
@NamedQueries({
    @NamedQuery(name = "FlightDetails.findAll", query = "SELECT f FROM FlightDetails f")
    , @NamedQuery(name = "FlightDetails.findById", query = "SELECT f FROM FlightDetails f WHERE f.id = :id")
    , @NamedQuery(name = "FlightDetails.findByFname", query = "SELECT f FROM FlightDetails f WHERE f.fname = :fname")
    , @NamedQuery(name = "FlightDetails.findBySource", query = "SELECT f FROM FlightDetails f WHERE f.source = :source")
    , @NamedQuery(name = "FlightDetails.findByDestination", query = "SELECT f FROM FlightDetails f WHERE f.destination = :destination")
    , @NamedQuery(name = "FlightDetails.findByBoardingDate", query = "SELECT f FROM FlightDetails f WHERE f.boardingDate = :boardingDate")
    , @NamedQuery(name = "FlightDetails.findByArrivalTime", query = "SELECT f FROM FlightDetails f WHERE f.arrivalTime = :arrivalTime")
    , @NamedQuery(name = "FlightDetails.findByDepartureTime", query = "SELECT f FROM FlightDetails f WHERE f.departureTime = :departureTime")
    , @NamedQuery(name = "FlightDetails.findByPrice", query = "SELECT f FROM FlightDetails f WHERE f.price = :price")})
public class FlightDetails implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Short id;
    @Column(name = "FNAME")
    private String fname;
    @Column(name = "SOURCE")
    private String source;
    @Column(name = "DESTINATION")
    private String destination;
    @Column(name = "BOARDING_DATE")
    @Temporal(TemporalType.DATE)
    private Date boardingDate;
    @Column(name = "ARRIVAL_TIME")
    private String arrivalTime;
    @Column(name = "DEPARTURE_TIME")
    private String departureTime;
    @Column(name = "PRICE")
    private Integer price;

    public FlightDetails() {
    }

    public FlightDetails(Short id) {
        this.id = id;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        Short oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        String oldFname = this.fname;
        this.fname = fname;
        changeSupport.firePropertyChange("fname", oldFname, fname);
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        String oldSource = this.source;
        this.source = source;
        changeSupport.firePropertyChange("source", oldSource, source);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        String oldDestination = this.destination;
        this.destination = destination;
        changeSupport.firePropertyChange("destination", oldDestination, destination);
    }

    public Date getBoardingDate() {
        return boardingDate;
    }

    public void setBoardingDate(Date boardingDate) {
        Date oldBoardingDate = this.boardingDate;
        this.boardingDate = boardingDate;
        changeSupport.firePropertyChange("boardingDate", oldBoardingDate, boardingDate);
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        String oldArrivalTime = this.arrivalTime;
        this.arrivalTime = arrivalTime;
        changeSupport.firePropertyChange("arrivalTime", oldArrivalTime, arrivalTime);
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        String oldDepartureTime = this.departureTime;
        this.departureTime = departureTime;
        changeSupport.firePropertyChange("departureTime", oldDepartureTime, departureTime);
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        Integer oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FlightDetails)) {
            return false;
        }
        FlightDetails other = (FlightDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Home.FlightDetails[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
