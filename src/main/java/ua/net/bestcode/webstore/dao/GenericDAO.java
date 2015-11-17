package ua.net.bestcode.webstore.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;

@Repository
public abstract class GenericDAO<T> extends HibernateDaoSupport implements IGenericDAO<T> {


    private final Class<T> entityClass;

    @Autowired
    SessionFactory sessionFactory;


    /**
     * Constructor that sets type of entity class.
     */
    public GenericDAO() {
        this.entityClass = (Class<T>) GenericTypeResolver.resolveTypeArgument(getClass(), GenericDAO.class);
    }

    /**
     * Post construct method. Invoked after bean created.
     */
    @PostConstruct
    private void postConstruct() {
        setSessionFactory(sessionFactory);
    }

    /**
     * Returns entity class.
     *
     * @return entity class.
     */
    public Class<T> getEntityClass() {
        return entityClass;
    }



    @Override
    public void persist(T entity) {
        getHibernateTemplate().save(entity);
    }


    @Override
    public List<T> findAll() {
        return getHibernateTemplate().loadAll(getEntityClass());
    }


    @Override
    public T findByPk(Integer entityPk) {
        return getHibernateTemplate().get(getEntityClass(), entityPk);
    }


    @Override
    public void update(T entity) {
        getHibernateTemplate().update(entity);
    }


    @Override
    public void remove(T entity) {
        getHibernateTemplate().delete(entity);
    }
}

