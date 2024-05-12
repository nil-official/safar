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
@Table(name = "TRAIN_DETAILS", catalog = "", schema = "TECHNO")
@NamedQueries({
    @NamedQuery(name = "TrainDetails.findAll", query = "SELECT t FROM TrainDetails t")
    , @NamedQuery(name = "TrainDetails.findById", query = "SELECT t FROM TrainDetails t WHERE t.id = :id")
    , @NamedQuery(name = "TrainDetails.findByTname", query = "SELECT t FROM TrainDetails t WHERE t.tname = :tname")
    , @NamedQuery(name = "TrainDetails.findBySource", query = "SELECT t FROM TrainDetails t WHERE t.source = :source")
    , @NamedQuery(name = "TrainDetails.findByDestination", query = "SELECT t FROM TrainDetails t WHERE t.destination = :destination")
    , @NamedQuery(name = "TrainDetails.findByBoardingDate", query = "SELECT t FROM TrainDetails t WHERE t.boardingDate = :boardingDate")
    , @NamedQuery(name = "TrainDetails.findByArrivalTime", query = "SELECT t FROM TrainDetails t WHERE t.arrivalTime = :arrivalTime")
    , @NamedQuery(name = "TrainDetails.findByDepartureTime", query = "SELECT t FROM TrainDetails t WHERE t.departureTime = :departureTime")
    , @NamedQuery(name = "TrainDetails.findByFare", query = "SELECT t FROM TrainDetails t WHERE t.fare = :fare")})
public class TrainDetails implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Short id;
    @Column(name = "TNAME")
    private String tname;
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
    @Column(name = "FARE")
    private Integer fare;

    public TrainDetails() {
    }

    public TrainDetails(Short id) {
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

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        String oldTname = this.tname;
        this.tname = tname;
        changeSupport.firePropertyChange("tname", oldTname, tname);
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

    public Integer getFare() {
        return fare;
    }

    public void setFare(Integer fare) {
        Integer oldFare = this.fare;
        this.fare = fare;
        changeSupport.firePropertyChange("fare", oldFare, fare);
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
        if (!(object instanceof TrainDetails)) {
            return false;
        }
        TrainDetails other = (TrainDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Home.TrainDetails[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
