package za.ac.cput.repository;
//Author: Nakedi Puleng Veronica (222914556)
//Date 25/03/2025

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Nanny;
import za.ac.cput.factory.NannyFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class NannyRepositoryTest {
    private static INannyRepository repository = NannyRepository.getRepository();
    private Nanny nanny = NannyFactory.createNanny("Nicholas","0833919394","fullTime");


    @Test
    void a_create() {
        Nanny created  = repository.create(nanny);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    void c_update() {
        Nanny updatedNanny = new Nanny.Builder()
                .build();

        Nanny result = repository.update(updatedNanny);
        assertNotNull(result);

        System.out.println(result.toString());
    }


    @Test
    @Disabled
    void d_delete() {
        assertTrue(repository.delete(nanny.getYearsOfExperience()));
        System.out.println("Successfully deleted nanny");
    }
    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}