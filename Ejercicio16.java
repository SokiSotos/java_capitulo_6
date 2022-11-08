public class Ejercicio16 {
    public static void main(String[] args) {
        int figura;
        int figura1=0;
        int figura2=0;
        int figura3=0;
        for (int i=0; i<3; i++) {
            figura = (int)(Math.random()*4) + 1;
            switch(figura) {
                case 0:
                    System.out.print("|Corazon|");
                break;
                case 1:
                    System.out.print("|Diamante|");
                break;
                case 2:
                    System.out.print("|Herradura|");
                break;
                case 3:
                    System.out.print("|Campana|");
                break;
                case 4:
                    System.out.print("|Limon|");
                break;
                default:
            }
            switch(i) {
                case 0:
                    figura1=figura;
                break;
                case 1:
                    figura2=figura;
                break;
                case 2:
                    figura3=figura;
                break;
                default:
            }
        }
        if((figura1!=figura2)&&(figura2!=figura3)&&(figura1!=figura3)){
            System.out.println("\nNo has ganado ninguna moneda");
            }
            else if((figura1==figura2)&&(figura2==figura3)){
                System.out.println("\nHas ganado 10 monedas");
            }
            else{
                System.out.println("\nHas recuperado 1 moneda");
            }
    }
}