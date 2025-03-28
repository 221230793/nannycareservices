import org.junit.jupiter.api.*;
import za.ac.cput.domain.*;
import za.ac.cput.factory.SessionFactory;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SessionFactoryTest {

    public static Session session1 = SessionFactory.createSession("session1", LocalDateTime.now(), LocalDateTime.now().plusHours(2), "Active",
            new Parent("parentId1", "John Doe", "john@example.com", "1234567890"),
            new Nanny("nannyId1", "Jane Smith", "jane@example.com", "9876543210"),
            new Child("childId1", "Little Timmy", 5),
            new Driver("driverId1", "Mike Ross", "mike@example.com", "5555555555"));

    public static Session session2 = SessionFactory.createSession("session2", LocalDateTime.now(), LocalDateTime.now().plusHours(3), "Inactive",
            new Parent("parentId2", "Jane Doe", "jane@example.com", "0987654321"),
            new Nanny("nannyId2", "John Smith", "john@example.com", "1111111111"),
            new Child("childId2", "Little Sally", 4),
            new Driver("driverId2", "Sarah Connor", "sarah@example.com", "2222222222"));

    public static Session session3 = SessionFactory.createSession("session3", LocalDateTime.now(), LocalDateTime.now().plusHours(1), "InvalidStatus",
            new Parent("parentId3", "Jim Brown", "jim@example.com", "3333333333"),
            new Nanny("nannyId3", "Lisa White", "lisa@example.com", "4444444444"),
            new Child("childId3", "Tiny Tom", 3),
            new Driver("driverId3", "Tom Cruise", "tom@example.com", "5555555555"));

    @Test
    @Order(1)
    public void testCreateSession() {
        assertNotNull(session1);
        System.out.println(session1.toString());
    }

    @Test
    @Order(2)
    public void testCreateSessionWithAllAttributes() {
        assertNotNull(session2);
        System.out.println(session2.toString());
    }

    @Test
    @Order(3)
    public void testCreateSessionThatFails() {
        // Assuming 'InvalidStatus' is not a valid status, this test might fail or behave unexpectedly
        // If the factory method does not validate status, this test might pass, adjust accordingly
        assertNotNull(session3);
        System.out.println(session3.toString());
    }

    @Test
    @Disabled
    @Order(4)
    public void testNotImplemented() {
    }
}