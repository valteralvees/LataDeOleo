package latadeoleo;
import java.util.Scanner;
/*

Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: V = 3.14159 * R * R * A, em que 
as variáveis: V, R e A  representam respectivamente o volume, o raio e a altura.
Vamos declarar as variáveis V, R e A como double e definir um valor qualquer para as  variáveis de altura e de raio. 
Agora vamos escrever a fórmula, conforme dita no enunciado e, em seguida, exibir na tela uma mensagem contendo o resultado do volume encontrado.
*/
public class LatadeOleo {
    public static void main(String[] args) {
        double volume, raio, altura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o volume");
        volume = teclado.nextDouble();
        System.out.println("Digite o raio");
        raio = teclado.nextDouble();
        System.out.println("Digite a altura:");
        altura = teclado.nextDouble();
        
       
        
    }
    
}
