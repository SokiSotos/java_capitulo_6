import java.util.Scanner;
public class Ejercicio17{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduzca la altura de la pecera (minimo 4)");
    int alto=sc.nextInt();
    System.out.println("Introduzca el ancho de la pecera (minimo 4)");
    int ancho=sc.nextInt();
    
    int posicion=0;
    int posicionPez=(int)(Math.random()*(alto-2)*(ancho-2));
        for(int i=0; i<ancho; i++){
            System.out.print("*");
        }
            System.out.println();
        for(int i=2; i<alto; i++){
            System.out.print("*");
                for(int j=2; j<ancho; j++){
                    if(posicion==posicionPez){
                        System.out.print("&");
                    } 
                    else{
                        System.out.print(" ");
                    }
                        posicion++;
        } 
            System.out.println("*");
        }
        for(int i=0; i<ancho; i++){
            System.out.print("*");
        }
        sc.close();
    }
}