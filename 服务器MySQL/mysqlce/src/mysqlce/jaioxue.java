package mysqlce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jaioxue {

	public static void main(String[] args)
	{
		
	
		 Connection conn = null;
		 Statement my;
		 ResultSet run;
		 PreparedStatement sql;
		 
		try{
	   	 Class.forName("com.mysql.jdbc.Driver");
	     
	
	    }
	    catch(ClassNotFoundException e){
	        //鏁版嵁搴撻┍鍔ㄧ被寮傚父澶勭悊
	    }
	   try {
			conn=DriverManager.getConnection("jdbc:mysql://cdb-7iyyamp1.gz.tencentcdb.com:10024/text?useSSL=false","root","19991104w");
		
		    
		    my=conn.createStatement();
		   
		    run=my.executeQuery("select*from zifu");
		  
  int count = my.executeUpdate("insert into zifu values(1,1,测试)");
	 
			} catch (SQLException e) {
				
				e.printStackTrace();
			
			 
	}
	}
}
