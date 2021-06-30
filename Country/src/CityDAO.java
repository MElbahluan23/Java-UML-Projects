import java.util.List;

public interface CityDAO {

    public List<City> getAllCities();
    public City CreateCity(String [] metadata);
}
