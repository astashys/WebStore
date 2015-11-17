package ua.net.bestcode.webstore.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.net.bestcode.webstore.dao.IUserDAO;
import ua.net.bestcode.webstore.model.User;

@Service
public class UserManager implements IUserManager {

    @Autowired
    IUserDAO userDao;


    /**
     * Just test method
     */
    @Transactional
    @Override
    public int addUserAndReturnCount() {
        User user = new User();
        user.setName("Suspect");
        user.setEmail("suspect@gmail.com");
        userDao.persist(user);
        return userDao.findAll().size();
    }

}
