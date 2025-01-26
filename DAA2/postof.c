#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
#include <math.h>

struct Point {
    int x;
    int y;
};

int main() {
    int n;
    printf("Enter count of points: ");
    scanf("%d", &n);

    struct Point *points = malloc(n * sizeof(struct Point));

    for(int i = 0; i < n; i++) {
        printf("Enter coordinates for point %d (x y): ", i + 1);
        scanf("%d %d", &points[i].x, &points[i].y);
    }

    int minDistance = INT_MAX;

    for(int i = 0; i < n; i++) {
        int sum = 0;
        for(int j = 0; j < n; j++) {
            int dx = points[i].x - points[j].x;
            int dy = points[i].y - points[j].y;
            sum += sqrt(dx * dx + dy * dy);
        }
        if(sum < minDistance) {
            minDistance = sum;
        }
    }

    printf("Minimum distance between two points: %d\n", minDistance);

    free(points);

    return 0;
}
