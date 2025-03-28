package za.ac.cput.repository;

import za.ac.cput.domain.Parent;
import java.util.ArrayList;
import java.util.List;

public class ParentRepository implements IParentRepository {
    private static IParentRepository repository = null;
    private List<Parent> parentList;

    private ParentRepository() {
        parentList = new ArrayList<>();
    }

    public static IParentRepository getRepository() {
        if (repository == null) {
            repository = new ParentRepository();
        }
        return repository;
    }

    @Override
    public Parent create(Parent parent) {
        if (parent != null) {
            parentList.add(parent);
            return parent;
        }
        return null;
    }

    @Override
    public Parent read(String parentId) {
        return parentList.stream()
                .filter(p -> p.getParentId().equals(parentId))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Parent update(Parent parent) {
        String parentId = parent.getParentId();
        Parent existing = read(parentId);
        if (existing != null) {
            parentList.remove(existing);
            parentList.add(parent);
            return parent;
        }
        return null;
    }

    @Override
    public boolean delete(String parentId) {
        Parent toDelete = read(parentId);
        return toDelete != null && parentList.remove(toDelete);
    }

    @Override
    public List<Parent> getAll() {
        return new ArrayList<>(parentList);
    }
}