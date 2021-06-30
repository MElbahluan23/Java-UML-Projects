import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountiresDAOCSV implements CountryDAO{
    List<Country> countires = new ArrayList<>();

    @Override
    public List<Country> getAllCountries() {
        return countires;
    }

    @Override
    public Country CreateCountry(String[] metadata) {
        return new Country(metadata[0],metadata[1],Integer.parseInt(metadata[3]),Integer.parseInt(metadata[6]));
    }

    public List<Country> readCountriesFromCSV(String filename) throws IOException {
        FileReader r = new FileReader(filename);
        BufferedReader br = new BufferedReader(r);

        String line=br.readLine();
        do{
            if (line!=null){
                String[] country = line.split(",");
                countires.add(CreateCountry(country));
            }
            line=br.readLine();

        }while(line!=null);
        return countires;
    }

    public List<Integer> getAllPopulation(){
        return countires.stream()
                .map(Country::getPopulation)
                .collect(Collectors.toList());
    }

    public List<Integer> getAllCapitals(){
        return countires.stream()
                .map(Country::getCapital)
                .collect(Collectors.toList());
    }
}
