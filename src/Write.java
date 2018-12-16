import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Write {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void write() throws SQLException, IOException {
        System.out.println("Enter a name: ");
        String name = reader.readLine();
        System.out.println("Enter an age: ");
        int age = Integer.parseInt(reader.readLine());

        DBUtilities dbUtilities = new DBUtilities();

        String sql = "insert into users (name, age) values (\"" + name + "\" , " + age + ")";
        dbUtilities.ExecuteSQLStatement(sql);

    }

}
