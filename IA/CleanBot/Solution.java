import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /* al final opció més senzilla
    class MkPosition{
        public int x;
        public int y;
    }
    */
    static void next_move(int posr, int posc, String[] board){
        //add logic here
        int joX = posc;
        int joY = posr;
        int destiX = 999;
        int destiY = 999;
        //si estem sobre brut no cal continua
        if (board[joY].charAt(joX)=='d') {
            System.out.println("CLEAN");
            return;
        }
        
        
        //si no, analitzarem el tablero and so on
        //al final no caldrà
        //LinkedList<mkPosition> bruticia = new LinkedList()<mkPosition>;
        
        //llegim el mapa
        for (int y=0;y<board.length;y++){
            for(int x=0;x<5;x++){
                if (board[y].charAt(x)=='d') {
                    int difX = Math.abs(x-joX);
                    int difY = Math.abs(y-joY);
                    int dist = difX+difY;
                    difX = Math.abs(destiX-joX);
                    difY = Math.abs(destiY-joY);
                    if((difX+difY)>dist){
                        destiX=x;
                        destiY=y;
                    }
                }
            }
        }
        //Calculem el pas
        //calculem els camins en els dos eixos
        int camiX=destiX-joX;
        int camiY=destiY-joY;
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
        int [] pos = new int[2];
        String board[] = new String[5];
        for(int i=0;i<2;i++) pos[i] = in.nextInt();
        for(int i=0;i<5;i++) board[i] = in.next();
        next_move(pos[0], pos[1], board);
    }
}