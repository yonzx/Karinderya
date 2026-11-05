package dao;

import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:sqlite:karinderya.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    public static void initDatabase() {
        try (Connection c = getConnection(); Statement s = c.createStatement()) {
            s.execute("CREATE TABLE IF NOT EXISTS users ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "username TEXT UNIQUE NOT NULL,"
                + "password TEXT NOT NULL,"
                + "role TEXT DEFAULT 'employee')");
            s.execute("CREATE TABLE IF NOT EXISTS menu ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "name TEXT NOT NULL,"
                + "price REAL NOT NULL,"
                + "stock INTEGER DEFAULT 0)");
            s.execute("INSERT OR IGNORE INTO users(username, password, role) "
                + "VALUES('admin', 'admin123', 'admin')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}