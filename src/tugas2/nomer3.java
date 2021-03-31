package tugas2;
public class nomer3 {
     public static void main(String[] args) {
        int[][] N = {
            {4,5},
            {6,7},
            {8,9}
        };
        int [][] M = {
            {31,32},
            {33,34},
            {35,36}
        };
        
        int baris_a = N.length;
        int kolom_a = N[0].length;
        int baris_b = M.length;
        int kolom_b = M[0].length;
        int[][] hasilKali = new int[baris_a][kolom_b];
        for (int i=0; i<baris_a; i++){
            for (int j=0; j<kolom_b; j++){
                for (int k=0; k<kolom_a; k++){
                    hasilKali[i][j] = hasilKali[i][j] + (N[i][k]*M[k][j]);                                      
                }
            }
        }
        for (int[] x: hasilKali){
            for (int Y: x){
                System.out.print(Y+" ");                
            }
            System.out.println();
        }
         
     }
    
}
