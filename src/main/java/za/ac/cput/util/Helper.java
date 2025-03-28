package za.ac.cput.util;

import za.ac.cput.domain.Nanny;
import za.ac.cput.domain.Driver;

   public class Helper {

       //----------Nanny Methods ---------//
       //Author: Nakedi Puleng Veronica (222914556)
       //Date 28/03/2025
       public static boolean isValidNanny(Nanny nanny) {
            if (nanny == null) return false;

            if (isNullOrEmpty(nanny.getName()) ||
                    isNullOrEmpty(nanny.getPhoneNumber()) ||
                    isNullOrEmpty(nanny.getAvailability())) {
                return false;
            }

            if (nanny.getYearsOfExperience() < 0 || nanny.getHourlyRate() < 0) {
                return false;
            }

            if (!isValidPhoneNumber(nanny.getPhoneNumber())) {
                return false;
            }

            return true;
        }

        public static boolean isNullOrEmpty(String value) {
            return value == null || value.trim().isEmpty();
        }

        private static boolean isValidPhoneNumber(String phoneNumber) {
            // Example of a simple check for a phone number (adjust pattern as needed)
            String regex = "^\\+?[0-9]{10,15}$";
            return phoneNumber.matches(regex);


        }
       //---------------Child Methods-------------//
        public static boolean isValidAge(int age) {
            return age >0 && age < 18;
        }

        public static boolean hasMedicalInfo(String medicalInfo) {
            return medicalInfo != null && !medicalInfo.trim().isEmpty();
        }

        public static boolean isValidChildId(String childId) {
            return childId.matches("\\d{6,8}");}
       //---------------Driver Methods-------------//
       public static boolean isValidDriver(Driver driver) {
           if (driver == null) return false;

           if (isNullOrEmpty(driver.getName()) ||
                   isNullOrEmpty(driver.getIdentification()) ||
                   isNullOrEmpty(driver.getEmail()) ||
                   isNullOrEmpty(driver.getVehicleDetails()) ||
                   isNullOrEmpty(driver.getAvailability()) ||
                   isNullOrEmpty(driver.getLicenseNumber())) {
               return false;
           }

           if (!isValidEmail(driver.getEmail()) ||
                   !isValidLicenseNumber(driver.getLicenseNumber()) ||
                   !isValidAvailability(driver.getAvailability())) {
               return false;
           }

           return true;
       }

       public static boolean isValidLicenseNumber(String licenseNumber) {
           // Simple validation to check if the license number contains only letters, numbers, and dashes
           return licenseNumber != null && licenseNumber.matches("[A-Z0-9-]+");
       }

       public static boolean isValidEmail(String email) {
           // Basic email validation regex
           return email != null && email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
       }

       public static boolean isValidAvailability(String availability) {
           return "Available".equalsIgnoreCase(availability) || "Unavailable".equalsIgnoreCase(availability);
       }
    }






