import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }


//Write your code here
        //fem per hashmaps?
        HashMap<String, String> mapa = new HashMap<String,String>();
        for(int k=0;k<t;k++){
            String tmpString = pair_left[k]+" "+pair_right[k];
            mapa.put(tmpString,tmpString);
            System.out.println(mapa.size());
        }

    }
}
