#include <stdio.h>

int main () {
    int n;
    printf("Enter number: ");
    scanf("%d", &n);

    printf("\nUsing FOR loop:\n");
    int i;
    for (i=1; i<=n; i++) {
        printf("%d", i);
        printf("\n");
    }

    printf("\nUsing WHILE loop:\n");
    i = 1;
    while (i <= n) {
        printf("%d \n", i++);
    }

    printf("\nUsing DO WHILE loop:\n");
    i = 1;
    do {
        printf("%d \n", i++);
    } 
    while (i <= n); 

    return 0;
}
