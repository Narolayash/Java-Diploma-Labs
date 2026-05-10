#include <stdio.h>

int main () {
    int n;
    printf("Enter number: ");
    scanf("%d", &n);

    int cp = n, digits = 0;
    while (cp > 0) {
        digits++;
        cp /= 10;
    }

    cp = n;
    int sum = 0;
    while (cp > 0) {
        int pro = 1, lt = cp % 10;
        for (int i=0; i<digits; i++) {
            pro *= lt;
        }
        sum += pro;
        cp /= 10;
    }

    if(sum==n)
        printf("Armstrong number");
    else
        printf("Not Armstrong");

    return 0;
}
