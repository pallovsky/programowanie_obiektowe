package lab1;

public class PrimeNumbers {
    private static int [] Prepare(int n){
        int [] tablica = new int[n];
        for(int a = 1; a< n; a++){
            tablica[a] = 1;
        }
        return tablica;
    }
    private static void Print(int [] tab, int n){
        for (int a = 0; a<n; a++){
            if(tab[a] == -1){
                System.out.print(a);
                System.out.print("\n");
            }
        }
    }
    public static void Generate (int n){
        int [] tab = Prepare(n);
        double k = Math.sqrt(n);
        for (int a = 1; a < k; a++){
            int aa = a * a;
            for ( int b = 1; b < k; b++){
                int bb = b * b;
                int z = 4 * aa + bb;
                if( z <= n &&( z % 12 == 1 || z % 12 == 5)){
                    tab[z] *=(-1);
                }
                z  -= aa;
                if(z<= n && z % 12 == 7 ){
                    tab[z] *= (-1);
                }
                if(a <= b){
                    continue;
                }
                z = 3* aa - bb;
                if(z <= n && z % 12 == 11){
                    tab[z] *=(-1);
                }
            }
        }
        for( int i = 5; i< k; i++){
            if(tab[i] == 1){
                continue;
            }
            int xx = i*i;
            int z = xx;
            while(z <n){
                tab[z] = 1;
                z += xx;
            }
            tab[2] = -1;
            tab[3] = -1;
        }
        Print(tab, n);
    }
}