package ua.net.bestcode.webstore.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.net.bestcode.webstore.dao.IUserDao;
import ua.net.bestcode.webstore.model.User;

import javax.annotation.PostConstruct;

@Service
public class UserManager implements IUserManager {

    @Autowired
    IUserDao userDao;


    /**
     * Just test method
     */
    @Transactional
    @Override
    public int addUserAndReturnCount() {
        User user = new User();
        user.setName("Suspect");
        user.setEmail("suspect@gmail.com");
        userDao.addUser(user);
        return userDao.findAll().size();
    }

}
