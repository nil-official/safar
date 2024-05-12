package Home;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-23T03:54:37")
@StaticMetamodel(FlightDetails.class)
public class FlightDetails_ { 

    public static volatile SingularAttribute<FlightDetails, String> departureTime;
    public static volatile SingularAttribute<FlightDetails, String> fname;
    public static volatile SingularAttribute<FlightDetails, Date> boardingDate;
    public static volatile SingularAttribute<FlightDetails, String> arrivalTime;
    public static volatile SingularAttribute<FlightDetails, Integer> price;
    public static volatile SingularAttribute<FlightDetails, String> destination;
    public static volatile SingularAttribute<FlightDetails, Short> id;
    public static volatile SingularAttribute<FlightDetails, String> source;

}