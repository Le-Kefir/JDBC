import java.sql.*;

public class Read {

    public void read() throws SQLException {

        DispayResuls();

    }

    private void DispayResuls() throws SQLException {

        try {
            DBUtilities dbUtilities = new DBUtilities();

            String sql = "SELECT id, name, age FROM users";
            ResultSet resultSet = dbUtilities.ReadRecords(sql);

            while (resultSet.next()) {
                //Retrieve by column name
                int id = resultSet.getInt("id");
                int age = resultSet.getInt("age");
                String name = resultSet.getString("name");

                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.println(", Name: " + name);
            }

            dbUtilities.DisconnectFromDB();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();

        }
    }

}
