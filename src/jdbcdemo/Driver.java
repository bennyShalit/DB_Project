package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Driver {

	
//	private Connection connect = null;
//    private Statement statement = null;
//    private PreparedStatement preparedStatement = null;
//    private static ResultSet resultSet = null;

	public static void main(String[] args) throws Exception {

		 MySQLAccess dao = new MySQLAccess();
//		 dao.readDataBase();
//		 dao.writeMetaData(); // קורא לפונקציה מקלאס mySqlAccess
//	     dao.writeResultSet(); // קורא לפונקציה מקלאס mySqlAccess
//	     dao.getData();
	     dao.getData2();
		
//		Driver d = new Driver();
//		  try {
//	            // This will load the MySQL driver, each DB has its own driver
//	            Class.forName("com.mysql.cj.jdbc.Driver");
//	            // Setup the connection with the DB
//	            d.connect = DriverManager
////	                    .getConnection("jdbc:mysql://localhost/bennydb?"
////	                            + "user=sa&password=dxc!369hp");
//                .getConnection("jdbc:mysql://localhost/bennydb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "dxc!369hp");
//
//
//	            // Statements allow to issue SQL queries to the database
////	            d.statement = d.connect.createStatement();
//	            // Result set get the result of the SQL query
////	            resultSet = d.statement
////	                    .executeQuery("select * from feedback.comments");
//	            
//	            
////	            writeResultSet(resultSet);
//
//	            // PreparedStatements can use variables and are more efficient
//	            d.preparedStatement = d.connect
//	                    .prepareStatement("insert into bennydb.personsdetails values (?, ?)");
//	            // "myuser, webpage, datum, summary, COMMENTS from feedback.comments");
//	            // Parameters start with 1
//	            d.preparedStatement.setInt(1, 3);
//	            d.preparedStatement.setString(2, "Perez1");
//	            d.preparedStatement.executeUpdate();
////
////	            preparedStatement = connect
////	                    .prepareStatement("SELECT myuser, webpage, datum, summary, COMMENTS from feedback.comments");
////	            resultSet = preparedStatement.executeQuery();
////	            writeResultSet(resultSet);
////
////	            // Remove again the insert comment
////	            preparedStatement = connect
////	            .prepareStatement("delete from feedback.comments where myuser= ? ; ");
////	            preparedStatement.setString(1, "Test");
////	            preparedStatement.executeUpdate();
////
////	            resultSet = statement
////	            .executeQuery("select * from feedback.comments");
////	            writeMetaData(resultSet);
//
//	        } catch (Exception e) {
//	        	//log
//	        	e.printStackTrace();
//	            throw e;
//	        } finally {
//	            d.connect.close();
//	        }
//	    }
//	private void writeMetaData(ResultSet resultSet) throws SQLException {
//        //  Now get some metadata from the database
//        // Result set get the result of the SQL query
//
//        System.out.println("The columns in the table are: ");
//
//        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
//        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
//            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
//        }
//    }
//    private void writeResultSet(ResultSet resultSet) throws SQLException {
//        // ResultSet is initially before the first data set
//        while (resultSet.next()) {
//            // It is possible to get the columns via name
//            // also possible to get the columns via the column number
//            // which starts at 1
//            // e.g. resultSet.getSTring(2);
//            String user = resultSet.getString("myuser");
//            String website = resultSet.getString("webpage");
//            String summary = resultSet.getString("summary");
//            Date date = resultSet.getDate("datum");
//            String comment = resultSet.getString("comments");
//            System.out.println("User: " + user);
//            System.out.println("Website: " + website);
//            System.out.println("summary: " + summary);
//            System.out.println("Date: " + date);
//            System.out.println("Comment: " + comment);
//        }
//    }
//
//    // You need to close the resultSet
//    private void close() {
//        try {
//            if (resultSet != null) {
//                resultSet.close();
//            }
//
//            if (statement != null) {
//                statement.close();
//            }
//
//            if (connect != null) {
//                connect.close();
//            }
//        } catch (Exception e) {
//
//        }
//    }


}
}
