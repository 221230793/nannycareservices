package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.*;
import za.ac.cput.factory.SessionFactory;
import za.ac.cput.repository.ISessionRespository;
import za.ac.cput.repository.SessionRepository;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class SessionRepositoryTest {
    private static ISessionRespository repository = SessionRepository.getRespository();
    private Session session;

    @BeforeAll
    static void setUp() {
        // This setup is static because repository is static
        // Clear any existing sessions before starting tests
        repository.getAll().clear();
    }

    @BeforeEach
    void initSession() {
        // Initialize session before each test to ensure we're working with a fresh session
        session = SessionFactory.createSession("sessionTest", LocalDateTime.now(), LocalDateTime.now().plusHours(2), "Active",
                "John Doe", "parentId", "1234567890", "john@example.com",
                "Jane Smith", "nannyId", "9876543210", "jane@example.com", 5, "FullTime", 15.0,
                "Little Timmy", 5,
                "Mike Ross", "driverId", "5555555555", "mike@example.com");
    }

    @Test
    void a_create() {
        Session created = repository.create(session);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    void c_update() {
        String newStatus = "Completed";
        Session updatedSession = new Session.Builder()
                .setSessionId(session.getSessionId())
                .setStartTime(session.getStartTime())
                .setEndTime(session.getEndTime())
                .setStatus(newStatus)
                .setParent(session.getParent())
                .setNanny(session.getNanny())
                .setChild(session.getChild())
                .setDriver(session.getDriver())
                .build();
        Session result = repository.update(updatedSession);
        assertNotNull(result);
        assertEquals(newStatus, result.getStatus());
        System.out.println(result.toString());
    }

    @Test
    @Disabled
    void d_delete() {
        assertTrue(repository.delete(session.getSessionId()));
        System.out.println("Successfully deleted session");
    }

    @Test
    void e_getAll() {
        // Create another session to test getAll
        Session session2 = SessionFactory.createSession("sessionTest2", LocalDateTime.now(), LocalDateTime.now().plusHours(3), "Inactive",
                "Jane Doe", "parentId2", "0987654321", "jane@example.com",
                "John Smith", "nannyId2", "1111111111", "john@example.com", 3, "PartTime", 20.0,
                "Little Sally", 4,
                "Sarah Connor", "driverId2", "2222222222", "sarah@example.com");
        repository.create(session2);

        System.out.println(repository.getAll());
        assertEquals(2, repository.getAll().size(), "There should be 2 sessions in the repository");
    }
}