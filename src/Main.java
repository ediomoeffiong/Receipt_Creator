import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------Receipt Creator----------------\n");
        System.out.print("Number of items in the receipt: ");
        Scanner scanNum = new Scanner(System.in);
        int numReceipt = scanNum.nextInt();
        System.out.print("\n");

        if (numReceipt < 1) {
            System.out.println("Warning: Input a number greater than 0!");
            String[] call = {"call"};
            Main.main(call);
        }

        int[] price = new int[numReceipt];
        int[] quantity = new int[numReceipt];
        int[] amount = new int[numReceipt];
        String[] item = new String[numReceipt];
        int totalPrice = 0;
        
        System.out.print("Input customer name: ");
        Scanner scanName = new Scanner(System.in);
        String customerName = scanName.nextLine();
        System.out.print("\n");

        for (int i = 0; i < numReceipt; i++) {
            System.out.println("Item " + (i + 1));
            System.out.print("Name: ");
            Scanner scanItem = new Scanner(System.in);
            item[i] = scanItem.nextLine();

            System.out.print("Price: ");
            Scanner scanPrice = new Scanner(System.in);
            price[i] = scanPrice.nextInt();

            System.out.print("Quantity: ");
            Scanner scanQuantity = new Scanner(System.in);
            quantity[i] = scanQuantity.nextInt();

            amount[i] = price[i] * quantity[i];
            totalPrice = amount[i] + totalPrice;

            System.out.print("\n");
        }

        System.out.println("Receipt");
        System.out.println("QTY\t\tDESCRIPTION\t\tUNIT PRICE\t\tAMOUNT\n");
        for (int j = 0; j < numReceipt; j++) {
            System.out.println(quantity[j] + "\t\t" + item[j] + "\t\t\t" + "$" + price[j] + "\t\t\t\t" + "$" + amount[j]);
        }
        System.out.println("\nTOTAL\t\t\t\t\t\t\t\t\t" + totalPrice);
        System.out.println("\t\t\t\t\t\t\t\t\t\t" + customerName);

    }
}