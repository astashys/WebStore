package ua.net.bestcode.webstore.dao.impl;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import ua.net.bestcode.webstore.dao.GenericDAO;
import ua.net.bestcode.webstore.dao.IUserDAO;
import ua.net.bestcode.webstore.model.User;

import javax.annotation.PostConstruct;
import java.util.List;


@Repository
public class UserDAO extends GenericDAO<User> implements IUserDAO {

}
