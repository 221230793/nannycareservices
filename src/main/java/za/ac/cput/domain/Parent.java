package za.ac.cput.domain;

public class Parent extends Person {
    private String parentId;
    private String relationshipType;
    private String emergencyContact;

    private Parent(Builder builder) {
        this.name = builder.name;
        this.identification = builder.identification;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.parentId = builder.parentId;
        this.relationshipType = builder.relationshipType;
        this.emergencyContact = builder.emergencyContact;
    }

    public String getParentId() {
        return parentId;
    }

    public String getRelationshipType() {
        return relationshipType;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", identification='" + identification + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", parentId='" + parentId + '\'' +
                ", relationshipType='" + relationshipType + '\'' +
                ", emergencyContact='" + emergencyContact + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private String identification;
        private String email;
        private String phoneNumber;
        private String parentId;
        private String relationshipType;
        private String emergencyContact;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setIdentification(String identification) {
            this.identification = identification;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder setRelationshipType(String relationshipType) {
            this.relationshipType = relationshipType;
            return this;
        }

        public Builder setEmergencyContact(String emergencyContact) {
            this.emergencyContact = emergencyContact;
            return this;
        }

        public Parent build() {
            return new Parent(this);
        }
    }
}