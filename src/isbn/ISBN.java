/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isbn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class ISBN {

    ArrayList partidos = new ArrayList();
    Scanner LecturaNpartidos = new Scanner(System.in);
    Scanner LecturaNombre = new Scanner(System.in);
    Scanner LecturaVotos = new Scanner(System.in);
    Scanner LecturaEscanios = new Scanner(System.in);
    
    public ISBN() {

    }

    public ArrayList insertar() {
        
        int nPartidos;
        int nEscanios;
        String nombre;
        int votos;
        int escanios = 0;
        
        System.out.println("Introduce el numero de partidos ");

        nPartidos = LecturaNpartidos.nextInt();
        
        System.out.println("Introduce el numero de escaños ");
        
        nEscanios = LecturaEscanios.nextInt();

        for (int i = 0; i < nPartidos; i++) {

            System.out.println("Nombre del " + i + " partido.");
            nombre = LecturaNombre.nextLine();

            System.out.println("Cantidad votos");
            votos = LecturaVotos.nextInt();

            partidos.add(nombre);
            partidos.add(votos);
            partidos.add(escanios);
        }
        
        for (int f = 0; f < nEscanios ; f++){
            for (int j = 1 ; j < (nPartidos*3) ; j=j+3){
                
            }
            
        }

        return partidos;
    }
}
