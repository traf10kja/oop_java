package hw_1;

import java.util.Date;

public class Product {
    private String name;
    private double cost;
    private Date loadDate;

    public Product(String name, double cost) {
        this.loadDate = new Date();
        this.name = name;
        this.cost = cost;
    }

    public Product() {
        this("0", 0.0);
    }

    public void setLoadDate(Date loadDate) {
        this.loadDate = loadDate;
    }

    public String toString() {
        return String.format("наименование %s цена %f дата загрузки %s", this.name, this.cost, this.loadDate.toString());
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }

    public boolean equals(Object obj) {
        return this.name.equals(((Product)obj).name) && this.cost == ((Product)obj).cost;
    }

    public int hashCode() {
        return this.name.hashCode() + (int)this.cost;
    }
}
