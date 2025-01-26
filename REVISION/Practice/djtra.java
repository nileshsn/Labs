import java.util.*;
class Dj{
    int e[][], c[], v[], k;
    Dj(int e[][], int c[], int v[]){
        this.e = e;
        this.c = c;
        this.v = v;
        k = e.length;
        path();
    } 
    void path(){
        while(k>0){
            int min = Integer.MAX_VALUE;
            int id = -1;
            for(int i=0; i<e.length; i++){
                if(v[i] == -1){
                    if(c[i]<min){
                        min = c[i];
                        id = i;
                    }
                }
            }
            v[id] = 1;
            for(int j=0; j<e.length; j++){
                if(e[id][j] != -1){
                    if((c[id]+e[id][j])<c[j]){
                        c[j] = (c[id]+e[id][j]);
                    }
                }
            }
            k--;
        }
        for(int i=0; i<e.length; i++){
            System.out.println(c[i]);
        }
    }
}
public class djtra{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of edges: ");
        int n = in.nextInt();
        int e[][] = new int[n][n];
        int c[] = new int[n];
        int v[] = new int[n];
        c[0] = 0;
        v[0] = -1;
        for(int i=1; i<n; i++){
            c[i] = Integer.MAX_VALUE;
            v[i] = -1;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                e[i][j] = -1;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                System.out.println("Edges of "+i+" & "+j+": ");
                e[i][j] = e[j][i] = in.nextInt();
            }
        }
        new Dj(e, c, v);
    }
}