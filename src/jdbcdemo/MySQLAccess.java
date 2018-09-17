package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class MySQLAccess {
	 Connection connect = null;
     Statement statement = null;
     PreparedStatement preparedStatement = null;
     ResultSet resultSet = null;

     public void readDataBase() throws Exception {		
	
		  try {
	            // This will load the MySQL driver, each DB has its own driver
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            // Setup the connection with the DB
	            connect = DriverManager
//	                    .getConnection("jdbc:mysql://localhost/bennydb?"
//	                            + "user=sa&password=dxc!369hp");
                .getConnection("jdbc:mysql://localhost/bennydb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "dxc!369hp");


	            // Statements allow to issue SQL queries to the database
//	            d.statement = d.connect.createStatement();
	            // Result set get the result of the SQL query
//	            resultSet = d.statement
//	                    .executeQuery("select * from feedback.comments");
	            
	            
//	            writeResultSet(resultSet);

	            // PreparedStatements can use variables and are more efficient
	            preparedStatement = connect
	                    .prepareStatement("insert into bennydb.personsdetails values (?, ?)");
	            // "myuser, webpage, datum, summary, COMMENTS from feedback.comments");
	            // Parameters start with 1
	            preparedStatement.setInt(1, 8);
	            preparedStatement.setString(2, "Jerusalem");
	            preparedStatement.executeUpdate();
//
//	            preparedStatement = connect
//	                    .prepareStatement("SELECT myuser, webpage, datum, summary, COMMENTS from feedback.comments");
//	            resultSet = preparedStatement.executeQuery();
//	            writeResultSet(resultSet);
//
//	            // Remove again the insert comment
//	            preparedStatement = connect
//	            .prepareStatement("delete from feedback.comments where myuser= ? ; ");
//	            preparedStatement.setString(1, "Test");
//	            preparedStatement.executeUpdate();
//
//	            resultSet = statement
//	            .executeQuery("select * from feedback.comments");
//	            writeMetaData(resultSet);

	        } catch (Exception e) {
	        	//log
	        	e.printStackTrace();
	            throw e;
	        } finally {
	            connect.close();
	        }
	    }
	public void writeMetaData() throws SQLException {
        //  Now get some metadata from the database
        // Result set get the result of the SQL query

        System.out.println("The columns in the table are: ");

        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
        }
    }
    ;void writeResultSet() throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getSTring(2);
            String user = resultSet.getString("myuser");
            String website = resultSet.getString("webpage");
            String summary = resultSet.getString("summary");
            Date date = resultSet.getDate("datum");
            String comment = resultSet.getString("comments");
            System.out.println("User: " + user);
            System.out.println("Website: " + website);
            System.out.println("summary: " + summary);
            System.out.println("Date: " + date);
            System.out.println("Comment: " + comment);
        }
    }
    public void getData()
    {
    	String sql = "SELECT * FROM bennydb.personsdetails" ;
//    	String sql2 = "select bennydb.persons.ID,  bennydb.persons.FirstName,bennydb.persons.LastName,bennydb.persons.Age,bennydb.personsdetails.PersonsAddress from bennydb.persons inner join bennydb.personsdetails on bennydb.persons.ID=bennydb.personsdetails.idPersonsDetails";
    	try
    	{
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bennydb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "dxc!369hp");
    		Statement s = con.prepareStatement(sql);
    		ResultSet rs=s.executeQuery(sql);
    		
    		while(rs.next())
    		{
    			String name=rs.getString(2);
    			String id=rs.getString(1);
    			System.out.println(id+" "+name);;
    		}
    	}catch(SQLException ex)
    	{
    		ex.printStackTrace();
    	}
    }

    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }

}
