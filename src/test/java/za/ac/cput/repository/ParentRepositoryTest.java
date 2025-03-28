package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Parent;
import za.ac.cput.factory.ParentFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ParentRepositoryTest {
    private static IParentRepository repository = ParentRepository.getRepository();
    private Parent parent = ParentFactory.createParent(
            "John Doe",
            "ID123456",
            "john@email.com",
            "0831234567",
            "Father",
            "0111234567"
    );

    @Test
    void a_create() {
        Parent created = repository.create(parent);
        assertNotNull(created);
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Parent read = repository.read(parent.getParentId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Parent updated = new Parent.Builder()

                .setName("John Smith")
                .setEmail("john.smith@email.com")
                .build();

        Parent result = repository.update(updated);
        assertNotNull(result);
        System.out.println("Updated: " + result);
    }

    @Test
    @Disabled
    void d_delete() {
        boolean success = repository.delete(parent.getParentId());
        assertTrue(success);
        System.out.println("Deleted: " + parent.getParentId());
    }

    @Test
    void e_getAll() {
        System.out.println("All Parents:");
        repository.getAll().forEach(System.out::println);
    }
}