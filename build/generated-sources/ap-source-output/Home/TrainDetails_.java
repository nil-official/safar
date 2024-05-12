package Home;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-11-23T03:54:37")
@StaticMetamodel(TrainDetails.class)
public class TrainDetails_ { 

    public static volatile SingularAttribute<TrainDetails, String> departureTime;
    public static volatile SingularAttribute<TrainDetails, Integer> fare;
    public static volatile SingularAttribute<TrainDetails, Date> boardingDate;
    public static volatile SingularAttribute<TrainDetails, String> arrivalTime;
    public static volatile SingularAttribute<TrainDetails, String> destination;
    public static volatile SingularAttribute<TrainDetails, String> tname;
    public static volatile SingularAttribute<TrainDetails, Short> id;
    public static volatile SingularAttribute<TrainDetails, String> source;

}