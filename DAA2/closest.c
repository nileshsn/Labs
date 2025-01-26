#include<stdio.h>
#include<math.h>
struct point{
  int x;
  int y;
};

int main()
{
  int n;
  scanf("%d", &n);
  struct point p[n];
  for(int i=0;i<n;i++){
    scanf("%d %d",&p[i].x,&p[i].y);

  }

  float min=INFINITY;
  for(int i=0;i<n-1;i++){
    for(int j=i+1;j<n;j++){
      int d=sqrt(pow((p[i].x-p[j].x),2)+pow((p[i].y-p[j].y),2));
      if(d<min){
        min=d;
      }
    }
  }
  printf("Minimum distance between two points: %.2lf\n", min);
  return 0;
  
}




// #include <stdio.h>
// #include <math.h>

// struct Point {
//     int x;
//     int y;
// };

// int main() {
//     // Get the number of points
//     printf("Enter the number of points: ");
//     int n;
//     scanf("%d", &n);

//     // Define an array of points
//     struct Point points[n];

//     // Get coordinates for each point
//     for(int i = 0; i < n; i++) {
//         printf("Enter coordinates for point %d (x y): ", i + 1);
//         scanf("%d %d", &points[i].x, &points[i].y);
//     }

//     // Initialize minimum distance to a large value
//     double minDistance = INFINITY;

//     // Calculate distance between each pair of points
//     for(int i = 0; i < n - 1; i++) {
//         for(int j = i + 1; j < n; j++) {
//             double distance = sqrt(pow((points[i].x - points[j].x), 2) + pow((points[i].y - points[j].y), 2));
//             if(distance < minDistance) {
//                 minDistance = distance;
//             }
//         }
//     }

//     // Print the minimum distance
//     printf("Minimum distance between two points: %.2lf\n", minDistance);

//     return 0;
// }
