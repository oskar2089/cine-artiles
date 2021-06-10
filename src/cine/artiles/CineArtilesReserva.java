/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.artiles;

/**
 * @version V1
 * @author Jan Oskar
 */
public class CineArtilesReserva {
    
    //Variables compartidas por las clases
    private	int	numAsientosFree;
    private	int	numAsientosCinema;
    

    /**
     * Constructor del CineArtilesReserva
     * 
     * Descripcion:
     * Asigna valor a las variables que le pasan
     * @param asientos
     */
    public CineArtilesReserva(int asientos){
        numAsientosCinema=asientos;
        numAsientosFree=numAsientosCinema;
    }   

    /**
     * Metodo Reserva
     * 
     * Descripcion:
     * Este metodo resta los asientos que se quiere reservar a los asientos libres
     * @param nasientos
     */
    public void	reservar(int nasientos){
        numAsientosFree=numAsientosFree-nasientos;  
    }
        
    /**
     * Metodo Cancel
     * 
     * Descripcion:
     * Este metodo suma los asientos que se quiere cancelar a los asientos libres
     * @param nasientos
     */
    public void	cancel(int nasientos){
        numAsientosFree+=nasientos;
    }        

    /**
     * Metodo Cansultar
     * 
     * Descripcion:
     * Este metodo sirve para consultar los asientos libres 
     * @return numAsientosFree
     */
    public	int	consultar(){
        return numAsientosFree;
    }    
}
