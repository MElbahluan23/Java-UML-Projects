public class Country {
    private String code;
    private String name;
    private int population;
    private int capital;

    public Country(String code, String name, int population, int capital) {
        this.code = code;
        this.name = name;
        this.population = population;
        this.capital = capital;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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


    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }
}
