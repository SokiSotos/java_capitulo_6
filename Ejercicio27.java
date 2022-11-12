import java.util.Scanner;
public class Ejercicio27{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Turno del jugador (introduzca Piedra, Papel o Tijera): ");
    String mano=sc.next();
        String m = "";
        System.out.print("Turno del ordenador: ");
            switch((int)(Math.random()*3)) {
                case 0:
                  m = "Piedra";
                  break;
                case 1:
                  m = "Papel";
                  break;
                case 2:
                  m = "Tijera";
                  break;
                default:
            }
            System.out.println(m);
            if (mano.equals(m)) {
                System.out.println("Empate");
            } 
            else {
                int ganador = 2;
                switch (mano) {
                    case "piedra":
                        if (m.equals("Tijera")) {
                        ganador = 1;
                        }
                        break;
                    case "papel":
                        if (m.equals("Piedra")) {
                        ganador = 1;
                        }
                        break;
                    case "tijera":
                        if (m.equals("Papel")) {
                        ganador = 1;
                        }
                        break;
                    default:      
                }
                
                if (ganador == 1) {
                  System.out.println("Ganas");
                } else {
                  System.out.println("Pierde la maquina");
                }
                
            }
    sc.close();
    }         
}                
