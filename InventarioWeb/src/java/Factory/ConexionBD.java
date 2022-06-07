package Factory;

import com.mysql.jdbc.Connection;


public abstract class ConexionBD {
    protected String[] parametros;
    protected Connection conexion;
    abstract connection open();
    
    
    public Resulset consultaSQL(String consulta){
    Statement st;
    Resulset rs = null;
    try{
        st = conexion.createStatement();
        rs = st.executeQuery(consulta);
   
    }catch(SQLException ex){ 
        ex.printStackTrace();
        
        return rs;
    }
    
    public boolean ejecutarSQL(String consulta){ 
        
        Statement st;
        boolean guardar = true;
        try{
            st = conexion.createStatement();
            st.executeUpdate(consulta);
        }catch(SQLException ex){
            guardar = false;
            
        }
        
        return guardar;
        
        
        
        
        
        
        
     public boolean cerrarConexion(){ 
        boolean ok = true;
        try{
            st = conexion.close();
        }catch(SQLException ex){
            ok = false;
            
        }
        
        return ok;
     }
    
    
    
 
