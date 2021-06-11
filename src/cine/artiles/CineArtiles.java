/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.artiles;

import javax.swing.JOptionPane;

/**
 * @version V3 
 * @author Jan Oskar
 */
public class CineArtiles {

    /**
     * Este es el main que hace de menu
     * 
     * Estructura
     * crea objeto CineArtilesReserva
     * do{
     * case 1:..
     * case 2:..
     * }while
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables del main
        int option=0;
        int asientos;
        
        //creamos objeto CineArtilesReserva
        CineArtilesReserva micine= new CineArtilesReserva(180);
        
        //menu
        do {
            option = Integer.parseInt (JOptionPane.showInputDialog(null,"Bienven"
                    + "ido a cines Artesiete " + "\n Hay "+ micine.consultar()
                    + " plazas disponibles para ver King Kong"+ "\nPor favor eli"
                    + "ja una de las siguientes opciones: "       
                    + "\n 1-Reservar Asientos"
                    + " \n 2-Cancelar Asientos "
                    + "\n 3-Asientos Disponibles "
                    + "\n 0-salir"));   
            switch (option){
         
            case 1://Reservar asientos
                asientos = Integer.parseInt (JOptionPane.showInputDialog(null, ""
                        + "Introduzca la cantidad de asientos que desea reservar"));
                if(asientos<=micine.consultar()){
                    micine.reservar(asientos);
                    JOptionPane.showMessageDialog(null, "Gracias,acaba de reserv"
                        + "ar "+ asientos);
                }else{
                    JOptionPane.showMessageDialog(null, "Disculpe no disponemos "
                        + "de tantos asientos,tenemos disponibles "+micine.consultar());
                }

                break;

            case 2://Cancelar asientos
                asientos = Integer.parseInt (JOptionPane.showInputDialog(null, ""
                        + "Introduzca la cantidad de asientos que desea cancelar"));
                if((asientos+micine.consultar())<=180){
                    micine.cancel(asientos);
                    JOptionPane.showMessageDialog(null, "Acaba de cancelar "
                        + asientos+" disculpe las molestias");
                }else{
                    JOptionPane.showMessageDialog(null, "Disculpe no puede cance"
                        + "lar tantas entradas ya que no las a comprado,solo"
                        + " a comprado "+(180-micine.consultar()));
                }

            break;

            case 3://Asientos disponibles
                JOptionPane.showMessageDialog(null, "Hay "+ micine.consultar() +" de acientos libres ");     
                break;
            
            case 0://caso que sale del menu
                option=0;
                break;
                
            default://caso donde se equivica el usuario
                JOptionPane.showMessageDialog(null, "Escriba un numero valido");
                break;    
           } 
        } while (option != 0);
         JOptionPane.showMessageDialog(null, "Gracias,Esperamos verle pronto");
    }
    
}
