package imd.view;

import java.util.Calendar;

import imd.model.Instance;
import imd.model.dao.Repository;

/**
 * view
 */
public class view {

    public static void main(String[] args) {
        Repository bd = new Repository();
        Instance object = new Instance(1, false, "In open eyes", Calendar.getInstance());
        Instance object2 = new Instance(1, false, "In open eyes", Calendar.getInstance());
        bd.createInstance(object);
        object.setNumber(2);
        object.setSentence("i'll se the fire");
        bd.createInstance(object2);
        bd.readInstance();
        
        
    }
}
