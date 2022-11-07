public class Ejercicio10 {
    public static void main(String[] args) {
         String caracter="";
        for(int j=0;j<=9;j++){
            int aleatorio = (int)(Math.random()*6);
                for(int i=1;i<(int)(Math.random()*40)+1;) {         
                    switch(aleatorio) {
                        case 0:
                            caracter = "*";
                        break;
                        case 1:
                            caracter = "-";
                        break;
                        case 2:
                            caracter = "=";
                        break;
                        case 3:
                            caracter = ".";
                        break;
                        case 4:
                            caracter = "|";
                        break;
                        case 5:
                            caracter = "@";
                    default:
                    }
                    System.out.print(caracter + " ");
                }
            System.out.println();
        }
    }
  }