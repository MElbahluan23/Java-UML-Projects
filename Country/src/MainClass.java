import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class MainClass {
    public static void main(String[] arg) throws IOException {
        CityDAOCSV citydao = new CityDAOCSV();
        List <City> cities = citydao.readCitiesFromCSV("E:\\Cities.csv");

        Map<String, List<City>> citiesPerCode = citydao.groupByCode();

        for (Map.Entry<String, List<City>> entry : citiesPerCode.entrySet()) {
            System.out.println(entry.getKey() + ":\n" + entry.getValue().toString());
        }

        citydao.sortPopForCode(citiesPerCode);

        System.out.println("-----------------------------------------------------------");
        CountiresDAOCSV countryDao = new CountiresDAOCSV();
        List <Country> countries = countryDao.readCountriesFromCSV("E:\\Countries.csv");

        List <Integer> pops = countryDao.getAllPopulation();
        System.out.println("All countries Population:\n"+pops);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Average ->> "+pops.stream()
                .mapToDouble(Integer::intValue).average().getAsDouble());

        System.out.println("Max ->> "+pops.stream()
                .mapToDouble(Integer::intValue).max().getAsDouble());
        System.out.println("-----------------------------------------------------------");

        Map<String, Optional<City>> highestPop = cities.stream()
                .collect(groupingBy(City::getCountryCode,Collectors.maxBy(Comparator.comparing(City::getPopulation))));
        System.out.println("Highest Population cites:\n"+highestPop);


        System.out.println("-----------------------------------------------------------");
        List <Integer> capsID = countryDao.getAllCapitals();
        List<City> caps = cities.stream().filter(x -> capsID.contains(x.getId())).collect(Collectors.toList());
        List<City> capsSorted =caps.stream().sorted(Comparator.comparingInt(City::getPopulation)).collect(Collectors.toList());
        System.out.println("Max Capital Population->> "+capsSorted.get(capsSorted.size()-1));

        //System.out.println("Max Capital Population->> "+caps.stream().mapToDouble(City::getPopulation).max().getAsDouble());




    }
}
