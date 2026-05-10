#include <stdio.h>

int main () {
    int a, b, c;
    printf("Enter three numbers: ");
    scanf("%d %d %d", &a, &b, &c);

    int max = a;
    if (b > max) max = b;
    if (c > max) max = c;

    printf("Maximum number = %d", max);

    return 0;
}

// int main() {
//     int a, b, c;
//     printf("Enter three numbers: ");
//     scanf("%d %d %d", &a, &b, &c);

//     if (a > b && a > c)
//         printf("Maximum number = %d", a);
//     else if (b > c)
//         printf("Maximum number = %d", b);
//     else 
//         printf("Maximum number = %d", c);

//     return 0;
// }
