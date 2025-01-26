#include <stdio.h>
#include <string.h>

int main() {
    char s1[100], s2[100];
    printf("Enter two strings:\n");
    scanf("%s %s", s1, s2);

    int m = strlen(s1);
    int n = strlen(s2);
    int flag = 0;

    for (int i = 0; i <= m - n; i++) {
        if (s1[i] == s2[0]) {
            int count = 0;
            int a = 0;
            for (int j = 0; j < n; j++) {
                if (s2[j] == s1[i + j + a]) {
                    count++;
                } else {
                    break;
                }
                a += j;
            }
            if (count == n) {
                flag++;
            }
        }
    }

    printf("Count of substrings in main string: %d\n", flag);

    return 0;
}
