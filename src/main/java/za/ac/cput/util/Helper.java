package za.ac.cput.util;

import za.ac.cput.domain.Child;

public class Helper {

    //Nanny Methods
    public static boolean isNullOrEmpty(String s) {
        if(s.isEmpty() || s == null)
            return true;
        return false;
    }

    public static boolean isValidEmail(String email) {
        //TODO: Complete
        throw  new UnsupportedOperationException();
        //check dateOfBirth and identification
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
}


