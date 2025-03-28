package za.ac.cput.factory;

import za.ac.cput.domain.Driver;
import za.ac.cput.util.Helper;

public class DriverFactory {


        public static Driver createDriver(String name, String identification, String email) {

            if (Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(identification) ||
                    Helper.isNullOrEmpty(email) || Helper.isNullOrEmpty(vehicleDetails) ||
                    Helper.isNullOrEmpty(availability) || Helper.isNullOrEmpty(licenseNumber)) {
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

        public static Driver createBasicDriver(String name, String identification, String vehicleDetails) {

            if (Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(identification) ||
                    Helper.isNullOrEmpty(vehicleDetails)) {
                return null;
            }

            return new Driver.Builder()
                    .setName(name)
                    .setIdentification(identification)
                    .setVehicleDetails(vehicleDetails)
                    .build();
        }
    }
