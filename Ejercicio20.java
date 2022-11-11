import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Por favor, indique la capacidad de la cuba en litros");
    int capacidad=sc.nextInt();
    
    int litros = (int)(Math.random() * (capacidad + 1));
        
    for (int i = 0; i < capacidad; i++) {
        if (i < (capacidad - litros)) {
            System.out.println("#    #");
        } 
        else {
            System.out.println("#====#");
        }
    }
        System.out.println("######");
        System.out.println("La cuba tiene una capacidad de " + capacidad + " litros y contiene " + litros + " litros de agua");
    sc.close();
    }
}