/*
 * @author jared
 */

package byui.cit260.fireswamp.view;
import byui.cit260.fireswamp.controller.MapController;
import java.util.Scanner;


public class MapMenuView extends View {
    private int row, column;

    public MapMenuView() {
        super("\nMap Menu"
            + "\nO - Open Map"
            + "\nL - Return to Game"
            + "\nQ - Quit"
            + "\n");
    }

    public boolean doAction(String selection) {

        char charSel = selection.charAt(0);

        switch (charSel) {
            case 'O':
                                
                break;
            case 'L':
                //returnGame();
                break;
            case 'Q':
                return true;
            default:
                console.println("Invalid Input - Please try again.");
                break;
        }
        return false;
    }
    

}