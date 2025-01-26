#include <stdio.h>
#include <stdlib.h>

#define MAX 10

typedef struct Node {
    int vertex;
    struct Node* next;
} Node;

Node* graph[MAX];
int visited[MAX];

void initializeGraph(int vertices) {
    for (int i = 0; i < vertices; i++) {
        graph[i] = NULL;
        visited[i] = 0;
    }
}

void addEdge(int src, int dest) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->vertex = dest;
    newNode->next = graph[src];
    graph[src] = newNode;
}

void dfs(int vertex) {
    printf("%d ", vertex);
    visited[vertex] = 1;

    Node* currentNode = graph[vertex];
    while (currentNode != NULL) {
        int neighbor = currentNode->vertex;
        if (!visited[neighbor]) {
            dfs(neighbor);
        }
        currentNode = currentNode->next;
    }
}

int main() {
    int vertices, edges, src, dest;

    printf("Enter number of vertices: ");
    scanf("%d", &vertices);

    initializeGraph(vertices);

    printf("Enter number of edges: ");
    scanf("%d", &edges);

    for (int i = 0; i < edges; i++) {
        printf("Enter edge %d src dest: ", i + 1);
        scanf("%d %d", &src, &dest);
        addEdge(src, dest);
    }

    printf("DFS:\n");
    for (int i = 0; i < vertices; i++) {
        if (!visited[i]) {
            dfs(i);
        }
    }
    
    printf("\n");

    return 0;
}
