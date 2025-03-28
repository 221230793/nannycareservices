package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Parent;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ParentFactoryTest {
    public static Parent parent1 = ParentFactory.createParent(
            "Veronica",
            "ID123456",
            "veronica@email.com",
            "0833919394",
            "Mother",
            "0111234567"
    );

    public static Parent parent2 = ParentFactory.createParent(
            "John Smith",
            "ID789012",
            "john@email.com",
            "0672345678",
            "Father",
            "0117654321"
    );

    public static Parent parent3 = ParentFactory.createParent(
            "",  // Invalid empty name
            "",  // Invalid empty ID
            "invalid-email",
            "123",  // Invalid phone
            "",  // Empty relationship
            ""   // Empty emergency contact
    );

    @Test
    @Order(1)
    public void testCreateParent() {
        assertNotNull(parent1);
        System.out.println(parent1.toString());
    }

    @Test
    @Order(2)
    public void testCreateParentWithAllAttributes() {
        assertNotNull(parent2);
        System.out.println(parent2.toString());
    }

    @Test
    @Order(3)
    public void testCreateParentThatFails() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ParentFactory.createParent(
                    "",
                    "",
                    "invalid-email",
                    "123",
                    "",
                    ""
            );
        });
        System.out.println("Expected exception: " + exception.getMessage());
    }

    @Test
    @Disabled
    @Order(4)
    public void testNotImplemented() {
        // Test intentionally disabled
    }
}