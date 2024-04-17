package DAL;
import Core.DataBaseConnection;
import Entities.Book;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
public class BookDAL {
    private Connection con;
    private final DAL.CarDAL carDAL;

    public BookDAL() {
        this.con = DataBaseConnection.getInstance();
        this.carDAL = new DAL.CarDAL();
    }

    public ArrayList<Book> findAll() {
        return this.selectByQuery("SELECT * FROM book ORDER BY book_id");
    }

    public ArrayList<Book> selectByQuery(String query) {
        ArrayList<Book> books = new ArrayList<>();
        try {
            ResultSet rs = this.con.createStatement().executeQuery(query);
            while (rs.next()) {
                books.add(this.match(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    public boolean save(Book book) {
        String query = "INSERT INTO book " +
                "(" +
                "book_car_id, " +
                "book_name, " +
                "book_idno, " +
                "book_mpno, " +
                "book_mail, " +
                "book_strt_date," +
                "book_fnsh_date, " +
                "book_prc, " +
                "book_case, " +
                "book_note" +
                ")" +
                "VALUES(?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = this.con.prepareStatement(query);
            ps.setInt(1, book.getCar_id());
            ps.setString(2, book.getName());
            ps.setString(3, book.getIdno());
            ps.setString(4, book.getMpno());
            ps.setString(5, book.getMail());
            ps.setDate(6, Date.valueOf(book.getStrt_date()));
            ps.setDate(7, Date.valueOf(book.getFnsh_date()));
            ps.setInt(8, book.getPrc());
            ps.setString(9, book.getbCase());
            ps.setString(10, book.getNote());
            return ps.executeUpdate() != -1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;

    }

    public Book match(ResultSet rs) throws SQLException {
        Book book = new Book();
        book.setId(rs.getInt("book_id"));
        book.setbCase(rs.getString("book_case"));
        book.setCar_id(rs.getInt("book_car_id"));
        book.setName(rs.getString("book_name"));
        book.setStrt_date(LocalDate.parse(rs.getString("book_strt_date")));
        book.setFnsh_date(LocalDate.parse(rs.getString("book_fnsh_date")));
        book.setCar(this.carDAL.getById(rs.getInt("book_car_id")));
        book.setIdno(rs.getString("book_idno"));
        book.setMpno(rs.getString("book_mpno"));
        book.setMail(rs.getString("book_mail"));
        book.setNote(rs.getString("book_note"));
        book.setPrc(rs.getInt("book_prc"));
        return book;
    }

    public Book getById(int id) {
        Book obj = null;
        String query = "SELECT * FROM book WHERE book_id = ?";
        try {
            PreparedStatement ps = this.con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                obj = this.match(rs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    public boolean delete(int id) {
        String query = "DELETE FROM book WHERE book_id = ?";
        try {
            PreparedStatement ps = this.con.prepareStatement(query);
            ps.setInt(1, id);
            return ps.executeUpdate() != -1;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
}
