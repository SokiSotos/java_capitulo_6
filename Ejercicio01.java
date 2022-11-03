public class Ejercicio01 {
    public static void main(String[] args) {
      int tir;
      int sum = 0;
      System.out.println("Tirada de tres dados: ");
      for(int i = 0; i < 3; i++) {
            tir = (int)(Math.random() * 6) + 1;
              System.out.print(tir + " ");
                sum += tir;
      }
      System.out.println("\nLa suma de los 3 dados es: " + sum);
    }
  }