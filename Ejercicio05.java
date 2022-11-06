public class Ejercicio05 {
    public static void main(String[] args) {
    int minimo=199;
    int maximo=0;
    int suma=0;
    int n;
        for(int i = 0; i < 50; i++){
            n = (int)(Math.random()*100+100);
            System.out.print(n + " ");
            suma+=n;

            if (n<minimo){
                minimo=n;
            }
              
            else if (n>maximo){
                maximo=n;
            }
        }
        System.out.println("\nEl numero mínimo es: " + minimo + "\nEl numero máximo es: " + maximo + "\nLa media de los 50 numeros es: " + suma / 50);
    }
}