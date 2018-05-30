import fatc.poo.model.GameHelper;
import fatc.poo.model.SimpleDotCom;
import java.util.Scanner;

/**
 *
 * @author maran
 */
public class Aplic {

    public static void main(String[] args) {
        int numOfGuesses = 0;
        
        //criando o objeto da classe auxiliar
        GameHelper helper = new GameHelper();    
        
        SimpleDotCom theDotCom = new SimpleDotCom();
        //gera um numero aleatório entre 0 e 5 e armazena na variavel random
        int randomNum = (int) (Math.random()* 5);
        System.out.println("numero gerado: "+randomNum);
        //cria uma matriz de 1inteiro de tres posições e armazena numeros sequenciais a partir do aleatório
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        //envia a matriz de inteiro para o metodo abaixo
        theDotCom.setLocationCells(locations);
        //criando uma variavel para saber se ta vivo
        boolean isAlive = true;
        
        while(isAlive == true){
           String userGuess = helper.getUserInput("Insira um numero");
           
           String result = theDotCom.CheckYouself(userGuess);
           
           numOfGuesses++;
           if (result.equals("kill")){
               isAlive = false;
               System.out.println("Voce usou: "+numOfGuesses + " palpites");
           }
        }
    }
    
}
