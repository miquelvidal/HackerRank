import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        //variables de resultat
        String us, india, china, france;

        //formatar per usa
        NumberFormat us_nf = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        us = us_nf.format(payment);

        //formatar per india
        NumberFormat in_nf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        india = in_nf.format(payment);

        //formatar per china
        NumberFormat ch_nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        china = ch_nf.format(payment);

        //formatar per frança
        NumberFormat fr_nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        france = fr_nf.format(payment);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
