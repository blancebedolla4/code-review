package review;

public class CodeAlong {
    public static void main(String[] args) {

        // using .equals()
        // with objects such as Strings we cant use primitive equality operators

        String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
        String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
        String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
        // to use it we call it on one String by using . , and pass in the string to compare against in parentheses
        // print out whether line1 and line2 are the same
        System.out.println(line1.equals(line2));

        // string concatenation

        // used to join two strings together

        int animals = 12;
        String species = "zebra";
        // create a String vara=iable called zooDescription and should hold Our zoo has <animals> <species>s!
        String zooDescription = "Our zoo has " + animals + " " + species + "s!";
        // Print out variable
        System.out.println(zooDescription);

        // final keyword
        // a variable with a value that cannot be channged
        // create am unchangeable double variable called pi and set it to 3.14
        final double pi = 3.14;
        // print value of pi
        System.out.println(pi);
        // what happens when you try to change value of pi
        // pi = 45;

        // Manupulating variables
        double balance = 1000.75;
        double amountToWithdraw = 250;
        // create a new double variable called updatedBalance and store balance with amountToWithdraw subtracted from it
        double updatedBalance = balance - amountToWithdraw;
        // now split balance evenly 3 ways
        double amountForEachFriend = updatedBalance / 3;
        // each friend wants to buy a concert ticket for 250. create a boolean and set it equal to whether or not amountForEachFriend is at least enough to purchase a concert ticket
        boolean canPurchaseTicket = amountForEachFriend >= 250;
        System.out.println(canPurchaseTicket);
        // find out how much money was given to friends
        System.out.println("I gave each friend " + amountForEachFriend + "....");

    }
}










