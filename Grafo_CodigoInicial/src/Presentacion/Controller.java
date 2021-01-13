/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.GrafoException;
import Logica.GrafoMatriz;

/**
 *
 * @author Ritchel
 */
public class Controller {
    GrafoMatriz gm;
	
	public Controller() {
		gm = new GrafoMatriz(6);
		control();
	}
	
	public void control() {
		
		try {
			
			gm.addVertex("A");
			gm.addVertex("B");
			gm.addVertex("C");
			gm.addVertex("D");
			gm.addVertex("E");
			gm.addVertex("F");
			
			gm.addEdge("A", "B");
			gm.addEdge("B", "C");
			gm.addEdge("B", "F");
			gm.addEdge("C", "F");
			gm.addEdge("A", "D");
			gm.addEdge("D", "F");

			System.out.println(gm.toString());
			
		} catch (GrafoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
	}

}
