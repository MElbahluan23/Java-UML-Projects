import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class CityDAOCSV implements CityDAO{
    List<City> cities=new ArrayList<>();
    @Override
    public List<City> getAllCities() {
        return cities;
    }

    @Override
    public City CreateCity(String[] metadata) {
        return new City(Integer.parseInt(metadata[0]),metadata[1].strip(),Integer.parseInt(metadata[2]),metadata[3].strip());
    }

    public List<City> readCitiesFromCSV(String filename) throws IOException {
        FileReader r = new FileReader(filename);
        BufferedReader br = new BufferedReader(r);

        String line=br.readLine();
        do{

            if (line!=null){
                String[] city = line.split(",");
                cities.add(CreateCity(city));
            }


            line=br.readLine();

        }while(line!=null);
        return cities;

    }

    public Map<String, List<City>> groupByCode(){
        Map<String, List<City>> citiesPerCode = cities.stream()
                .collect(groupingBy(City::getCountryCode));
        return citiesPerCode;
    }

    public void sortPopForCode(Map<String, List<City>> citiesPerCode) throws IOException {
        InputStreamReader coR = new InputStreamReader(System.in);
        BufferedReader conB = new BufferedReader(coR);
        System.out.println("Enter The Code : ");

        String code =conB.readLine();
        if(citiesPerCode.containsKey(code)){
            List<City> city4code = citiesPerCode.get(code);
            List<City> SortedPyPop =city4code.stream().sorted(Comparator.comparingInt(City::getPopulation)).collect(Collectors.toList());
            SortedPyPop.forEach(System.out::println);
        }
        else {
            System.out.println("Wrong Country Code");
        }
    }
}
