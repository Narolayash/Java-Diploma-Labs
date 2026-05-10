#include <stdio.h>

int main () {
    int n;
    printf("Enter number: ");
    scanf("%d", &n);

    if (n > 0) 
        printf("Positive number");
    else if (n < 0)
        printf("Negative number");
    else 
        printf("Number is Zero");

    return 0;
}
