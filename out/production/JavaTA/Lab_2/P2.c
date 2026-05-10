#include <stdio.h>
int main () {
    int n;
    printf("Enter size: ");
    scanf("%d",&n);

    int ary[n];
    float sum = 0, avg = 0;
    for (int i=0;i<n;i++) {
        printf("Enter number %d: ",i+1);
        scanf("%d",&ary[i]);
        sum += ary[i];
    }

    avg = sum/n;
    printf("Sum = %.2f",sum);
    printf("\nAverage = %.2f",avg);

    return 0;
}
