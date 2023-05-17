import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);      

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int [m][n];

        for(int i = 0; i < m; i++) {
            System.out.println("Digite um numero");
            for(int z = 0; z < n; z++) {
                mat[i][z] = sc.nextInt();
            }
        }

        int number = sc.nextInt();

        for(int i = 0; i < m; i++) {
            for(int z = 0; z < n; z++) {
                if(mat[i][z] == number) {
                    System.out.println("Position [" + i + ", " + z + "]");
                    if(z > 0) {
                        System.out.println("Left: " + mat[i][z-1]);
                    }
                    if(z <= m-1) {
                        System.out.println("Right: " + mat[i][z+1]);
                    }

                    if(i > 0) {
                        System.out.println("Up: " + mat[i-1][z]);
                    }
                    if(i <= n-1) {
                        System.out.println("Down: " + mat[i][z-1]);
                    }
                }
            }
        }
    }
}
