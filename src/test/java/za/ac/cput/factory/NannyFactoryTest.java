package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Nanny;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

 class NannyFactoryTest {

    public static Nanny nanny1 = NannyFactory.createNanny("veronica","0833919394","fullTime");
     public static Nanny nanny2 = NannyFactory.createNanny("hjkl","0672345678","fulltime");
     public static Nanny nanny3= NannyFactory.createNanny("Xolani","0672345678","2222");
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
    public void testCreateNannyThatFails(){
        assertNull(nanny3);
    System.out.println(nanny3.toString());

   //fail();
}
  @Test
  @Disabled
  @Order(4)
    public void testNotImplemented() {

  }
}