abstract public class Headphones {
    private String material;
    private String colour;
    private String company;

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getCompany() {
        return company;
    }

    abstract public void wear();
}

