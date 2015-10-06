/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg6;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Boletin26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float ptarifa, ppagado;
        System.out.println("Introduce el precio pagado");
        Scanner ppagadoTeclado = new Scanner(System.in);
        ppagado = ppagadoTeclado.nextFloat();
        System.out.println("Introduce el precio de la tarifa");
        Scanner ptarifaTeclado = new Scanner(System.in);
        ptarifa = ptarifaTeclado.nextFloat();
        System.out.println("El descuento seria del :"+((ptarifa-ppagado)*100)/ptarifa);
    }
    
}
