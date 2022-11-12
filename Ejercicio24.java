import java.util.Scanner;
public class Ejercicio24{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int n=sc.nextInt();
    long n1=n;
    int longitud = 0;
        do {
            n /= 10;
            longitud++;
        } while (n > 0);

    int posicion = (int)(Math.random()*longitud)+1;

        System.out.println((n1/(long)(Math.pow(10,longitud-posicion)))%10);
    sc.close();
    }
}