/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estaciontren;

import com.mysql.cj.jdbc.ConnectionWrapper;

/**
 *
 * @author Joel Arriola
 */
public class ESTACIONTREN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Conexion Conetar=new Conexion();
      Conetar.Conectar();
       
        System.out.println("id es "+Conetar.ObtenerId());
    }
    
}
