package za.ac.cput.factory;

import za.ac.cput.domain.Nanny;
import za.ac.cput.util.Helper;
public class NannyFactory {
    public static Nanny createNanny(String name, String phoneNumber, String availability) {

        if(Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(availability)
                ||Helper.isNullOrEmpty(phoneNumber))
            return null;

        return new Nanny.Builder()
                .setName(name)
                .setPhoneNumber(phoneNumber)
                .setEmail(availability)
                .build();
    }

    public static Nanny createNanny(int yearsOfExperience, String availability, double hourlyRate,
                                    String name, String identification, String phoneNumber, String email) {

        if(Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(email)
                ||Helper.isNullOrEmpty(phoneNumber))
            return null;


        if (!Helper.isNullOrEmpty(identification))
            return null;


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