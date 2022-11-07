public class Ejercicio09 {
    public static void main(String[] args) {
    int cont = 0;
    int n = 0;
    while(n!=24){
        n = ((int)(Math.random()*101));
        if (n%2==0)
        cont++;
    }
    System.out.println(cont);
    }
}