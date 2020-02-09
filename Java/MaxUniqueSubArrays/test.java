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
            if (i>=m) {
                Integer primer = deque.removeFirst();
                //System.out.println("Primer:"+primer);
                Integer contadorPrimer = contadors.get(""+primer.intValue());

                int nouPrimerInt = contadorPrimer.intValue()-1;
                if (nouPrimerInt==0){
                    contadors.remove(""+primer.intValue());
                    unics--;
                }
                else {
                    if(nouPrimerInt==1){
                        unics++;
                    }
                    contadors.put(""+primer.intValue(),new Integer(nouPrimerInt));
                }
                //System.out.println("Contadors:"+contadors);
                //System.out.println("deque:"+deque);
                //System.out.println("Contadors:"+contadors+" Unics:"+unics);
            }
            int num = in.nextInt();
            String kNum = ""+num;
            Integer contadorNum = contadors.get(kNum);
            if (contadorNum == null){
                unics++;
                contadorNum = new Integer(1);
            }
            else{
                if (contadorNum.intValue()==1) unics--;
                contadorNum = new Integer(contadorNum.intValue()+1);
            }
            contadors.put(kNum,contadorNum);
            deque.addLast(new Integer(num));
            //System.out.println(unics+" "+deque+" "+contadors);

            //if (unics>maxUnique) maxUnique = unics;
            //algo me fa pensar que es perd info amb el contador d'unics... i voila!
            if (contadors.size()>maxUnique) maxUnique = contadors.size();
        }
        System.out.println(maxUnique);
    }
}
