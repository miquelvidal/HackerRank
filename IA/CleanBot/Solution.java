import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    class MkPosition{
        public int x;
        public int y;
    }
    static void next_move(int posr, int posc, String[] board){
        //add logic here
        int joX = posc;
        int joY = posr;
        int destiX = 0;
        int destiY = 0;
        //si estem sobre brut no cal continua
        if (board[joX].charAt(joY)=='d') {
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
                   //MkPosition p = new MkPosition();
                   //p.x=x;
                   //p.y=y;
                    destiX = destiX +()
                }
            }
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
