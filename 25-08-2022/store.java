import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class store {
	
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the store_id");
		int store_id = sc.nextInt();
		System.out.println("Enter the store_name");
		String store_name=sc.next();
		System.out.println("Enter the store_desc");
		String store_desc=sc.next();
		System.out.println("Enter the store_type");
		String store_type=sc.next();
		
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Registered the Driver class Successfully..");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "Namrata1432");
			System.out.println("Database Connected Successfully...");
			Statement s=con.createStatement();
			PreparedStatement ps=con.prepareStatement("insert into store(store_id,store_name,store_desc,store_type) values(?,?,?,?)");
			//String cus_id1 = null;
			ps.setInt(1,store_id);
			//String cus_name = null;
			ps.setString(2,store_name);
			//String cus_email = null;
			ps.setString(3,store_desc);
			//String cus_address = null;
			ps.setString(4,store_type);
		    ps.executeUpdate();
			
			/*ResultSet rs = st.executeQuery("select * from customer");
			while(rs.next()) {
				System.out.println(rs.getInt(1) +" "+ rs.getString(2) +" "+ rs.getString(3) +" " +rs.getString(4));
				}
			conn.close();
		}*/
		}
		 catch (ClassNotFoundException e) {
             
			 //TODO Auto-generated catch block
			e.printStackTrace();
		
}


	}}