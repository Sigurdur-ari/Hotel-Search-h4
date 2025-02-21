package software;

import java.sql.*;
import java.nio.file.*;
import java.io.IOException;

public class Database {
    private static final String DATABASE_NAME = "sql/data.db";
    private static final String SCHEMA_FILE = "sql/schema.sql";
    private static final String INSERT_FILE = "sql/insert.sql";
    private Connection connection;

    public Database() {
        initializeDatabase();
    }

    private void initializeDatabase() {
        try {
            if (!Files.exists(Paths.get(DATABASE_NAME))) {
                connection = DriverManager.getConnection("jdbc:sqlite:" + DATABASE_NAME);
                executeSQLFile(SCHEMA_FILE);
                executeSQLFile(INSERT_FILE);
            }
            else {
                connection = DriverManager.getConnection("jdbc:sqlite:" + DATABASE_NAME);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void executeSQLFile(String fileName) {
        Path fileURL = Path.of(fileName);
        try {
            if (Files.exists(fileURL)) {
                String sql = Files.readString(fileURL);
                try (Statement stmt = connection.createStatement()) {
                    stmt.executeUpdate(sql);
                }
            }
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet query(String queryString) {
        try {
            Statement stmt = connection.createStatement();
            return stmt.executeQuery(queryString);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void close() {
        try {
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
