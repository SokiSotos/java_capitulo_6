public class Ejercicio09 {
    public static void main(String[] args) {
    int n = 0;
    int cont = 0;
        while(n!=24){
            n = ((int)(Math.random()*51)*2);
            System.out.print(n + " ");
            cont++;
        }
        System.out.println();
        System.out.printf("El total de numeros generados han sido de %d",cont);
    }
}