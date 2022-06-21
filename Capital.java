public class Capital {
    String name;
    float population;
    float squareMileage;

    public Capital(){

    }

    public Capital(String name, float population, float squareMileage){
        this.name = name;
        this.population = population;
        this.squareMileage = squareMileage;
    }

    // Method
    @Override
    public String toString() {
        return this.name + " | Pop: " + this.population + " | Area: " + this.squareMileage + " sq mi";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public float getSquareMileage() {
        return squareMileage;
    }

    public void setSquareMileage(int squareMileage) {
        this.squareMileage = squareMileage;
    }
}
