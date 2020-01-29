import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static int B, H;
static boolean flag;
private static final Scanner scanner = new Scanner(System.in);
    static{
        B = scanner.nextInt();
        H = scanner.nextInt();
        if ((B<0)||(H<0)||(B>=100)||(H>=100))
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        else
            System.out.println(B*H);
    }//fi static
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}//end of main

}//end of class
