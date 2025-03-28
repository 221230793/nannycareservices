package za.ac.cput.factory;

import za.ac.cput.domain.Driver;
import za.ac.cput.util.Helper;

public class DriverFactory {

    public static Driver createDriver(String name, String identification, String email,
                                      String vehicleDetails, String availability, String licenseNumber) {

        if (Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(identification) ||
                Helper.isNullOrEmpty(email) || Helper.isNullOrEmpty(vehicleDetails) ||
                Helper.isNullOrEmpty(availability) || Helper.isNullOrEmpty(licenseNumber)) {
            return null;
        }

        if (!Helper.isValidEmail(email) || !Helper.isValidLicenseNumber(licenseNumber) ||
                !Helper.isValidAvailability(availability)) {
            return null;
        }

        return new Driver.Builder()
                .setName(name)
                .setIdentification(identification)
                .setEmail(email)
                .setVehicleDetails(vehicleDetails)
                .setAvailability(availability)
                .setLicenseNumber(licenseNumber)
                .build();
    }
}
