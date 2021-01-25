package ua.net.bestcode.webstore.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.net.bestcode.webstore.dao.IUserDAO;
import ua.net.bestcode.webstore.manager.IUserManager;
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
        user.setUsername("Suspect");
        user.setEmail("suspect@gmail.com");
        user.setPassword("suspectPassword");
        user.setFullName("Suspect Suspectovych");
        user.setPhone("007007007");
        userDao.persist(user);
        return userDao.findAll().size();
    }

}
