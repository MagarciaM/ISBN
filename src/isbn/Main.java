/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isbn;

import java.util.ArrayList;

/**
 *
 * @author migue
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ISBN a = new ISBN();
        
        ArrayList partidos =  a.insertar();
        
        for (int i = 0; i < partidos.size(); i++) {
            
            System.out.println( i + " " + partidos.get(i));
        }
        
    }
}
