package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Driver;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)

    class DriverFactoryTest {

        public static Driver driver1 = DriverFactory.createDriver("Ayanda","0211140288088","nosiphiwomshwe2@gmail.com");
        public static Driver driver2 = DriverFactory.createDriver("Phila","0213151238088","Sandeme6@gmail");
        public static Driver driver3 = DriverFactory.createDriver("Sivuyise" ,"6212140178018","nosiphiwomshwe2@gmail");

        @Test
        @Order(1)
        public void testCreateDriver() {
            assertNotNull(driver1);
            System.out.println(driver1.toString());

        }
        @Test
        @Order(2)
        public void testCreateDriverWithAllAttributes() {
            assertNotNull(driver2);
            System.out.println(driver2.toString());
        }
        @Test
        @Order(3)
        public void testCreateDriverThatFails(){
            assertNull(driver3);
            System.out.println(driver3.toString());

        }
        @Test
        @Disabled
        @Order(4)
        public void testNotImplemented() {

        }

    }
