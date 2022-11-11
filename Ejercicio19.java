public class Ejercicio19 {
    public static void main(String[] args) {
        int minimo=100;
        int maximo=0;
        int suma=0;
        for(int i = 0; i < 50; i++){
            int n= (int)(Math.random()*300)-100;
                System.out.print(n + (" "));
            suma+=n;

            if (n<minimo && n%2!=0){
                minimo=n;
            }
              
            else if (n>maximo && n%2==0){
                maximo=n;
            }
        }
        System.out.println("\nEl numero mínimo impar es: " + minimo + "\nEl numero máximo par es: " + maximo + "\nLa media de los 50 numeros es: " + suma / 50);
    }
}