package za.ac.cput.repository;

import org.junit.jupiter.api.*;
        import za.ac.cput.domain.Driver;
import za.ac.cput.factory.DriverFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class DriverRepositoryTest {
    private static IDriverRepository repository = DriverRepository.getRepository();
    private static Driver driver = DriverFactory.createDriver("John Doe", "123456789", "johndoe@email.com",
            "Toyota Corolla - White - 2020", "Available", "DL123456");

    @Test
    void a_create() {
        Driver created = repository.create(driver);
        assertNotNull(created);
        System.out.println("Created: " + created.toString());
    }

    @Test
    void b_read() {
        Driver found = repository.read(driver.getLicenseNumber());
        assertNotNull(found);
        System.out.println("Read: " + found.toString());
    }

    @Test
    void c_update() {
        Driver updatedDriver = new Driver.Builder()
                .setName("John Doe Updated")
                .setIdentification(driver.getIdentification())
                .setEmail(driver.getEmail())
                .setVehicleDetails("Toyota Corolla - Black - 2021")
                .setAvailability("Unavailable")
                .setLicenseNumber(driver.getLicenseNumber())
                .build();

        Driver result = repository.update(updatedDriver);
        assertNotNull(result);
        System.out.println("Updated: " + result.toString());
    }

    @Test
    @Disabled
    void d_delete() {
        assertTrue(repository.delete(driver.getLicenseNumber()));
        System.out.println("Successfully deleted driver");
    }

    @Test
    void e_getAll() {
        System.out.println("All Drivers: " + repository.getAll());
    }
}
