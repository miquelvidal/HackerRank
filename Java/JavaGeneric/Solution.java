
import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
   //Write your code here
   //en ppi teim prefix <T> per marcar un mètode genèric amb classe T per rebre genèrics
    public static <T> void printArray(T[] a){
        //com no sabem cada un dels elements fem us de l'element T
        for (T o : a){
            //com el .toString és base de tot Object, el puc convertir segur i el puc cridar tal qual
            System.out.println(""+o);
        }
    }
}

public class Solution {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}
