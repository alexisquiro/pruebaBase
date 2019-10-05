package conexion;
import java.sql.*;
public class Base {
	private String url = null;// "jdbc:postgresql://localhost:0000/midatabase";ejemplo 
    private String user =null;// el usuario de la base 
    private String password= null;// y la contraseña
	private Connection conn = null;
	private Statement state=null;
	
     
     //getters and setters

	public Statement getState() {
		return state;
	}

	public void setState(Statement state) {
		this.state = state;
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	public String getPasssword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
