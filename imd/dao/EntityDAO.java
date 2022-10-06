package imd.dao;

import java.util.Vector;

import imd.model.Entity;

public class EntityDAO implements IEntityDAO {
    private Vector<Entity> bd = new Vector<Entity>();

    @Override
    public void createEntity(Entity i) {
        bd.add(i);
    }

    @Override
    public void readEntity() {
        for (Entity i : bd) {
            i.listAtributes();
        }
    }

    @Override
    public void updateEntity(int id, String sentence){
        for (Entity i : bd) {
            if (i.getNumber() == id) {
                i.setSentence(sentence);
                break;
            }
        }
    }

    @Override
    public void deleteEntity(int id){
        for (Entity i : bd) {
            if(i.getNumber() == id){
                bd.remove(i);
                break;
            }
        }
    }

}
