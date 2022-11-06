import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int aleatorio = (int)(Math.random()*100);
    int n;
    int cont=5;
    boolean correcto=false;
    do {
        System.out.println("Introduzca un numero del 0 al 100");
        n = sc.nextInt();

        if(aleatorio<n){
            cont--;
            System.out.println("El numero es menor que " + n + " le quedan " + cont + " intentos");
        }
        if(aleatorio>n){
            cont--;
            System.out.println("El numero es mayor que " + n + " le quedan " + cont + " intentos");
        }
        if(aleatorio==n){
            correcto=true;
            System.out.println("El numero " + n + " es correcto, le han sobrado " + cont + " intentos");
        }
        if(cont==0)
        System.out.println("No le quedan mas intentos, el numero era " + aleatorio);

    } while((cont>0) && !correcto);
    sc.close();
    }
}
