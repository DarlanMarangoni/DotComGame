package fatc.poo.model;

import java.util.ArrayList;

/**
 *
 * @author maran
 */
public class DotCom {
    private ArrayList<String> locationCells;
    private String nomeDot;
    //private int numOfHits = 0;

    public DotCom(String nomeDot) {
        this.nomeDot = nomeDot;
    }    

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }    
    
    public String CheckYouself(String stringGuess){
        //int guess = Integer.parseInt(stringGuess);
        String result = "errado";
        
        int index = locationCells.indexOf(stringGuess);
              
        if (index >= 0){
            locationCells.remove(index);
            
            if(locationCells.isEmpty()){
               result = "eliminar"; 
            }
            else{
                result = "correto";
            }
        }
        
        return result;
    }
    
}
