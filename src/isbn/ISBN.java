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
    
    public ISBN() {

    }

    public ArrayList insertar() {
        
        int nPartidos;
        String nombre;
        int votos;
        
        System.out.println("Nº partidos");

        nPartidos = LecturaNpartidos.nextInt();

        for (int i = 0; i < nPartidos; i++) {

            System.out.println("Nombre");
            nombre = LecturaNombre.nextLine();

            System.out.println("Cantidad votos");
            votos = LecturaVotos.nextInt();

            partidos.add(nombre);
            partidos.add(votos);
        }

        return partidos;
    }
}
