#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

struct Graph
{
    int vertices;
    struct Node **adj_list;
    int *visited;
};

struct Node *createNode(int data)
{
    struct Node *newnode = (struct Node *)malloc(sizeof(struct Node));
    newnode->data = data;
    newnode->next = NULL;
    return newnode;
}

struct Graph *createGraph(int n)
{
    struct Graph *graph = (struct Graph *)malloc(sizeof(struct Graph));
    graph->vertices = n;
    graph->adj_list = (struct Node **)malloc(n * sizeof(struct Node *));
    graph->visited = (int *)malloc(n * sizeof(int));
    for (int i = 0; i < n; i++)
    {
        graph->visited[i] = 0;
        graph->adj_list[i] = NULL;
    }
    return graph;
}

void addEdge(struct Graph *graph, int src, int dest)
{
    struct Node *newnode = createNode(dest);
    newnode->next = graph->adj_list[src];
    graph->adj_list[src] = newnode;
}

void dfs(struct Graph *graph, int startVertex)
{
    int *stack = (int *)malloc(graph->vertices * sizeof(int));
    int top = -1;
    stack[++top] = startVertex;
    while (top >= 0)
    {
        int visit = stack[top--];
        if (!graph->visited[visit])
        {
            graph->visited[visit] = 1;
            printf("%d ", visit);
        }
        struct Node *temp = graph->adj_list[visit];
        while (temp != NULL)
        {
            int adjVertex = temp->data;
            if (!graph->visited[adjVertex])
            {
                stack[++top] = adjVertex;
            }
            temp = temp->next;
        }
    }
    free(stack);
}

int main()
{
    int vertices, edges;
    printf("Enter the number of vertices: ");
    scanf("%d", &vertices);
    struct Graph *graph = createGraph(vertices);

    printf("Enter the number of edges: ");
    scanf("%d", &edges);
    for (int i = 0; i < edges; i++)
    {
        int src, dest;
        printf("Enter edge %d (source destination): ", i + 1);
        scanf("%d %d", &src, &dest);
        addEdge(graph, src, dest);
        addEdge(graph, dest, src); 
    }

    int startVertex;
    do
    {
        printf("Enter the starting vertex (0 to %d): ", graph->vertices - 1);
        scanf("%d", &startVertex);
    } while (startVertex < 0 || startVertex >= graph->vertices);

    printf("\nDFS:\n");
    dfs(graph, startVertex);
    printf("\n");

    for (int i = 0; i < graph->vertices; i++)
    {
        struct Node *temp = graph->adj_list[i];
        while (temp != NULL)
        {
            struct Node *prev = temp;
            temp = temp->next;
            free(prev);
        }
    }
    free(graph->adj_list);
    free(graph->visited);
    free(graph);

    return 0;
}
