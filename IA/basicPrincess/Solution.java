import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        //llegim NxN cuadricula tamany
        int n = scan.nextInt();
        //saltem la linia
        String saltLinia = scan.nextLine();
        
        int joX=-1;
        int joY=-1;
        int princesaX=-1;
        int princesaY=-1;
        
        //recorrem la quadricula;
        //seguint la pauta de hacker rank
        //dalt esquerra es el 0,0
        //cada linia puja un nivell d'y
        //cada caràcter dreta puja un nivell d'x
        
        //per cada linia --> y
        for(int y=0;y<n;y++){
            String nivellY = scan.nextLine();
            //per cada columna --> x
            for(int x=0;x<n;x++){
                char tmp = nivellY.charAt(x);
                if (tmp=='m') {
                    joX=x;
                    joY=y;
                }
                if (tmp=='p'){
                    princesaX=x;
                    princesaY=y;
                }
            }
        }
        
        //calculem el cami X
        int camiX = princesaX-joX;
        //mirem el sentit
        String sentit ="";
        if (camiX>0) sentit ="RIGHT";
        else {
            camiX = -1*camiX;
            sentit = "LEFT";
        }
        //fem les passes necessaries en aquest sentit
        for (int i=0;i<camiX;i++) System.out.println(sentit);
        
        //calculem el cami Y
        int camiY = princesaY-joY;
        //mirem el sentit
        sentit = "";
        if (camiY>0) sentit="DOWN";
        else {
            camiY=-1*camiY;
            sentit="UP";
        }
        //fem les passes necessaries en aquest sentit
        for (int i=0;i<camiY;i++) System.out.println(sentit);
    }
}
