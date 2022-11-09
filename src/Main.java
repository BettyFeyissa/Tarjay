 import java.util.Scanner;

 //Main should run our program and present a menu for user input
public class Main {
    //Class attributes
    static Scanner scan = new Scanner(System.in);

    //Creating a new instance of our shop
    static Shop tarjay = new Shop();

    //storing the users input
    static String option = "";


    static void presentMenu(){
        // print options for the user to select
        //step 1: define the message for the options
        String optionsMessage = "Type C to create a new product \n" + "Type R to read all products \n" + "Type U to update a product \n" + "Type D to delete a product \n" + "Type Q to quit \n";

        // step 2: print options for the user
        System.out.println(optionsMessage);


        // todo: process user option
        //step 1: scan in user input
        option = scan.nextLine();
        System.out.println("the user selected " + option);

        //check which option user selected
        if (option.equals("C")) {
            // todo : handle create option
//            System.out.println("You typed C ");

            //todo refactor to have the shop manage creating.
            tarjay.createProduct();



        }else if (option.equals("R")){
            System.out.println("You typed R ");
            //todo : handle read option
            // print the products
            tarjay.printProducts();
        }else if (option.equals("U")){
            System.out.println("Should update ");

            tarjay.updateProduct();



        }else if (option.equals("D")){
            System.out.println("Should delete ");

            tarjay.deleteProduct();

        }else if (option.equals("Q")){
            System.out.println("Goodbye! ");

            //todo : handle quit option

        }else {
            //todo : handle no option found
        }

    }
    public static void main(String[] args) {


        // print a welcome menu for the user
        //step 1: define the message for the user
        String welcome = "Welcome to Tarjay";

        // step 2: print message for the user
        System.out.println(welcome);

        //step 3: create loop for the program menu
        while (option.equals("Q") == false){
            presentMenu();

        }











    }
}