package lab3;

public class Coffee {

    private int id;
    private String name;
    private String taste;
    private double cost;

    public Coffee(int initialId, String initialName, String initialTaste, double initialcost) {

        this.id = initialId;
        this.name = initialName;
        this.taste = initialTaste;
        this.cost = initialcost;
    }

    public String getName() {

        return this.name;
    }

    public String getTaste() {

        return this.taste;
    }

    public int getId() {

        return this.id;
    }

    public double getCost() {

        return this.cost;
    }

    public String toString() {

        return "Coffee id: " + this.id + "\ttaste: " + this.taste + "\tname: " + this.name + "\tcost: " + this.cost
                + "\r\n";
    }
}
