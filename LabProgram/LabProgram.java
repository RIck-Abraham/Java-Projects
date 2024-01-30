import java.sql.*;

public class LabProgram {
    
   // Create a connection to a sqlite in-memory database
   // Returns Connection object
   public static Connection createConnection() {

      // YOUR CODE HERE
      // Use connection string "jdbc:sqlite::memory:"
	   Connection conn = null; 
	   try {       
		   conn = DriverManager.getConnection(
				   "jdbc:sqlite::memory:");       

	        // Execute database operations...
		   //conn.close();
	     }
	     catch (SQLException e) {
	         System.out.println("Cannot connect to database:"
	            + e.getMessage());
	     }
	   return conn;

   }

   // Create Horse table
   // Parameter conn is database connection created in createConnection()
   public static void createTable(Connection conn) {
     
      // YOUR CODE HERE
	   String sql = "CREATE TABLE Horse ("
			   + "Id INT PRIMARY KEY NOT NULL, "
			   + "Name text, "
			   + "Breed text, "
			   + "Height double, "
			   + "BirthDate date );";
       
       try {
    	   Statement stmt = conn.createStatement();
           // create a new table
           stmt.execute(sql);
       } catch (SQLException e) {
           System.out.println(e.getMessage());
       }
       
   }

   // Insert row into Horse table using a parameterized query
   // Parameter conn is database connection created in createConnection()
   // Parameters id, name, breed, height, and birthDate contain values to be inserted  
   public static void insertHorse(Connection conn, int id, String name, String breed, double height, String birthDate) {
     
      // YOUR CODE HERE
	   String sql = "INSERT INTO Horse "
			   + "(Id, Name, Breed, Height, BirthDate) "
			   + " VALUES (?, ?, ?, ?, ?)";
       
       try {
    	   PreparedStatement  stmt = conn.prepareStatement(sql);
           // insert into a table
    	   stmt.setInt(1, id);
    	   stmt.setString(2, name);
    	   stmt.setString(3, breed);
    	   stmt.setDouble(4, height);
    	   stmt.setString(5, birthDate);

    	   stmt.executeUpdate();

    	   stmt.close();
       } catch (SQLException e) {
           System.out.println(e.getMessage());
       }
      
   }

   // Select and print all rows of Horse table
   // Parameter conn is database connection created in createConnection()
   public static void selectAllHorses(Connection conn) {
     
      // YOUR CODE HERE
	   String sql = "SELECT * FROM Horse;";
	   try{	
		   Statement stmt = conn.createStatement();
		   ResultSet rs = stmt.executeQuery(sql);
		   System.out.println("All horses:");
		   while(rs.next()) {
			   System.out.print("(" + rs.getInt("Id") 
					   + ", '" + rs.getString("Name")
					   + "', '" + rs.getString("Breed")
					   + "', " + rs.getDouble("Height")
					   + ", '" + rs.getString("BirthDate") + "')");
			   }
	   } catch (SQLException e) {
		   System.out.println(e.getMessage());
	   } 
		   
   }
    
   // DO NOT MODIFY main
   public static void main(String[] args) {

      // Create connection to sqlite in-memory database
      Connection conn = createConnection();

      // Create Horse table
      createTable(conn);

      // Insert row into Horse table
      insertHorse(conn, 1, "Babe", "Quarter Horse", 15.3, "2015-02-10");

      // Select and print all Horse table rows
      selectAllHorses(conn);
   }
}