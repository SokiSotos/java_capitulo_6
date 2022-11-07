public class Ejercicio11 {
    public static void main(String[] args) {
        String nota="";
        int insu=0;
        int sufi=0;
        int bien=0;
        int notab=0;
        int sobre=0;
        for(int i=1;i<=20;i++){
            int aleatorio = (int)(Math.random()*5);
                switch(aleatorio) {
                    case 0:
                        nota = "Insuficiente ";
                        insu++;
                    break;
                    case 1:
                        nota = "Suficiente ";
                        sufi++;
                    break;
                    case 2:
                        nota = "Bien ";
                        bien++;
                    break;
                    case 3:
                        nota = "Notable ";
                        notab++;
                    break;
                    case 4:
                        nota = "Sobresaliente ";
                        sobre++;
                    break;
                default:
                }
            System.out.println(nota + " ");
        }
            System.out.printf("La cantidad de Insuficientes es de %d\n"+
                            "La cantidad de Suficientes es de %d\n"+
                            "La cantidad de Bienes es de %d\n"+
                            "La cantidad de Notables es de %d\n"+
                            "La cantidad de Sobresalientes es de %d\n",insu,sufi,bien,notab,sobre);
    }
}
