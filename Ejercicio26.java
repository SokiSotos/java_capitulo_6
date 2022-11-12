import java.util.Scanner;
public class Ejercicio26{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduzca la altura de la tableta");
    int alto=sc.nextInt();
    System.out.println("Introduzca el ancho de la tableta");
    int ancho=sc.nextInt();
    
    int posicion=0;
    int posicionbocado = (int) (Math.random() * (ancho * 2 + (alto - 2) * 2));
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
            boolean estaEnBorde = (i == 0) || (i == alto - 1) || (j == 0) || (j == ancho - 1);
            
                if ((posicion == posicionbocado) && estaEnBorde) {
                    System.out.print(" ");
                } 
                else {
                    System.out.print("*");
                }
                
                if (estaEnBorde) {
                    posicion++;
                }
            }
                System.out.println();
        }
    sc.close();
    }
}