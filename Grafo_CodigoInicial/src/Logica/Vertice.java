/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Ritchel
 */
public class Vertice {
    	//Atributos
	
	Object element;
	
	boolean visited; //
	boolean destination;  //
	
	public Vertice(Object element) {
		this.element = element;
		this.visited = false;
		this.destination = false;
	}
}
