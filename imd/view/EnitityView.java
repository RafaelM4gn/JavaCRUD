package imd.view;

import java.util.Calendar;

import imd.dao.EntityDAO;
import imd.model.Entity;

/**
 * view
 */
public class EnitityView {

    public static void main(String[] args) {
        EntityDAO bd = new EntityDAO();
        Entity object = new Entity(1, false, "In open eyes", Calendar.getInstance());
        Entity object2 = new Entity(1, false, "In open eyes", Calendar.getInstance());
        bd.createEntity(object);
        object.setNumber(2);
        object.setSentence("i'll se the fire");
        bd.createEntity(object2);
        bd.readEntity();

    }
}
