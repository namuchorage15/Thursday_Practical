import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class customer {
	
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cus_id");
		String cus_id=sc.next();
		System.out.println("Enter the cus_name");
		String cus_name=sc.next();
		System.out.println("Enter the cus_email");
		String cus_email=sc.next();
		System.out.println("Enter the cus_address");
		String cus_address=sc.next();
		
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Registered the Driver class Successfully..");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "Namrata1432");
			System.out.println("Database Connected Successfully...");
			Statement s=con.createStatement();
			PreparedStatement ps=con.prepareStatement("ins1ert into customer(cus_id,cus_name,cus_email,cus_address) values(?,?,?,?)");
			//String cus_id1 = null;
			ps.setString(1,cus_id);
			//String cus_name = null;
			ps.setString(2,cus_name);
			//String cus_email = null;
			ps.setString(3,cus_email);
			//String cus_address = null;
			ps.setString(4,cus_address);
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