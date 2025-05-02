package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup {

    private ArrayList<String> iterables;

    public SimpleStringGroup() {
        this.iterables = new ArrayList<String>();
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public SimpleStringGroup(ArrayList<String> iterables) {
        this.iterables = iterables;
    }

    public Integer count() {
        return iterables.size();
    }

    public void insert(String string) {
        iterables.add(string);
    }

    public Boolean has(String string) {
        return iterables.contains(string);
    }

    public String fetch(int indexOfValue) {
        return iterables.get(indexOfValue);
    }

    public void delete(String string) {
        iterables.remove(string);
    }

    public void clear() {
        iterables.clear();
    }
}
