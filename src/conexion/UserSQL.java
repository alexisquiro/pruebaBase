

package conexion;
import java.sql.*;
import com.User;

public class UserSQL extends Querys {

	
	public  void add(User user) {
		this.conect();
		Statement  stm=this.Bd.getState();
		try {
		stm = this.Bd.getConn().createStatement();
		this.Bd.setState(stm);
		this.Bd.getConn().setAutoCommit(false);
         String sql = "INSERT INTO  \"User\" VALUES ('"+user.getAccName()+"','"+user.getPassword()+"','" + user.getFullName()+"','"+user.getUserAddress()+"','"+user.getUserMail()+"',"+user.getUserType()+","+user.getIdUser()+");";
     
		System.out.println(stm.executeUpdate(sql));     
        stm.close();
        this.Bd.setState(stm);
        this.Bd.getConn().commit();
        this.Bd.getConn().close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage());
            System.exit(0);
         }
	}
	
	//Actualiza
	
	public void update(User user){
		this.conect();
		Statement  stm=this.Bd.getState();
		try {
		stm = this.Bd.getConn().createStatement();
		this.Bd.setState(stm);
		this.Bd.getConn().setAutoCommit(false);
	
        String sql = "UPDATE\n" + 
        		" \"User\"" + 
        		"SET\n" + 
        		"\"accName\" = '"+user.getAccName()+"',\"password\"= '"+user.getPassword()+"',\"fullName\"= '"+user.getFullName()+"',\"userAddress\"='"+user.getUserAddress()+"',\"userMail\"='"+user.getUserMail()+"',\"userType\"="+user.getUserType()+ 
        		"WHERE\n" + 
        		"\"idUser\" = "+user.getIdUser()+";";
        System.out.println(stm.executeUpdate(sql));
        stm.close();
        this.Bd.setState(stm);
        this.Bd.getConn().commit();
        this.Bd.getConn().close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage());
            System.exit(0);
         }

	}
	
	
	//
	public void delete(User user){
			this.conect();
			Statement  stm=this.Bd.getState();
			try {
			stm = this.Bd.getConn().createStatement();
			this.Bd.setState(stm);
			this.Bd.getConn().setAutoCommit(false);	
	        String sql = "DELETE from  \"User\" where \"idUser\" ="+user.getIdUser()+";";
	        System.out.println(stm.executeUpdate(sql));
	        stm.close();
	        this.Bd.setState(stm);
	        this.Bd.getConn().commit();
	        this.Bd.getConn().close();
	        } catch (Exception e) {
	            System.err.println( e.getClass().getName()+": "+ e.getMessage());
	            System.exit(0);
	         }

		}
		
		
		
		
	
	
	
	
	
		
		
}

