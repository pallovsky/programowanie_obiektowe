import java.sql.*;
package lab6;

    public class DB {
        private Connection conn = null;
        private Statement stmt = null;
        private ResultSet rs = null;

        public void connect() {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                conn =
                        DriverManager.getConnection("jdbc:mysql://mysql.agh.edu.pl/pala1",
                                "pala1", "PG9ykEipqHVSU7kV");

            } catch (SQLException ex) {
                // handle any errors
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void listAll() {
            try {
                connect();
                stmt = conn.createStatement();

                // Wyciagamy wszystkie pola z kolumny name
                // znajdujące się w tabeli users
                rs = stmt.executeQuery("SELECT * FROM books");

                while (rs.next()) {
                    String isbn = rs.getString(1);
                    String title = rs.getString(2);
                    String author = rs.getString(3);
                    String year = rs.getString(4);

                    System.out.println(isbn + title + author + year +"\n");
                }
            } catch (SQLException ex) {
                // handle any errors

            } finally {
                // zwalniamy zasoby, które nie będą potrzebne
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException sqlEx) {
                    } // ignore
                    rs = null;
                }

                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException sqlEx) {
                    } // ignore

                    stmt = null;
                }
            }
        }

        public void addBook(String isbn, String title, String author, String year) {
            stmt = conn.createStatement();
            stmt.executeUpdate(
                    "INSERT INTO books "
                            + "VALUES " + isbn + ", " + title + ", " + author + ", " + year + ", ")
        }

        public String searchByISBN(String isbn){
            try {
                connect();
                stmt = conn.createStatement();

                // Wyciagamy wszystkie pola z kolumny name
                // znajdujące się w tabeli users
                rs = stmt.executeQuery("SELECT title FROM books WHERE title=" + "");

                while (rs.next()) {
                    String currentIsbn = rs.getString(1);
                    if (currentIsbn == isbn){
                        String new_isbn = rs.getString(1);
                        String title = rs.getString(2);
                        String author = rs.getString(3);
                        String year = rs.getString(4);
                        return new_isbn + title + author + year
                        }
                }
            } catch (SQLException ex) {
                // handle any errors

            } finally {
                // zwalniamy zasoby, które nie będą potrzebne
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException sqlEx) {
                    } // ignore
                    rs = null;
                }

                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException sqlEx) {
                    } // ignore

                    stmt = null;
                }
            }
            return null;
        }
        public String searchByATitle(String title){
            try {
                connect();
                stmt = conn.createStatement();

                // Wyciagamy wszystkie pola z kolumny name
                // znajdujące się w tabeli users
                rs = stmt.executeQuery("SELECT * FROM books");

                while (rs.next()) {
                    String currentTitle = rs.getString(2);
                    if (currentTitle == title){
                        String isbn = rs.getString(1);
                        String new_title = rs.getString(2);
                        String author = rs.getString(3);
                        String year = rs.getString(4);
                        return isbn + new_title + author + year
                    }
                }
            } catch (SQLException ex) {
                // handle any errors

            } finally {
                // zwalniamy zasoby, które nie będą potrzebne
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException sqlEx) {
                    } // ignore
                    rs = null;
                }

                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException sqlEx) {
                    } // ignore

                    stmt = null;
                }
            }
            return null;
        }
    }