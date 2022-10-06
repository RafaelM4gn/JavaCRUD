package imd.dao;

import imd.model.Entity;

/**
 * IEntityDAO
 */
public interface IEntityDAO {

    public void createEntity(Entity i);
    public void updateEntity(int id, String sentence);
    public void readEntity();
    public void deleteEntity(int id);
}