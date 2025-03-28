package za.ac.cput.factory;
import org.junit.jupiter.api.*;
import za.ac.cput.domain.Nanny;
//Author: Nakedi Puleng Veronica (222914556)
//Date 26/03/2025
import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Disabled;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class NannyFactoryTest {

    public static Nanny nanny1 = NannyFactory.createNanny("Veronica", "0833919394", "fullTime");
    public static Nanny nanny2 = NannyFactory.createNanny("HJKL", "0672345678", "fulltime");
    public static Nanny nanny3 = NannyFactory.createNanny("", "0672345678", "2222");

    @Test
    @Order(1)
    public void testCreateNanny() {
        assertNotNull(nanny1);
        System.out.println(nanny1.toString());
    }

    @Test
    @Order(2)
    public void testCreateNannyWithAllAttributes() {
        assertNotNull(nanny2);
        System.out.println(nanny2.toString());
    }

    @Test
    @Order(3)
    public void testCreateNannyThatFails() {
        assertNull(nanny3);
        System.out.println(nanny3);
    }

    @Test
    @Disabled
    @Order(4)
    public void testNotImplemented() {
    }
}