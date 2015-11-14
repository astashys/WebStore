package ua.net.bestcode.webstore.manager;


import org.springframework.transaction.annotation.Transactional;

public interface IUserManager {
    @Transactional
    int addUserAndReturnCount();
}
