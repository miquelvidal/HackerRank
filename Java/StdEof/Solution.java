import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String linia = null;
        long num = 1;
        while(scanner.hasNextLine()){
            linia = scanner.nextLine();
            System.out.println(num+" "+linia);
            num++;
        }

    }
}
