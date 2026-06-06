#include <stdio.h>

int main () {
    char str[100];
    printf("Enter string: ");
    gets(str);

    int i = 0;
    while (str[i] != '\0') {
        i++;
    }

    printf("Length = %d",i);
    return 0;
}

// #include <stdio.h>

// int main() {
//     char str[100];

//     printf("Enter string: ");
//     scanf("%s", str);

//     int i=0;
//     while (str[i] != '\0') {
//         i++;
//     }

//     printf("Length = %d", i);
//     return 0;
// }
