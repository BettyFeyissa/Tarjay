import java.util.ArrayList;
import java.util.Scanner;
// this class manages our Product objects
public class Shop {
    // class attribute
    ArrayList<Product> products;
    Scanner scan = new Scanner(System.in);

    // constructor method
    public Shop() {
        // initializing an empty ArrayList
        this.products = new ArrayList<Product>();
    }

    // instance method to print
    public void printProducts() {
        System.out.println("Here are our products ");
        for (Product product : this.products) {
            // calling the print method from the product instance
            product.print();

        }

    }

    //instance method to create

    public void createProduct() {
        // step 1: is to gather the necessary information to create a product "name,description,price"
        System.out.println("what is the name of your product? ");
        String name = scan.nextLine();

        System.out.println("what is the description? ");
        String description = scan.nextLine();

        System.out.println("what is the price? ");
        double price = scan.nextDouble();
        scan.nextLine(); // todo: Refactor

        System.out.println("what is the id? ");
        int id = scan.nextInt();
        scan.nextLine(); // todo: Refactorø


        // step 2: create a new instance of a Product
        Product product = new Product(name, description, price, id);


        // step 3: add the new product to our list.
        this.products.add(product);

        // step 4: print the products
        this.printProducts();

    }

    //instance method for updating a product
    public void updateProduct() {
        //todo : handle update option
        this.printProducts();
        System.out.println("what is the id of the product you want to update? ");
        int id = Integer.parseInt(scan.nextLine());
        //
        // Product productToUpdate;

        //step 1: find the item
        for (Product productToUpdate : this.products) {
            if (productToUpdate.id == id) {
                //todo: update this product
                // productToUpdate = p;
                System.out.println("What is the new name of the product? ");
                productToUpdate.name = scan.nextLine();
                System.out.println("What is the new description?");
                productToUpdate.description = scan.nextLine();
                System.out.println("What is the new price? ");
                productToUpdate.price = Double.parseDouble(scan.nextLine());
                System.out.println("What is the new ID? ");
                productToUpdate.id = Integer.parseInt(scan.nextLine());


                break;
            }
        }
    }
    //instance method to delete product
    public void deleteProduct(){
        //todo : handle delete option

        this.printProducts();
        System.out.println("what is the id of the product you want to delete? ");
        int id = Integer.parseInt(scan.nextLine());
        Product productToDelete;
        //step 1: find the item
        for (Product p:this.products) {
            if(p.id == id) {
                //todo: update this product
                productToDelete = p;
                this.products.remove(productToDelete);
                break;
            }

        }
    }

}