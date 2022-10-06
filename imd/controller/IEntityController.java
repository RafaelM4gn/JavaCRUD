package imd.controller;

import imd.model.Entity;

public interface IEntityController {

    public void createEntity(Entity i);

    public void updateEntity(int id, String sentence);

    public void readEntity();

    public void deleteEntity(int id);

}
