package conexion;

import java.sql.DriverManager;

public class Querys {
 	Base Bd=new Base();
 	
 	public Querys() {
 	     
         try {
             Class.forName("org.postgresql.Driver");
             Bd.setConn( DriverManager.getConnection(Bd.getUrl(), Bd.getUser(),Bd.getPasssword()));
         } catch (Exception e) {
             System.out.println("Ocurrio un error : "+e.getMessage());
         }
 		
 	}



}
