#include<stdio.h>
#include<stdlib.h>
#define max 6

int adj[max][max];
int que[max];
int visited[max]={0};
int rear=0,front=0;

int addedge(int source, int dest)
{
	adj[source][dest]=1;
	adj[dest][source]=1;
}

int bfs(int start)
{
	que[rear++]=start;
	visited[start]=1;
	while(front<rear)
	{
		int current=que[front++];
		printf("%d ",current);
		for(int i=0;i<max;i++)
		{
			if(adj[current][i]==1 && visited[i])
			{
				que[rear++]=i;
				visited[i]=1;
			}
		}
	}
}

int main()
{
	int source,destination;
	for(int i=0;i<max;i++)
	{
		for(int j=0;j<max;j++)
		{
			adj[i][j]=0;
		}
	}
	for(int i=0;i<max;i++)
	{
		printf("enter source and destination");
		scanf("%d%d",&source,&destination);
		addedge(source,destination);
	}
	
	printf("bfs\n");
	bfs(1);
	printf("\n");
	printf("matrix representation is\n");
	for(int i=0;i<max;i++)
	{
		for(int j=0;j<max;j++)
		{
			printf("%d ",adj[i][j]);
		}
		printf("\n");
	}
}
