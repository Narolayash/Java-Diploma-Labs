#include <stdio.h>
int main () {
    int n;
    printf("Enter size: ");
    scanf("%d",&n);

    int ary[n];
    for (int i=0;i<n;i++){
        scanf("%d",&ary[i]);
    }

    int min, max;
    min = max = ary[0];

    for (int i=1;i<n;i++){
        if (ary[i] > max) max = ary[i];
        if (ary[i] < min) min = ary[i];
    }

    printf("Max = %d", max);
    printf("\nMin = %d", min);

    return 0;
}
