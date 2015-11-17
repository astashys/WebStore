package ua.net.bestcode.webstore.dao;


import ua.net.bestcode.webstore.model.User;

import java.util.List;

public interface IGenericDAO<T> {
    /**
     * Persist entity into DB.
     *
     * @param entity the entity to be persisted.
     */
    void persist(T entity);

    /**
     * Finds all entity in DB.
     *
     * @return all list of entities from DB or empty list.
     */
    List<T> findAll();

    /**
     * Performs a search for entity by Pk.
     *
     * @return an entity or null.
     */
    T findByPk(Integer entityPk);

    /**
     * Update the given persistent instance, associating it with the current Hibernate Session.
     *
     * @param entity the persistent instance to update
     */
    void update(T entity);

    /**
     * Delete the given persistent instance.
     *
     * @param entity the persistent instance to delete.
     */
    void remove(T entity);
}
