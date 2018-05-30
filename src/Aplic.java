import fatc.poo.model.SimpleDotCom;
import java.util.Scanner;

/**
 *
 * @author maran
 */
public class Aplic {

    public static void main(String[] args) {
        int randomNum;
        String userGuess;
        
        Scanner in = new Scanner(System.in);
        
        SimpleDotCom dot = new SimpleDotCom();
        //gera um numero aleatório entre 0 e 5 e armazena na variavel random
        randomNum = (int) (Math.random()* 5);
        System.out.println("numero gerado: "+randomNum);
        //cria uma matriz de 1inteiro de tres posições e armazena numeros sequenciais a partir do aleatório
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        //envia a matriz de inteiro para o metodo abaixo
        dot.setLocationCells(locations);
        
        while(dot.getNumOfHits()<3){
            System.out.println("Digite o Palpite:");
            userGuess = in.next();        
            String result = dot.CheckYouself(userGuess);
        }
    }
    
}
