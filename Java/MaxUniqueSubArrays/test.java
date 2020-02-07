import java.util.*;
    public class test {

        public static int nouUnics(int inici,int fi,int[] Ms){
            int tmpUnic = 0;
            //comparem la finestra,ella mateixa contra ell mateixa
            for(int k=inici;k<fi;k++){
                //si un element no te altres iguals sumarem 1 a unics
                int tmp1 = 1;
                for(int l=inici; (l<fi)&&(tmp1==1);l++){
                    //si no es ell mateix
                    if (l!=k){
                        //i és igual llavors no sumarem
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
            //per estalviar continuament moure els elements els desem tots
            int[] storeAll = new int[n];
            int maxUnique = 0;
            if (n<m) {
                System.out.println(0);
                return;
            }
            //llegim mentres tingui sentit, si ja arribem a M diferents no cal seguir
            for (int i = 0; (i < n)&&(maxUnique<m); i++) {
                int num = in.nextInt();
                //desem el número
                storeAll[i]=num;
                //la part inicial va a part, mentres no tenim prou fem cas especial

                int unicLocal = 0;
                if (i<m) unicLocal = nouUnics(0,i,storeAll);
                else unicLocal = nouUnics(i-m,i,storeAll);
                if (maxUnique<unicLocal) maxUnique = unicLocal;

            }
            System.out.println(maxUnique);
        }
    }
