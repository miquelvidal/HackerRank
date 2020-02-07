import java.util.*;
public class test {
    public static int calcularUnics(Deque<Integer> deque){
        Iterator<Integer> iterador = deque.iterator();
        Hashtable<String,Integer> valors = new Hashtable<String,Integer>();
        while (iterador.hasNext()){
            Integer tmp = iterador.next();
            valors.put(""+tmp,tmp);
        }
        return valors.size();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique = 0;
        if (n<m) return;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(new Integer(num));
            if (i<(m-1)) continue;
            if (i>m) deque.removeFirst();
            int newUnique = calcularUnics(deque);
            if (maxUnique<newUnique) maxUnique= newUnique;
        }
        System.out.println(maxUnique);
    }
}
