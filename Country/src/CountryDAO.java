import java.util.List;

public interface CountryDAO {
    public List<Country> getAllCountries();
    public Country CreateCountry(String [] metadata);
}
