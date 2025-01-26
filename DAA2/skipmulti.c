#include <stdio.h>
#include <string.h>

int main() {
    char s1[100], s2[100];
    printf("Enter two strings:\n");
    scanf("%s %s", s1, s2);

    int m = strlen(s1);
    int n = strlen(s2);
    int flag = -1;

    for (int i = 0; i < m; i++) {
        if (s1[i] == s2[0]) {
            int count = 0;
            int a = 0;
            for (int j = 0; j < n; j++) {
                if ((i + j + a) < m && s2[j] == s1[i + j + a]) {
                    count++;
                } else {
                    break;
                }
                a += j;
            }
            if (count == n) {
                flag = i;
                break;
            }
        }
    }

    if (flag != -1) {
        printf("Match found from index %d\n", flag);
    } else {
        printf("No match found\n");
    }

    return 0;
}
