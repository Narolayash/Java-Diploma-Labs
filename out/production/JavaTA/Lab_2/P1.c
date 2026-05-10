#include <stdio.h>

int main () {
    int n,i;
    printf("Enter size: ");
    scanf("%d",&n);

    int ary[n];
    printf("Enter elements:\n");
    for (i=0;i<n;i++) {
        scanf("%d",&ary[i]);
    }

    printf("Normal order: ");
    for (i=0;i<n;i++) {
        printf("%d ",ary[i]);
    }

    printf("\nReverse order: ");
    for (i=n-1;i>=0;i--)
        printf("%d ",ary[i]);

    return 0; 
}
