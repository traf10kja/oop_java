package hw_1;

public class Chocolate extends Product {

    private int percentOfChocolate;

    public Chocolate(String name, double cost, int percentOfChocolate) {
        super(name, cost);
        this.percentOfChocolate = percentOfChocolate;
    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format(" процент Какао %s", this.percentOfChocolate));
        return localString.toString();
    }
}
