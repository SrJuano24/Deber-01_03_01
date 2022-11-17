/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_01_03.vista;

import Deber_01_03.Control.FacturaControl;

/**
 *
 * @author Juano
 */
public class Principal {

    public static void main(String[] args) {
        var facturaControl = new FacturaControl();
        var data = new String[13];
        data[0] = "01";
        data[1] = "AMAZON";
        data[2] = "0102453949001";
        data[3] = "Pio Bravo";
        data[4] = "4112349";
        data[5] = "20";
        data[6] = "25.8";

        // Cliente
        data[7] = "01";
        data[8] = "03";
        data[9] = "Pedro Ramirez";
        data[10] = "0302456980";
        data[11] = "Calle Larga";
        data[12] = "09908723478";
        
        var cliente2 =new String[13];
        cliente2[0] = "01";
        cliente2[1] = "AMAZON";
        cliente2[2] = "0102453949001";
        cliente2[3] = "Pio Bravo";
        cliente2[4] = "4112349";
        cliente2[5] = "20";
        cliente2[6] = "25.8";
        // Cliente
        cliente2[7] = "02";
        cliente2[8] = "02";
        cliente2[9] = "Pedro Ramirez";
        cliente2[10] = "0302456980";
        cliente2[11] = "Calle Larga";
        cliente2[12] = "09908723478";
        
        var data1 = new String[13];
        data1[0] = "02";
        data1[1] = "AMAZON";
        data1[2] = "0304950493";
        data1[3] = "Pio Bravo";
        data1[4] = "4112349";
        data1[5] = "25";
        data1[6] = "25.8";

        // Cliente
        data1[7] = "03";
        data1[8] = "01";
        data1[9] = "Pedro Ramirez";
        data1[10] = "0302456980";
        data1[11] = "Calle Larga";
        data1[12] = "09908723478";
        
        var data2 = new String[13];
        data2[0] = "03";
        data2[1] = "AMAZON";
        data2[2] = "0304950493";
        data2[3] = "Pio Bravo";
        data2[4] = "4112349";
        data2[5] = "-25";
        data2[6] = "25.8";

        // Cliente
        data2[7] = "02";
        data2[8] = "03";
        data2[9] = "Pedro Ramirez";
        data2[10] = "0302456980";
        data2[11] = "Calle Larga";
        data2[12] = "09908723478";
        
        
        System.out.println(facturaControl.crear(data));
         System.out.println(facturaControl.crear(cliente2));
        System.out.println(facturaControl.crear(data1));
        System.out.println(facturaControl.crear(data2));
       
        System.out.println("|||||||||||||||||||||||||||||||");
        System.out.println(facturaControl.listar());
        System.out.println("-------------------------------");
        System.out.println(facturaControl.listarC());
     

    }
}
