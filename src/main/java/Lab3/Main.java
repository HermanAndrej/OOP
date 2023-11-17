package Lab3;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DbConnect dbConnect = new DbConnect();

        dbConnect.getAllTasks();
    }
}
