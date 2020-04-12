import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static void nextMove(int n, int r, int c, String [] grid){
    int joX=c;
    int joY=r;
    int princesaX=0;
    int princesaY=0;
    boolean princesaTrobada = false;
    
    //recorrem nivell Y
    for (int y=0;(y<n)&&(!princesaTrobada);y++){
        //recorrem nivell  
        for(int x=0;(x<n)&&(!princesaTrobada);x++){
            char tmpC = grid[y].charAt(x);
            if (tmpC=='p'){
                princesaX=x;
                princesaY=y;
                princesaTrobada=true;
            }
        }
    }
    //calculem els camins en els dos eixos
    int camiX=princesaX-joX;
    int camiY=princesaY-joY;
    //positivitzem els valors
    int tmpX=camiX*camiX;
    int tmpY=camiY*camiY;
    //per saber si verical o horitzontal comparem els valors positivitzats
    //si X es més gran és horitzontal si no vertical
    if (tmpX>tmpY){
        //si es positiu és dreta, si no esquerra
        if (camiX>0) System.out.println("RIGHT");
        else System.out.println("LEFT");
    }
    else {
        //si es positiu es cap a baix si no cap a d'alt
        if (camiY>0) System.out.println("DOWN");
        else System.out.println("UP");
    }
    
    
  }

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,r,c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];


        for(int i = 0; i < n; i++) {
            grid[i] = in.next();
        }

    nextMove(n,r,c,grid);

    }
}
