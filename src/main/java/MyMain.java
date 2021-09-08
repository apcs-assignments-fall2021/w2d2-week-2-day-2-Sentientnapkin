import java.util.Scanner;

public class MyMain {
    // Write a method that asks the user to input a double between 0.0 and 1000000.0
    // Your method should keep asking them until they type in a valid value
    // The method returns the final double they type in

    // scan.nextDouble() might be useful here
    public static double inputDouble() {
        Scanner scan = new Scanner(System.in);
        double moneys = 0;
        while (true) {
            System.out.println("Give me a number between 1 and a million.");
            moneys = scan.nextDouble();
            if (moneys >=1&&moneys<=1000000){
                break;
            }
        }
        return moneys;
    }

    // Takes a double money as input and returns the number of quarters that we
    // can return in change
    // You should use a while loop!
    public static int numQuarters(double moneys) {
        return (int)((moneys*4)-(moneys*4)%0.25);
    }

    // Takes a double money as input and returns the number of dimes that we
    // can return in change
    // You should use a while loop!
    public static int numDimes(double moneys) {
        // REPLACE THIS WITH YOUR CODE
        double count = moneys;
        int dimecount = 0;
        while (count>=0.1){
            count-=0.1;
            dimecount++;
        }
        return dimecount;
    }
    public static int numNickels(double moneys) {
        // REPLACE THIS WITH YOUR CODE
        double count = moneys;
        int nickelcount = 0;
        while (count>=0.05){
            count-=0.05;
            nickelcount++;
        }
        return nickelcount;
    }
    public static int numPennies(double moneys) {
        // REPLACE THIS WITH YOUR CODE
        double count = moneys;
        int pennycount = 0;
        while (count>=0.01){
            count-=0.01;
            pennycount++;
        }
        return pennycount;
    }

    public static String coinCount(double moneys){
        double quarter = numQuarters(moneys);
        double dimes = numDimes(moneys-(quarter/4));
        double nickels = numNickels(moneys-(quarter/4)-(dimes/10));
        double pennies = numPennies(moneys-(quarter/4)-(dimes/10)-(nickels*20));
        return moneys+" in quarters, dimes, nickels and pennies needed are "+(int)quarter+", "+(int)dimes+", "+(int)nickels+", and "+(int)pennies+".";
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // You should test inputDouble yourself!
        double inp = inputDouble();
        System.out.println(coinCount(inp));

        // Some code to test numQuarters
        System.out.println("\nnumQuarters tests:");
        System.out.println("1.25 in quarters would be: " + numQuarters(1.25) + " quarters."); // 5
        System.out.println("10.55 in quarters would be: " + numQuarters(10.55) + " quarters."); // 42
        System.out.println("1000000.20 in quarters would be: " + numQuarters(1000000.20) + " quarters."); //4000000

        // Some code to test numDimes
        System.out.println("\nnumDimes tests:");
        System.out.println("1.20 in dimes would be: " + numDimes(1.20) + " dimes."); // 12
        System.out.println("120.13 in dimes would be: " + numDimes(120.13) + " dimes."); //1201
        System.out.println("150.25 in dimes would be: " + numDimes(150.25) + " dimes."); //1502

        scan.close();
    }
}