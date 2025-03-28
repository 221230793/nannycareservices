package za.ac.cput.repository;
import org.junit.jupiter.api.*;
import za.ac.cput.domain.Child;
import za.ac.cput.factory.ChildFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class ChildRepositoryTest {
    private static ChildRepository repository = ChildRepository.getRepository();
    private Child child = ChildFactory.createChild( 5, "No allergies");

    @Test
    void a_create() {
        Child created = repository.create(child);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    void b_update() {
        Child updatedChild = new Child.Builder()
                .setChildId("C123")
                .setAge(6)
                .setMedicalInfo("Updated Info")
                .build();
        Child result = repository.update(updatedChild);
        assertNotNull(result);
        System.out.println(result.toString());
    }

    @Test
    @Disabled
    void c_delete() {
        assertTrue(repository.delete(child.getChildId()));
        System.out.println("Successfully deleted child");
    }

}
