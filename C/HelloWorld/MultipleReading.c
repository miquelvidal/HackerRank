#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    
    char ch;
    char s[100];
    char s2[100];
    //captura caracter
    scanf("%c", &ch);
    //captura paraula
    //scanf("%s", &s2);
    /*

    Mirant les opinions del foro, sembla que hi ha un caràcter extra i per axiò s'ha de posar l'espai.

    */

    scanf(" %[^\n]%*c",&s2);
    //captura linia
    scanf("%[^\n]%*c", &s);
    
    printf("%c\n", ch);
    printf("%s\n",s2);
    printf("%s",s);
    
    //printf("\n");

    return 0;
}

