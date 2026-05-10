#include <stdio.h>

int main () {
    int n;
    printf("Enter number: ");
    scanf("%d", &n);

    if (n < 0 || (n % 10 == 0 && n != 0)) {
        printf("Not Palindrome");
        return 0;
    }

    int rev = 0;
    while (n > rev) {
        rev = (rev * 10) + (n % 10);
        n /= 10;
    }

    if (rev == n || rev / 10 == n) printf("Palindrome");
    else printf("Not Palindrome");

    return 0;
}

// int main() {
//     int n,rev=0,rem,temp;
//     printf("Enter number: ");
//     scanf("%d",&n);

//     temp=n;
//     while(n!=0)
//     {
//         rem=n%10;
//         rev=rev*10+rem;
//         n/=10;
//     }

//     if(temp==rev)
//         printf("Palindrome");
//     else
//         printf("Not Palindrome");

//     return 0;
// }
