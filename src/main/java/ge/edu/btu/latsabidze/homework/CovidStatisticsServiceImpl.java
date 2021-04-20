package ge.edu.btu.latsabidze.homework;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "ge.edu.btu.latsabidze.homework.CovidStatisticsService")
public class CovidStatisticsServiceImpl implements CovidStatisticsService {

    private static List<Covid> data = new ArrayList<>();

    static {
        data.add(new Covid("GEO", 1500, 50, 100));
        data.add(new Covid("USA", 31741301, 567759, 1031506));
        data.add(new Covid("UKR", 151255, 12438, 10152));
        data.add(new Covid("RUS", 13261231, 152384, 901245));
        data.add(new Covid("GER", 560367, 25125, 20932));
    }

    @Override
    public List<Covid> getStatistics() {
        return data;
    }

    @Override
    public Covid getCountryStatistic(String country) {
        for (Covid covid : data) {
            if (covid.getCountry().equalsIgnoreCase(country)) {
                return covid;
            }
        }
        return null;
    }

    @Override
    public Integer getConfirmed(String country) {
        Covid covid = getCountryStatistic(country);
        if (covid != null) {
            return covid.getConfirmed();
        }
        return null;
    }

    @Override
    public Integer getTotalDeath(String country) {
        Covid covid = getCountryStatistic(country);
        if (covid != null) {
            return covid.getDeaths();
        }
        return null;
    }

    @Override
    public Integer getRecovered(String country) {
        Covid covid = getCountryStatistic(country);
        if (covid != null) {
            return covid.getRecovered();
        }
        return null;
    }
}
