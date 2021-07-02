public class Pyramid implements Comparable<Pyramid>{
    private String pharaoh;
    private String modern_name;
    private String site;
    private double height;

    Pyramid(String pharaoh, String modern_name, String site, double height) {
        this.pharaoh = pharaoh;
        this.modern_name = modern_name;
        this.site = site;
        this.height = height;

    }

    @Override

    public String toString() {
        return "Pyramid{ " +
                "pharaoh='" + pharaoh + '\'' +
                ", modern_name='" + modern_name + '\'' +
                ", site='" + site + '\'' +
                ", height=" + height +
                '}'+"\n";
    }

    public String getPharaoh() {
        return this.pharaoh;
    }

    public void setPharaoh(String pharaoh) {
        this.pharaoh = pharaoh;
    }

    public String getModern_name() {
        return this.modern_name;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public String getSite() {
        return this.site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public int compareTo(Pyramid o) {
        int highDiff = (int) (height-o.getHeight());
        return highDiff;
    }
}
