
package Factory;

import java.sql.DriverManager;


public final class MySQLConexionFactory extends ConexionBD{
   
    public MySQLConexionFactory(String[] criterios){
        this.parametros = criterios;
        this.open();
    }

    MySQLConexionFactory(String[] configMySQL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public connection open() {
        this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.parametros[0], this.parametros[1], this.parametros[2]);
        
    }catch(Exception ex){
    ex.printStackTrace();
}
    return this.Conexion;

     
}   
 
    

