package conexion;

import java.sql.DriverManager;

public class Querys {
 	Base Bd=new Base();
 	
 	public void conect() {
 	     
         try {
             Class.forName("org.postgresql.Driver");
             Bd.setConn( DriverManager.getConnection(Bd.getUrl(), Bd.getUser(),Bd.getPasssword()));
              System.out.println("exito");
         } catch (Exception e) {
             System.out.println("Ocurrio un error : "+e.getMessage());
         }
 		
 	}

}
