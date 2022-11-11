public class Ejercicio22 {
    public static void main(String[] args) {
    System.out.print("Por favor, introduzca la longitud de la serpiente ");
    System.out.print("contando la cabeza: ");
    int longitud = Integer.parseInt(System.console().readLine());  
    System.out.println("\n            @");
    int i;
    int x = 13;
        while (longitud > 1) {
                x += (int)(Math.random() * 3) - 1;
            for (i = 1; i < x; i++) {
                System.out.print(" ");
            }
                System.out.println("#");
            longitud--;
        }
    }
}