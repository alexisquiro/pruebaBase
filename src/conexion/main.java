

package conexion;
import com.Product;

import java.sql.DriverManager;

public class main {

	public static void main(String[] args) {

     Product pro=new Product("pepsicola","bebida gaseosa","1502",12,5);
      ProductSQL sql=new ProductSQL();
      sql.update(pro);
      
      //sql.delete(pro);

	 
	}

}
