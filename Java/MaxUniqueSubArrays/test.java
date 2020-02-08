import java.util.*;
 public class test {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         Deque<Integer> deque = new ArrayDeque<Integer>();
         Hashtable<String,Integer> contadors = new Hashtable<String,Integer>();
         int n = in.nextInt();
         int m = in.nextInt();
         int maxUnique = 0;
         int unics = 0;
         if (n<m) return;
         for (int i = 0; i < n; i++) {
             int num = in.nextInt();
             String kNum = ""+num;
             Integer contadorNum = contadors.get(kNum);
             if (contadorNum == null){
                 unics++;
                 contadorNum = new Integer(1);
             }
             else{
                 unics--;
                 contadorNum = new Integer(contadorNum.intValue()+1);
             }
             contadors.put(kNum,contadorNum);
             deque.addLast(contadorNum);
             if (i>m) {
                 Integer primer = deque.removeFirst();
                 Integer contadorPrimer = contadors.get(""+primer.intValue());
                 int primerInt = contadorPrimer.intValue();
                 if (primerInt==0){
                     contadors.remove(""+primer.intValue());
                     unics--;
                 }
                 else if(primerInt==1){
                     unics++;
                 }
             }
             if (unics>maxUnique) maxUnique = unics;

         }
         System.out.println(maxUnique);
     }
 }
