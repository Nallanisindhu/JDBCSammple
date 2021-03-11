import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class MainClass {

	public static void main(String[] args) {
		Connection con=null;
		try {
			Collection<Employees>c=new ArrayList<Employees>();
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedatabase","root","Google123$");
			if(con!=null) {
			PreparedStatement ps=con.prepareStatement("select * from employeedetails");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Employees e=new Employees(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getDouble(4), rs.getString(5),rs.getInt(6), rs.getString(7));
			
				c.add(e);
			}
			c.forEach((K)->{
				System.out.println(K);
			});
			
			
			
			System.out.println("age greaterthan 25");
		List l=	c.stream().filter((x)->x.Age<=30).collect(Collectors.toList());
		
		l.forEach((Y)->{
			System.out.println(Y);
		});
		con.close();		
			}	
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	
		
	}

}
