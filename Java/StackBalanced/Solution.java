import java.util.*;
class Solution{
	public static boolean checkEquilibrat(char c, LinkedList<String> unaPila){
        boolean esEquilibrat = false;
        char tmpC = '-';
        switch(c){
            case '}':
                tmpC = '{';
                break;
            case ']':
                tmpC = '[';
                break;
            case ')':
                tmpC = '(';
        }
        //Cadena on deixar l'element per comparar
        String unStringPop = "";
        if (unaPila.size()>0){
            unStringPop = unaPila.removeLast();
        }
        //Si el darrer element tancat no és igual al darrer de la pila (regiraten el switch)
        esEquilibrat = (tmpC+"").equals(unStringPop);
        //System.out.println("c:"+c+" tmpC:"+tmpC+" pop:"+unStringPop+" eq:"+esEquilibrat);
        return esEquilibrat;
    }
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            char c;
            LinkedList<String> unaPila = new LinkedList<String>();
            boolean esEquilibrat = true;
            for(int i=0;(i<input.length())&&esEquilibrat;i++){
                c = input.charAt(i);
                char tmpC;
                switch(c){
                    case '{':
                    case '[':
                    case '(':
                        unaPila.addLast(""+c);
                    break;

                    default:
                        esEquilibrat = checkEquilibrat(c,unaPila);
                }
            }
            if (unaPila.size()>0) esEquilibrat = false;
            System.out.println(""+esEquilibrat);
		}

	}
}
