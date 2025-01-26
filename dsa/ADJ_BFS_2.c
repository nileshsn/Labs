#include <stdio.h>
#include <stdlib.h>
#define MAX 10

int adj[MAX][MAX];
int visited[MAX];
int queue[MAX];
int rear = -1;
int front = 0;

void addEdge(int src, int dest) {
    adj[src][dest] = 1;
    adj[dest][src] = 1;
}

int isEmpty() {
    return front > rear;
}

void enqueue(int vertex) {
    rear++;
    queue[rear] = vertex;
}

int dequeue() {
    int vertex = queue[front];
    front++;
    return vertex;
}

void BFS(int start, int vertex) {
    for (int i = 0; i < vertex; i++) {
        visited[i] = 0;
    }

    visited[start] = 1;
    enqueue(start);

    while (!isEmpty()) {
        int current = dequeue();
        printf("%d ", current);

        for (int i = 0; i < vertex; i++) {
            if (adj[current][i] == 1 && !visited[i]) {
                visited[i] = 1;
                enqueue(i);
            }
        }
    }
}

void BFS_all(int vertex) {
    for (int i = 0; i < vertex; i++) {
        if (!visited[i]) {
            printf("BFS starting from vertex %d:\n", i);
            BFS(i, vertex);
            printf("\n");
        }
    }
}

int main() {
    int vertex, edge, src, dest;

    printf("Enter number of vertices: ");
    scanf("%d", &vertex);
    printf("Enter number of edges: ");
    scanf("%d", &edge);

    for (int i = 0; i < MAX; i++) {
        for (int j = 0; j < MAX; j++) {
            adj[i][j] = 0;
        }
    }

    for (int i = 1; i <= edge; i++) {
        printf("Enter edge %d (source destination): ", i);
        scanf("%d %d", &src, &dest);
        addEdge(src, dest);
    }

    BFS_all(vertex);

    return 0;
}
