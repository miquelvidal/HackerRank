import java.util.*;
public class test {

    public static int nouUnics(int[] Ms){
        int tmpUnic = 0;
        for(int k=0;k<Ms.length;k++){
            int tmp1 = 1;
            for(int l=0; (l<Ms.length)&&(tmp1==1);l++){
                if (l!=k){
                    if(Ms[k]==Ms[l]) tmp1=0;
                }
            }
            tmpUnic+=tmp1;
        }
        return tmpUnic;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] Ms = new int[m];
        int maxUnique = 0;
        if (n<m) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            //la part inicial va a part, mentres no tenim prou fem cas especial
            if (i<m) {
                Ms[i]=num;
                //en concret quan no arriba ni a la talla minima no cal iterar
                //if (i<(m-1)) continue;
                //mentida... sembla que els petits els compten també
            }
            else{
                //correm tots els elements
                for (int j=0;j<(m-1);j++){
                    Ms[j]=Ms[j+1];
                }
                //afegim el nom al final
                Ms[m-1]=num;
            }
            int unicLocal = nouUnics(Ms);
            if (maxUnique<unicLocal) maxUnique = unicLocal;

        }
        System.out.println(maxUnique);
    }
}
