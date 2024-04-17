package Business;

import DAL.UserDAL;
import Entities.User;
import com.sun.jdi.connect.spi.Connection;

import java.sql.PreparedStatement;

public class UserManager{

    private final UserDAL userDao;

    public UserManager() {
        this.userDao = new UserDAL();
    }
    public User findByLogin(String user_name, String user_password) {
        return this.userDao.findByLogin(user_name, user_password);
    }
}
