package ua.net.bestcode.webstore.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.net.bestcode.webstore.model.User;

import javax.annotation.PostConstruct;
import java.util.List;


@Repository
public class UserDao extends HibernateDaoSupport implements IUserDao {

    @Autowired
    SessionFactory sessionFactory;

    @PostConstruct
    void postConstruct() {
        setSessionFactory(sessionFactory);
    }

    @Override
    public List<User> findAll() {
        List<User> users = (List<User>) getHibernateTemplate().find("from User");
        return users;
    }


    @Override
    public void addUser(User user) {
        getHibernateTemplate().persist(user);
    }

}
