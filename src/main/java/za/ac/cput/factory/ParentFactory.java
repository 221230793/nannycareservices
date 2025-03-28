package za.ac.cput.factory;

import za.ac.cput.domain.Parent;
import za.ac.cput.util.Helper;

public class ParentFactory {
    public static Parent createParent(String name, String identification, String email,
                                      String phoneNumber, String relationshipType,
                                      String emergencyContact) {

        if (Helper.isNullOrEmpty(name) ||
                Helper.isNullOrEmpty(identification) ||
                Helper.isNullOrEmpty(phoneNumber)) {
            throw new IllegalArgumentException("Name, ID and phone are required");
        }

        if (!Helper.isValidPhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Invalid phone number");
        }

        String parentId = Helper.generateParentId();

        return new Parent.Builder()
                .setName(name)
                .setIdentification(identification)
                .setEmail(email)
                .setPhoneNumber(phoneNumber)
                .setParentId(parentId)
                .setRelationshipType(relationshipType)
                .setEmergencyContact(emergencyContact)
                .build();
    }
}