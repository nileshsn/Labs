class Omp{
    Integer f[];
    int rval;
    Omp(){
        Integer f[] = {10, 12, 8, 6, 5, 3, 4};
        this.f = f;
        this.rval = 0;
        System.out.println(osort(f.length));
    }
    int osort(int n){
        if(n == 2){
            int val = f[n-1]+f[n-2];
            return val;
        }
        swap(n);
        swap(n-1);
        int val = f[n-1]+f[n-2];
        f[n-2] = val;
        rval += val+osort(n-1);
        return rval;
    }
    void swap(int n){
        int s = 0; 
        for(int i=1; i<n; i++){
            if(f[i]<f[s]){
                s = i;
            }
        }
        int temp = f[n-1];
        f[n-1] = f[s];
        f[s] = temp;
    }
}
public class ompb{
    public static void main(String[] args){
        new Omp();
    }
}