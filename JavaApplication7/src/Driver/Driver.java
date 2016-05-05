/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;
import controller.*;
import model.*;

/**
 *
 * @author Hilmi EA
 */
public class Driver {
    public static void main(String[] args) {
        Aplikasi model = new Aplikasi();
        new ControllerViewLogin(model);
        
    }
    
}
