package fatc.poo.model;

/**
 *
 * @author maran
 */
public class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }    
    
    public String CheckYouself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        
        for(int cell : locationCells){
            if(guess == cell){
                result = "hit";
                numOfHits++;
                break;
            }            
        }
        
        if (numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
    
}
