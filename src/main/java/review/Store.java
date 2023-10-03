package review;

public class Store {
    // declare instance fields here
    //can declare as many fields as are necessary for the requirements of our program
    String productType;
    int inventoryCount;
    double inventoryPrice;



    // new method: constructor!
    // inside the constructor method, set instance variabke productType equal to the product oaramater
    // update constructor with new parameters
    //In the body of the Store constructor, assign the parameter values to the appropriate instance fields.
    public Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
        System.out.println("I am inside the constructor method.");

    }

    // main method is where we create instances!
    public static void main(String[] args) {
        System.out.println("Start of the main method.");

        // create the instance below
        //Inside main(), create an instance of Store called cookieShop.

       // cookieShop has "cookies" as the product.
        // cookieShop has 12 cookies to sell and each cookie costs 3.75.
       // Store lemonadeStand = new Store("lemonade");
        Store cookieShop = new Store("cookies",12,3.75);


        // print the instance below
        System.out.println(lemonadeStand);

        //Inside main(), create an instance of Store and assign it to the variable lemonadeStand. Use "lemonade" as the parameter value.

        System.out.println(lemonadeStand.productType);


    }
}


