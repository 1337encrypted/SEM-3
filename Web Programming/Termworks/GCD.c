#include <stdio.h>
#include <stdlib.h>

double gcd(int a,int b){
    if(a%b == 0) 
        return b;
    else
        return (gcd(a,(a%b)));
}

int main(){
    int x,y;
    printf("enter two numbers(non-zero)\n");
    scanf("%d%d",&x,&y);
    double GCD = gcd(x,y);
    printf("gcd of %d and %d is : %f\n",x,y,GCD);
    return 0;
}