package za.ac.cput.repository;

import za.ac.cput.domain.Parent;
import java.util.List;

public interface IParentRepository {
    Parent create(Parent parent);
    Parent read(String parentId);
    Parent update(Parent parent);
    boolean delete(String parentId);
    List<Parent> getAll();
}