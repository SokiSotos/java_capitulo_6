import java.util.Scanner;
public class Ejercicio29 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otoño");
    System.out.println("4. Invierno");
    System.out.print("Seleccione la estación del año (1-4): ");
    int estacion = Integer.parseInt(sc.nextLine());

    int temperaturaMinima = 0;
    int temperaturaMaxima = 0;
    String cielo = "";
    
    switch(estacion) {
      case 1:
        temperaturaMinima = (int)(Math.random() * 16 + 15); 
        temperaturaMaxima = (int)(Math.random() * 16 + 15);
        cielo = Math.random() <= 0.6 ? "Soleado" : "Nublado";
        break;
      case 2: 
        temperaturaMinima = (int)(Math.random() * 21 + 25); 
        temperaturaMaxima = (int)(Math.random() * 21 + 25);
        cielo = Math.random() <= 0.8 ? "Soleado" : "Nublado";
        break;
      case 3: 
        temperaturaMinima = (int)(Math.random() * 11 + 20); 
        temperaturaMaxima = (int)(Math.random() * 11 + 20);
        cielo = Math.random() <= 0.4 ? "Soleado" : "Nublado";
        break;
      case 4: 
        temperaturaMinima = (int)(Math.random() * 26); 
        temperaturaMaxima = (int)(Math.random() * 26);
        cielo = Math.random() <= 0.2 ? "Soleado" : "Nublado";
        break;
      default:
        System.out.println("La estación seleccionada no es correcta.");
    }
    
    if (temperaturaMinima > temperaturaMaxima) {
      int aux = temperaturaMinima;
      temperaturaMinima = temperaturaMaxima;
      temperaturaMaxima = aux;
    }
    
    System.out.println("\nPrevisión del tiempo para mañana");
    System.out.println("--------------------------------");
    System.out.println("Temperatura mínima: " + temperaturaMinima);
    System.out.println("Temperatura máxima: " + temperaturaMaxima);
    System.out.println(cielo);
    sc.close();
  }
  
}