package imd.controller;

import imd.dao.EntityDAO;
import imd.dao.IEntityDAO;
import imd.model.Entity;

/**
 * EntityController
 */
public class EntityController implements IEntityController {

    IEntityDAO persistence;

    public EntityController() {
        this.persistence = new EntityDAO();
    }

    @Override
    public void createEntity(Entity i) {
        persistence.createEntity(i);
    }

    @Override
    public void updateEntity(int id, String sentence) {
        persistence.updateEntity(id, sentence);
    }

    @Override
    public void readEntity() {
        persistence.readEntity();
    }

    @Override
    public void deleteEntity(int id) {
        persistence.deleteEntity(id);
    }

}