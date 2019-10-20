package conexion;
import com.Product;
import java.sql.Statement;

public class ProductSQL extends Querys{

	
	
	public  void add(Product pro) {
		this.conect();
		Statement  stm=this.Bd.getState();
		try {
		stm = this.Bd.getConn().createStatement();
		this.Bd.setState(stm);
		this.Bd.getConn().setAutoCommit(false);
         String sql = "INSERT INTO  \"Product\" VALUES ('"+pro.getProductName()+"','"+pro.getProductDescription()+"','" +pro.getProductCode()+"',"+pro.getProductPrice()+","+pro.getQuantity()+");";
     
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
	
	
	public void delete(Product pro){
		this.conect();
		Statement  stm=this.Bd.getState();
		try {
		stm = this.Bd.getConn().createStatement();
		this.Bd.setState(stm);
		this.Bd.getConn().setAutoCommit(false);	
        String sql = "DELETE from  \"Product\" where \"productCode\"='"+pro.getProductCode()+"';";
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
	
	
	public void update(Product pro){
		this.conect();
		Statement  stm=this.Bd.getState();
		try {
		stm = this.Bd.getConn().createStatement();
		this.Bd.setState(stm);
		this.Bd.getConn().setAutoCommit(false);
	
        String sql = "UPDATE\n" + 
        		" \"Product\"" + 
        		"SET\n" + 
        		"\"productName\" = '"+pro.getProductName()+"',\"productDescription\"= '"+pro.getProductDescription()+"',\"productPrice\"="+pro.getProductPrice()+",\"quantity\"="+pro.getQuantity()+ 
        		"WHERE\n" + 
        		"\"productCode\" = '"+pro.getProductCode()+"';";
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
