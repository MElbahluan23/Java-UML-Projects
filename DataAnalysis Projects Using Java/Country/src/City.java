public class City {
    private int id;
    private String name;
    private int population;
    private String countryCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }


    public City(int id,String name, int population, String countryCode) {
        this.name = name;
        this.population = population;
        this.countryCode = countryCode;
        this.id = id;
    }

    @Override

    public String toString() {
        return "City {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", countryCode='" + countryCode + '\'' +
                '}'+"\n";
    }
    }
