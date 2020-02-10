import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Començem l'scanner per llegir stdin
        Scanner scan = new Scanner(System.in);
        //longitud dels bit sets a n
        int n = scan.nextInt();
        //número de comandes
        int m = scan.nextInt();
        //buidem el buffer de la primera linea
        String tmpString = scan.nextLine();
        //iniciatlizem bitsets
        BitSet[] sets = new BitSet[2];
        sets[0] = new BitSet(n);
        sets[1] = new BitSet(n);
        //fem bucle de comandes (les m comandes que hauran d'entrar)
        for(int i=0;i<m;i++){
            //llegim linea
            String fullLineCommand = scan.nextLine();

            //la parsegem
            StringTokenizer parser = new StringTokenizer(fullLineCommand," ");
            //la comanda primer
            String comanda  = parser.nextToken();
            //el primer parametre
            int v1 = new Integer(parser.nextToken());
            //el segon parametre
            int v2 = new Integer(parser.nextToken());
            //System.out.println("Reconstruccio:"+comanda+","+v1+","+v2);
            //en funció de l a comanda fem, pels noms és aplicació directe
            switch(comanda){
                case "AND":
                    sets[v1-1].and(sets[v2-1]);
                break;
                case "OR":
                    sets[v1-1].or(sets[v2-1]);
                break;
                case "XOR":
                    sets[v1-1].xor(sets[v2-1]);
                break;
                case "SET":
                    sets[v1-1].set(v2);
                break;
                case "FLIP":
                    sets[v1-1].flip(v2);
                break;
            }
            //int total1=0;
            //int total2=0;
            //veure els "true's"
            //for(int j=0;j<sets[0].size();j++) if(sets[0].get(j)) total1++;
            //for(int k=0;k<sets[1].size();k++) if(sets[1].get(k)) total2++;
            //System.out.println(total1+" "+total2);
            //al final es millor el "cardinality"
            System.out.println(sets[0].cardinality()+" "+sets[1].cardinality());
        }

    }
}
