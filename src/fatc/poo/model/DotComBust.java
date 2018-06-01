package fatc.poo.model;

import java.util.ArrayList;

/**
 *
 * @author maran
 */
public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;
    
    public void setUpGame(){
        DotCom one = new DotCom("Pets.com");
        DotCom two = new DotCom("eToys.com");
        DotCom three = new DotCom("Go2.com");
        
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        
        System.out.println("Seu objetivo é eliminar tres dot coms");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Tente eliminar todas com o menor numero de palpites");
        
        for (DotCom dotComToSet : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }//encerra for
    }//encerra metodo
    
    public void startPlaying(){
        while(!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Insira o palpite");
            checkUserGuess(userGuess);
        }//encerra o while        
    }//encerra o metodo
    
    public void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "errado";
        for (DotCom dotComToTest : dotComsList){
            result = dotComToTest.CheckYouself(userGuess);
            if(result.equals("correto")){
                break;
            }
            if (result.equals("eliminar")){
                dotComsList.remove(dotComToTest);
                break;
            }            
        }//encerra o for
        System.out.println(result);        
    }//encerra o metodo
    
    public void finishGame(){
        System.out.println("Todas as Dot Coms foram eleminadas!");
        if (numOfGuesses <= 18){
            System.out.println("foi rapido");
        }else{
            System.out.println("demorou bastante");
        }
    }//encerra o metodo
}
