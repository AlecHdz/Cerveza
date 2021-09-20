/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author ph
 */
public class Metodos_sql {
    public static ConexionBD conexion = new ConexionBD();
    
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
        String resultado_consulta;
    ResultSet rs = null;
    
    
    
    public int guardarExp (String nombre,String rfc,
           String responsable,String estado, String municipio, String ubicacion ){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("INSERT INTO expendio ( nombre,rfc,responsable,"
               + "estado,municipio,ubicacion) VALUES(?,?,?,?,?,?)");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setString(1,nombre);
           sentencia_preparada.setString(2,rfc);
           sentencia_preparada.setString(3,responsable);
           sentencia_preparada.setString(4,estado);
           sentencia_preparada.setString(5,municipio);
           sentencia_preparada.setString(6,ubicacion);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    
    public int guardarFab (String nombre,
           String estado, String municipio, String ubicacion ){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("INSERT INTO fabricante ( nombre,"
               + "estado,municipio,ubicacion) VALUES(?,?,?,?)");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setString(1,nombre);
           sentencia_preparada.setString(2,estado);
           sentencia_preparada.setString(3,municipio);
           sentencia_preparada.setString(4,ubicacion);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    

    
    public int guardarIng (String nombre,
           String descripcion ){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("INSERT INTO ingrediente ( nombre,"
               + "descripcion) VALUES(?,?)");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setString(1,nombre);
           sentencia_preparada.setString(2,descripcion);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    
     public int guardarMarc (String nombre,
           String idFab ){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("INSERT INTO marca ( Nombre,"
               + "IdFabricante) VALUES(?,?)");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setString(1,nombre);
           sentencia_preparada.setString(2,idFab);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    
     public int guardarCer (String idexpendio,String idmarca, String nombre,
       String presentacion, String graduacion, String tipo, String aspecto,
       String procedimientos){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("INSERT INTO cerveza "
                + "(idcerveza,idmarca,nombre,presentacion,graduacion,tipo,aspecto,procedimientos,cer_expendio) "
                + "VALUES (?,?,?,?,?,?,?,?,0)");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setString(1,idexpendio);
           sentencia_preparada.setString(2,idmarca);
           sentencia_preparada.setString(3,nombre);
           sentencia_preparada.setString(4,presentacion);
           sentencia_preparada.setString(5,graduacion);
           sentencia_preparada.setString(6,tipo);
           sentencia_preparada.setString(7,aspecto);
           sentencia_preparada.setString(8,procedimientos);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    
        public int guardarPro (String idproduccion, String cantidad,
       String fecha, String idcerveza){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("INSERT INTO produccion "
                + "(idproduccion,cantidad,fecha, idcerveza) "
                + "VALUES (?,?,?,?)");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setString(1,idproduccion);
           sentencia_preparada.setString(2,cantidad);
           sentencia_preparada.setString(3,fecha);
           sentencia_preparada.setString(4,idcerveza);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
     
          
       public int guardarVenta (String idventa, String cantidad,
       String fecha, String precioUni,String idexpendio,String idcerveza){
           
          
       int resultado =0;
       Connection conexion = null;
        
       
       String sentencia_guardar = ("INSERT INTO venta "
                + "(idventa,cantidad,fecha, precioUni,idexpendio,idcerveza  ) "
                + "VALUES (?,?,?,?,?,?)");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setString(1,idventa);
           sentencia_preparada.setString(2,cantidad);
           sentencia_preparada.setString(3,fecha);
           sentencia_preparada.setString(4,precioUni);
           sentencia_preparada.setString(5,idexpendio);
           sentencia_preparada.setString(6,idcerveza);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }     
       
       
    public int guardarReceta (String idreceta, String cantidad,
       String idcerveza, String idingrediente){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("INSERT INTO receta "
                + "(idreceta,cantidad,idcerveza, idingrediente) "
                + "VALUES (?,?,?,?)");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setString(1,idreceta);
           sentencia_preparada.setString(2,cantidad);
           sentencia_preparada.setString(3,idcerveza);
           sentencia_preparada.setString(4,idingrediente);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    
    
     public int guardarPedido(String idpedido, String cantidad,
       String fechapedido, String fechaentrega, String preciouni,
       String idexpendio, String idfabricante, String idcerveza){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("INSERT INTO pedido "
                + "(idpedido,cantidad,fechapedido, fechaentrega,preciouni,"
               + " idexpendio,idfabricante, idcerveza ) "
                + "VALUES (?,?,?,?,?,?,?,?)");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setString(1,idpedido);
           sentencia_preparada.setString(2,cantidad);
           sentencia_preparada.setString(3,fechapedido);
           sentencia_preparada.setString(4,fechaentrega);
           sentencia_preparada.setString(5,preciouni);
           sentencia_preparada.setString(6,idexpendio);
           sentencia_preparada.setString(7,idfabricante);
           sentencia_preparada.setString(8,idcerveza);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    
          
     
     
     // Consulta SQL
     public ResultSet consultarAlgo(String consul) {
      int resultado =0;
      Connection conexion = null;
        try {
            conexion =ConexionBD.conectar();
            Statement sentencia = conexion.createStatement();
            rs = sentencia.executeQuery(consul);
           
        } catch (Exception e) {
            e.printStackTrace();
            resultado_consulta = e.getMessage();
        }
        
        return rs;
    }
     
     
    
}
