/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.controller;

import byui.cit260.fireswamp.Location;
import byui.cit260.fireswamp.exceptions.MapControllerException;

/**
 *
 * @author ryahh
 */
public class MapController {

    public MapController() {
    
    }
    
    public boolean checkMove(int row, int col) {
        if((row < 0 || row > 4) || (col < 0 || col > 4)) {
            return false;
        }
        return true;
    }
    
//    public boolean checkMoveNorth(int row) throws MapControllerException {
//            if (row < 0 || row > 4){
//                return false;
//            }
//            else return true;
//    }
//    
//    public boolean checkMoveEast(Location location){
//            if (location.getLocationColumn()< 0){
//                return false;
//            }
//            return true;
//    }
//    
//    public boolean checkMoveSouth(Location location){
//            if (location.getLocationRow() < 0){
//                return false;
//            }
//            return true;
//    }
//    
//    public boolean checkMoveWest(Location location){
//            if (location.getLocationColumn() < 0){
//                return false;
//            }
//            return true;
//    }
    
    
}
