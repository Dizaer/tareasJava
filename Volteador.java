import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String texto=lector.nextLine(), textoVolteado = "";
        String caracterAuxiliar;
        lector.close();
        for (int k=texto.length();k>=1;k--){
            caracterAuxiliar=texto.substring(k-1, k);
            textoVolteado+=caracterAuxiliar;
        }
        System.out.print(textoVolteado);
    }
}