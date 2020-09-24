/*
 * To change this license header, choose License Headers in Project Properties.  
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;



/**
 * Contains methods to implement the view in s text-type interface.
 * @author Kerman Rodríguez
 */
public class ViewImplementation implements Vista {                             

    
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }
    
}