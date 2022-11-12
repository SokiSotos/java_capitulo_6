public class Ejercicio25 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
        int n = (int)(Math.random() * 191) + 10;
  
            boolean esPrimo = true;
            for (int j = 2; j < n; j++) {
                if ((n % j) == 0) {
                    esPrimo = false;
                }
            }
            
                if (esPrimo) {
                    System.out.print("#" + n + "#  ");
                } 
                else if ((n % 5) == 0) {
                    System.out.print("[" + n + "]  ");
                } 
                else {
                    System.out.print(n + "  ");
                }
        }
    }
}