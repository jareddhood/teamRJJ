/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.view;

import FireSwamp.FireSwamp;
import byui.cit260.fireswamp.LocationType;
import byui.cit260.fireswamp.Map;
import byui.cit260.fireswamp.controller.MapController;
import byui.cit260.fireswamp.controller.MoveController;

/**
 *
 * @author blvd
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
        super("\nGame Menu"
            + "\nW - Move North"
            + "\nS - Move South"
            + "\nA - Move West"
            + "\nD - Move East"
            + "\nV - View Map"
            + "\nL - Look"
            + "\nT - Listen"
            + "\nB - Smell"    
            + "\nI - Check Inventory"
            + "\nE - Take Item"
            + "\nH - Help Menu"
            + "\nG - Save Game"
            + "\nQ - Quit to main menu");

    }

    public boolean doAction(String selection) {

        char charSel = selection.charAt(0);
        
        MapController mc = new MapController();
        MapMenuView mmv = new MapMenuView();
        Map map = new Map();
        map.init();
        //SensesController sc = new SensesController();
        //InventoryView iv = new InventoryView();
        //InventoryController ic = new InventoryController();
        switch (charSel) {
            case 'W':
                this.moveNorth();
                break;
            case 'S':
                this.moveSouth();
                break;
            case 'A':
                this.moveWest();
                break;
            case 'D':
                this.moveEast();
                break;
            case 'V':
                this.displayMap();
                break;
            case 'L':
                //Insert reference to Look Method()
                break;
            case 'T':
                //Insert reference to Listen Method()
                break;
            case 'B':
                //Insert reference to Smell Method()
                break;
            case 'I':
                //Insert reference to Check Inventory Method()
                break;
            case 'E':
                //Insert reference to Take Item Method()
                break;
            case 'H':
                HelpMenuView hmv = new HelpMenuView();
                hmv.display();
                break;
            case 'G':
                //Insert reference to Save Game Method();
                break;
            case 'Q':
                return true;
            default:
                System.out.println("Invalid Input - Please try again.");
                break;
        }
        return false;
    }
    
    //Displays the map
    private void displayMap() {
        
        System.out.println("Map Index: \n\n"
                + "N: No Dangers"
                + "\nF: Fire Spout"
                + "\nR: ROUS Rats of Unusual Size"
                + "\nL: Lightning Sand"
                + "\nS: Your Start position"
                + "\nE: Your End position"
                + "\n");
        
        Map map = FireSwamp.getCurrentGame().getGameMap();
        
        for(int row = 0; row < Map.ROWS; row++) {
            for(int col = 0; col < Map.COLUMNS; col++) {
                char locationType = map.getLocationAt(row, col).getLocationType().toString().charAt(0);
                System.out.print(locationType + "\t");
                
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
    }

    private void moveNorth() {
        MoveController mc = new MoveController();
        boolean success = mc.moveNorth();
        if(!success){
            System.out.println(" ");
        }
    }

    private void moveSouth() {
       MoveController mc = new MoveController();
        boolean success = mc.moveSouth();
        if(!success){
            System.out.println(" ");
        }
    }

    private void moveWest() {
        MoveController mc = new MoveController();
        boolean success = mc.moveWest();
        if(!success){
            System.out.println(" ");
        }
    }

    private void moveEast() {
      MoveController mc = new MoveController();
        boolean success = mc.moveEast();
        if(!success){
            System.out.println(" ");
        }
    }
    
    
}
