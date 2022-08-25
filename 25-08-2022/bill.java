import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class bill {
	
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bill_id");
		int bill_id = sc.nextInt();
		System.out.println("Enter the bill_type");
		String bill_type=sc.next();
		System.out.println("Enter the bill_number");
		int bill_number=sc.nextInt();
		System.out.println("Enter the bill_cus_id");
		int bill_cus_id=sc.nextInt();
		
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Registered the Driver class Successfully..");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "Namrata1432");
			System.out.println("Database Connected Successfully...");
			Statement s=con.createStatement();
			PreparedStatement ps=con.prepareStatement("insert into customer(cus_id,cus_name,cus_email,cus_address) values(?,?,?,?)");
			//String bill_id1 = null;
			ps.setInt(1,bill_id);
			//String bill_type = null;
			ps.setString(2,bill_type);
			//String bill_number = null;
			ps.setInt(3,bill_number);
			//String bill_cus_id = null;
			ps.setInt(4,bill_cus_id);
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