package imd.model.dao;

import java.util.Vector;

import imd.model.Instance;

public class Repository {
    private Vector<Instance> bd = new Vector<Instance>();

    public void createInstance(Instance i) {
        bd.add(i);
    }

    public void readInstance() {
        for (Instance i : bd) {
            i.listAtributes();
        }
    }

    public void updateInstance(int id, String sentence){
        for (Instance i : bd) {
            if (i.getNumber() == id) {
                i.setSentence(sentence);
                break;
            }
        }
    }

    public void deleteInstance(int id){
        for (Instance i : bd) {
            if(i.getNumber() == id){
                bd.remove(i);
                break;
            }
        }
    }
   
}
