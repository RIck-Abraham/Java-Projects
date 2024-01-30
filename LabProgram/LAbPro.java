import java.sql.*;


public class LabProgram {

   

  // Create a connection to a sqlite in-memory database

  // Returns Connection object

  public static Connection createConnection() {

   Connection conn = null;

   try {

     conn = DriverManager.getConnection("jdbc:sqlite::memory:");

   } catch (SQLException e) {

     System.out.println(e.getMessage());

   }

   return conn;

  }


  // Create Horse table

  // Parameter conn is database connection created in createConnection()

  public static void createTable(Connection conn) {

   String sql_create_horse_table = 

      "CREATE TABLE Horse ("

      + "Id integer PRIMARY KEY NOT NULL,"

      + "Name text,"

      + "Breed text,"

      + "Height double,"

      + "BirthDate text);";

       

   try {

     Statement stmt = conn.createStatement();

     stmt.execute(sql_create_horse_table);

   } catch (SQLException e) {

     System.out.println(e.getMessage());

   }

  }


  // Insert row into Horse table using a parameterized query

  // Parameter conn is database connection created in createConnection()

  // Parameters id, name, breed, height, and birthDate contain values to be inserted  

  public static void insertHorse(Connection conn, int id, String name, String breed, double height, String birthDate) {

   String sql = "INSERT INTO Horse VALUES (?, ?, ?, ?, ?)";

   try {

     PreparedStatement pstmt = conn.prepareStatement(sql);

     pstmt.setInt(1, id);

     pstmt.setString(2, name);

     pstmt.setString(3, breed);

     pstmt.setDouble(4, height);

     pstmt.setString(5, birthDate);

     pstmt.executeUpdate();

   } catch (SQLException e) {

     System.out.println(e.getMessage());

   }

  }


  // Select and print all rows of Horse table

  // Parameter conn is database connection created in createConnection()

  public static void selectAllHorses(Connection conn) {

   String sql = "SELECT * FROM Horse";

   try {

     Statement stmt = conn.createStatement();

     ResultSet rs  = stmt.executeQuery(sql);


     // Loop through the result set

     System.out.print("All horses:");

     while (rs.next()) {

      System.out.println();

      System.out.print("(" + rs.getInt("id") + ", '" + 

        rs.getString("Name") + "', '" +

        rs.getString("Breed") + "', " +

        rs.getDouble("Height")+ ", '" +

        rs.getString("BirthDate") + "')" );

     }

   } catch (SQLException e) {

     System.out.println(e.getMessage());

   }

  }

   

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