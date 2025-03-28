package za.ac.cput;

import za.ac.cput.domain.Address;
import za.ac.cput.domain.Nanny;

public class Main {

    // Nakedi Puleng Veronica (222914556)
     // 28/03/2025
        public static void main(String[] args) {
            Address address = new Address("123 Main St", "Cape Town", "8001");

            Nanny nanny = new Nanny.Builder()
                    .setName("Anna Smith")
                    .setIdentification("ID123456")
                    .setEmail("anna.smith@example.com")
                    .setPhoneNumber("012-345-6789")
                    .setYearsOfExperience(10)
                    .setAvailability("Full-time")
                    .setHourlyRate(20.50)
                    .setAddress(address)
                    .build();

            System.out.println(nanny.toString());
        }
    }


