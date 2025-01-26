#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Graph {
    int vertices;
    struct Node** adj_list;
    int* visited;
};

struct Node* createNode(int data) {
    struct Node* newnode = (struct Node*)malloc(sizeof(struct Node));
    newnode->data = data;
    newnode->next = NULL;
    return newnode;
}

struct Graph* createGraph(int n) {
    struct Graph* graph = (struct Graph*)malloc(sizeof(struct Graph));
    graph->vertices = n;
    graph->adj_list = (struct Node**)malloc(n * sizeof(struct Node*));
    graph->visited = (int*)malloc(n * sizeof(int));

    for (int i = 0; i < n; i++) {
        graph->visited[i] = 0;
        graph->adj_list[i] = NULL;
    }
    return graph;
}

void addEdge(struct Graph* graph, int src, int dest) {
    struct Node* newnode = createNode(dest);
    newnode->next = graph->adj_list[src];
    graph->adj_list[src] = newnode;

    newnode = createNode(src);
    newnode->next = graph->adj_list[dest];
    graph->adj_list[dest] = newnode;
}

void bfs(struct Graph* graph, int startVertex) {
    int* queue = (int*)malloc(graph->vertices * sizeof(int));
    int front = 0;
    int rear = 0;

    queue[rear++] = startVertex;
    graph->visited[startVertex] = 1;

    while (front < rear) {
        int currentVertex = queue[front++];
        printf("%d ", currentVertex);

        struct Node* temp = graph->adj_list[currentVertex];
        while (temp != NULL) {
            int adjVertex = temp->data;
            if (graph->visited[adjVertex] == 0) {
                queue[rear++] = adjVertex;
                graph->visited[adjVertex] = 1;
            }
            temp = temp->next;
        }
    }
    free(queue);
}

int main() {
    int vertices, edges;
    printf("Enter the number of vertices: ");
    scanf("%d", &vertices);
    struct Graph* graph = createGraph(vertices);
    printf("Enter the number of edges: ");
    scanf("%d", &edges);

    for (int i = 0; i < edges; i++) {
        int src, dest;
        printf("Enter edge %d (source destination): ", i + 1);
        scanf("%d %d", &src, &dest);
        addEdge(graph, src, dest);
    }

    printf("\nBFS traversal starting from each disconnected component:\n");
    for (int i = 0; i < vertices; i++) {
        if (graph->visited[i] == 0) {
            bfs(graph, i);
            printf("\n"); 
        }
    }
    for (int i = 0; i < vertices; i++) {
        struct Node* temp = graph->adj_list[i];
        while (temp != NULL) {
            struct Node* prev = temp;
            temp = temp->next;
            free(prev);
        }
    }
    free(graph->adj_list);
    free(graph->visited);
    free(graph);

    return 0;
}
