import fatc.poo.model.GameHelper;
import fatc.poo.model.DotCom;
import fatc.poo.model.DotComBust;
import java.util.Scanner;

/**
 *
 * @author maran
 */
public class Aplic {

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();        
    }    
}
