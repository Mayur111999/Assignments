import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connection {

	Connection c1;
	connection() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mayur","root","root");

		
		
	}
	Connection getcon()
	{
		return c1;

	}
	void close() throws SQLException
	{
		c1.close();
	}
}
