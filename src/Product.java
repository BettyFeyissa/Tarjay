// this should define the data model for a product in our shop.
public class Product {
    // class attributes
    String name;
    String description;
    double price;

    int id;

    // constructor method
    public Product(String name, String description, double price, int id) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.id = id;
    }

    // instance method to print
    public void print(){
        System.out.println(" -- " + this.id + " -- " + this.name + " -- " + this.description +
                " -- " + this.price + " --");

    }
}


