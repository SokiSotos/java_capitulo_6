import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int aleatorio = (int)(Math.random()*100);
    String n;
    int cont=5;
    boolean correcto=false;
    do {
        System.out.println(aleatorio);
        n = sc.next();

        if(n.equals("mayor")){
            cont--;
            aleatorio = (int)(Math.random()*(101-aleatorio)+aleatorio);
        }
        if(n.equals("menor")){
            cont--;
            aleatorio = (int)(Math.random()*aleatorio);
        }
        if(n.equals("correcto")){
            correcto=true;
            System.out.println("Soy el puto amo");
        }
        if (cont==0) {
            System.out.println("Soy un manco");
        }    
    } while((cont>0) && !correcto);
    sc.close();
    }
}
