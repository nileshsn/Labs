#include <stdio.h>
#include <string.h>

int main() {
    char s1[100], s2[100];
    printf("Enter two strings:\n");
    scanf("%s %s", s1, s2);

    int m = strlen(s1);
    int n = strlen(s2);

    int flag = -1;

    for (int i = 0; i <= m - n; i++) {
        int match = 1; // Assume match until proven otherwise

        // Check if s2 matches the substring of s1 starting at index i
        for (int j = 0; j < n; j++) {
            if (s1[i + j] != s2[n - 1 - j]) { // Compare s1[i+j] with s2[n-1-j] (reverse comparison)
                match = 0;
                break;
            }
        }

        if (match) {
            flag = i;
            break;
        }
    }

    if (flag != -1) {
        printf("Reverse of substring found at index %d\n", flag);
    } else {
        printf("Reverse of substring not found\n");
    }

    return 0;
}
