/* Realiza un programa que genere una secuencia de cinco monedas de curso legal lanzadas al aire.
Las monedas disponibles son de 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros.
Las dos posiciones posibles son cara y cruz. */

public class Ejercicio21 {
    public static void main(String[] args) {
        String c = "";
        String m = "";
        for(int i = 0; i<5; i++){
            switch((int)(Math.random()*2)) {
                case 0:
                  c = "cara";
                  break;
                case 1:
                  c = "cruz";
                  break;
                default:
              }
            switch((int)(Math.random()*8)) {
                case 0:
                  m = "1 céntimo";
                  break;
                case 1:
                  m = "2 céntimos";
                  break;
                case 2:
                  m = "5 céntimos";
                  break;
                case 3:
                  m = "10 céntimos";
                  break;
                case 4:
                  m = "20 céntimos";
                  break;
                case 5:
                  m = "50 céntimos";
                  break;
                case 6:
                  m = "1 euro";
                  break;
                case 7:
                  m = "2 euros";
                default:
              }
            System.out.println(m +  " - " + c);     
        }                
    }
}
