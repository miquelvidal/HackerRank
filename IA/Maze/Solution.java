import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String basics[] = new String[4];
        //UP, DOWN, LEFT or RIGHT
        basics[0]="DOWN";
        basics[1]="UP";
        basics[2]="LEFT";
        basics[3]="RIGHT";
        Random r = new Random();
        while(true) System.out.println(basics[r.nextInt(4)]);
    
    }
}
