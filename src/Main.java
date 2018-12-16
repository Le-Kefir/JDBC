import java.io.IOException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, IOException {

        Read read = new Read();
        Write write = new Write();



        write.write();
        read.read();

    }

}
