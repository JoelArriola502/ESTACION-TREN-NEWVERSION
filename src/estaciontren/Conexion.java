/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estaciontren;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    public Connection Conectar(){
        Connection conectar=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/EstacionTren01","root","joelarriola");
            if(conectar!=null){
                JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al conectar" +e.toString());
        }
        
        return conectar;
        
    }
    
    public String ObtenerId(){
        String id=null;
        
        String Consulta="Select MAX(idFactura)as Factura from Pasajero";
        ResultSet rs;
        Statement st;
        try {
            st=Conectar().createStatement();
            rs=st.executeQuery(Consulta);
            if(rs.next()){
                  String idCompra=rs.getString("Factura");
             id=(idCompra);
            }
        } catch (Exception e) {
        }
        
        return id;
        
    }
}
