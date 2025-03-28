package za.ac.cput.repository;

import za.ac.cput.domain.Child;

import java.util.HashMap;
import java.util.Map;

public class ChildRepository {
    private static ChildRepository repository = null;
    private final Map<String, Child> childDB;

    private ChildRepository() {
        childDB = new HashMap<>();
    }

    public static ChildRepository getRepository() {
        if (repository == null) {
            repository = new ChildRepository();
        }
        return repository;
    }

    public Child create(Child child) {
        childDB.put(child.getChildId(), child);
        return child;
    }

    public Child read(String childId) {
        return childDB.get(childId);
    }

    public Child update(Child child) {
        if (childDB.containsKey(child.getChildId())) {
            childDB.put(child.getChildId(), child);
            return child;
        }
        return null;
    }

    public boolean delete(String childId) {
        if (childDB.containsKey(childId)) {
            childDB.remove(childId);
            return true;
        }
        return false;
    }
}
