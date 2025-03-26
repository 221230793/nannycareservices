package za.ac.cput.factory;

import za.ac.cput.domain.Child;
import java.util.Random;
public class ChildFactory {
    public static final Random random = new Random();
    public static int generateNumericID(){

        return 100000 + random.nextInt(90000000);
    }

    public static Child createChild(int age, String medicalInfo) {

        if (age <=0 || age>= 18) {
            throw new IllegalArgumentException("Age must be between 1 and 17");
        }
        int generatedID = generateNumericID();
        return new Child.Builder()
                .setChildId(String.valueOf(generatedID))
                .setAge(age)
                .setMedicalInfo(medicalInfo)
                .build();
    }
}
