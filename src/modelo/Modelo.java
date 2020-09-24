/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Contains a method used to get the greeting from the database which will be used by the controller
 * @author Kerman Rodríguez
 */
public interface Modelo {
    /**
     *  Method used to get the String greeting from a database.
     * @return The string with the greeting. 
     */
    public String getModel();
}
