package ShopOnline.View;

import java.util.Scanner;

public class AppView {

    private final Scanner scanner = new Scanner(System.in);

    public String[] getData() {
        System.out.print("Enter buyer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter buyer phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter product quantity, pcs.: ");
        String quantity = scanner.nextLine();
        System.out.print("Enter product price, USD: ");
        String price = scanner.nextLine();
        scanner.close();
        return new String[]{name, phone, quantity, price};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }


}
