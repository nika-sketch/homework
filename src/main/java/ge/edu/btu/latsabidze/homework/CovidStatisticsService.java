package ge.edu.btu.latsabidze.homework;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@WebService(name = "CovidStatisticsService", targetNamespace = CovidStatisticsService.NAMESPACE)
public interface CovidStatisticsService {

    String NAMESPACE = "http://btu.edu.ge";

    @WebMethod
    List<Covid> getStatistics();

    @WebMethod
    Covid getCountryStatistic(String country);

    @WebMethod
    Integer getConfirmed(String country);

    @WebMethod
    Integer getTotalDeath(String country);

    @WebMethod
    Integer getRecovered(String country);
}
