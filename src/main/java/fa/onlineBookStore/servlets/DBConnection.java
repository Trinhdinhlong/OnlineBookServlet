package fa.onlineBookStore.servlets;
import fa.onlineBookStore.constants.IDatabase;

import java.sql.*;

public class DBConnection {
	private static Connection con;
	
	private DBConnection(){};
	
	static {
		
		try {
			
			Class.forName(IDatabase.DRIVER_NAME);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try {
			
			con = DriverManager.getConnection(IDatabase.CONNECTION_STRING, IDatabase.USER_NAME, IDatabase.PASSWORD);
		
		}
		catch (SQLException e) {

			e.printStackTrace();
		
		}
		
		
	}//End of static block
	
	public static Connection getCon()
	{
		return con;
	}
}
