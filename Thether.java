import java.util.*;
public class Main
{
    public static void main(String args[])
{
        int totalPrice;
        Scanner sc = new Scanner(System.in);
        System.out.print("\r\n  Welcome To Theater WAVE \r\n ");
        System.out.print("Kindly Enter your Name: ");
        String str = sc.next();
        System.out.print("Number of Pizza = ");
        int pizza = sc.nextInt();
        System.out.print("Number of Puffs = ");
        int puffs = sc.nextInt();
        System.out.print("Number of Cool Drinks = ");
        int coolDrinks = sc.nextInt();
        pizza = Math.abs(pizza)*100;
        puffs = Math.abs(puffs)*20;
        coolDrinks = Math.abs(coolDrinks)*10;
        totalPrice = pizza+puffs+coolDrinks;
        System.out.print("Hi "+str );
        System.out.println(" Your order details and Total Prize:");
        System.out.println(" \n Total No. of Pizza = "+pizza);
        System.out.println(" \n Total No. of Puffs = "+puffs);
        System.out.println(" \n Total No. of Cool Drinks = "+coolDrinks);
        System.out.println(" \n Total Price : "+totalPrice);
        System.out.println(" \n Thanks for your visit ");
        System.out.println(" \n Enjoy your Flim ");
        System.out.println("***COME AGAIN***");
    }
}