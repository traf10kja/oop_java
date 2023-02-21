package hw_1;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VendingMachine {
    protected List<Product> localList = new ArrayList();
    private double cash;

    public VendingMachine() {
    }

    public List<Product> getLocalList() {
        return this.localList;
    }

    public VendingMachine addProduct(Product inputProduct) {
        this.localList.add(inputProduct);
        inputProduct.setLoadDate(Date.valueOf(LocalDate.now()));
        return this;
    }

    public String toString() {
        StringBuilder localString = new StringBuilder();
        Iterator var2 = this.localList.iterator();

        while(var2.hasNext()) {
            Product product = (Product)var2.next();
            localString.append(product.toString());
            localString.append("\n");
        }

        localString.append(this.cash + "\n");
        return localString.toString();
    }

    public List<Product> findProduct(String name) {
        List<Product> foundProduct = new ArrayList();
        Iterator var3 = this.localList.iterator();

        while(var3.hasNext()) {
            Product product = (Product)var3.next();
            if (product.getName().contains(name)) {
                foundProduct.add(product);
            }
        }

        return foundProduct;
    }

    public Product sellProduct(Product sallingProduct) {
        Product sellProduct = new Product();
        if (this.localList.contains(sallingProduct)) {
            for(int i = 0; i < this.localList.size(); ++i) {
                if (this.localList.get(i) == sallingProduct) {
                    sellProduct = (Product)this.localList.get(i);
                    this.localList.remove(i);
                    this.cash += sellProduct.getCost();
                    return sellProduct;
                }
            }
        }

        return sellProduct;
    }
}