import java.util.Date;
import java.sql.*;  //import java.sql.Date;  不可以，因为available in both
public class Import
{
	public static void main(String[] args)
        {
	java.util.Date d=new java.util.Date();
		Date d=new Date();  // 7，8相同
		System.out.println(d);
	}
}
