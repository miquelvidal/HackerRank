#include <stdio.h>

void update(int *a,int *b) {
    // Complete this function   
    int tmpB =(*b);
    int tmpA =(*a);
    (*a) = tmpA + tmpB;
    tmpB = tmpA - tmpB;
    if (tmpB<0) (*b) = -(tmpB);
    else (*b) = tmpB; 
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}
