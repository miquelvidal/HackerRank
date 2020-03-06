#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    //Entrades
    int n,m;
    float a,b;
    //Resultats
    int r1,r2;
    float r3,r4;
    //llegim
    scanf("%d %d", &n, &m);
    scanf("%f %f", &a, &b);
    //calculs
    r1 = n+m;
    r2 = n-m;
    r3 = a+b;
    r4 = a-b;
    printf("%d %d\n",r1,r2);
    printf("%.1f %.1f\n",r3,r4);
	
    
    return 0;
}
