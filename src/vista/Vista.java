/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 * Contains the definition of the method used to show the greeting to the user, which will be used by the controller
 * @author Kerman Rodríguez
 */
public interface Vista {
    /**
     * Shows the greeting to the user.
     * @param greeting String that contains the greeting to be shown.
     */
    public void showGreeting (String greeting);
}
