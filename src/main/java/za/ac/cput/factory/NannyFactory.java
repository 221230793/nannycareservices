package za.ac.cput.factory;
//Author: Nakedi Puleng Veronica (222914556)
//Date 18/03/2025
import za.ac.cput.domain.Nanny;
import za.ac.cput.util.Helper;

public class NannyFactory {
    public static Nanny createNanny(String name, String phoneNumber, String availability) {
        if (Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(phoneNumber) || Helper.isNullOrEmpty(availability)) {
            return null;
        }
        return new Nanny.Builder()
                .setName(name)
                .setPhoneNumber(phoneNumber)
                .setEmail(availability)
                .build();
    }

    public static Nanny createNanny(int yearsOfExperience, String availability, double hourlyRate,
                                    String name, String identification, String phoneNumber, String email) {

        boolean isInvalidInput = Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(email)
                || Helper.isNullOrEmpty(phoneNumber) || !Helper.isNullOrEmpty(identification);

        if (isInvalidInput) {
            return null;
        }

        return new Nanny.Builder()
                .setName(name)
                .setPhoneNumber(phoneNumber)
                .setEmail(email)
                .setIdentification(identification)
                .setYearsOfExperience(yearsOfExperience)
                .setHourlyRate(hourlyRate)
                .setAvailability(availability)
                .build();
    }
}
