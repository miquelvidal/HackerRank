import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        //number of queries
        int t=in.nextInt();
        //for each query
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int tmpSum = 0;
            for (int j = 0;j<n;j++){
                tmpSum = a;
                for(int k=0;k<=j;k++){
                    tmpSum = tmpSum +((int)Math.pow(2,k))*b;
                }
                System.out.print(tmpSum+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
