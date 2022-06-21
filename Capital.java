public class Capital {
    String name;
    int population;
    int squareMileage;

    public Capital(){

    }

    public Capital(String name, int population, int squareMileage){
        this.name = name;
        this.population = population;
        this.squareMileage = squareMileage;
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

    public int getSquareMileage() {
        return squareMileage;
    }

    public void setSquareMileage(int squareMileage) {
        this.squareMileage = squareMileage;
    }
}
