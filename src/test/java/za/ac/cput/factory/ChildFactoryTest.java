package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Child;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ChildFactoryTest {


        public static Child child1 = ChildFactory.createChild( 5, "No allergies");
        public static Child child2 = ChildFactory.createChild( 7, "Asthma");
        public static Child child3 = ChildFactory.createChild(0, null);

        @Test
        @Order(1)
        public void testCreateChild() {
            assertNotNull(child1);
            System.out.println(child1.toString());
        }

        @Test
        @Order(2)
        public void testCreateChildWithAllAttributes() {
            assertNotNull(child2);
            System.out.println(child2.toString());
        }

        @Test
        @Order(3)
        public void testCreateChildThatFails() {
            assertNull(child3.getChildId());
            System.out.println(child3.toString());
        }
}
