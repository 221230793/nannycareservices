package za.ac.cput.domain;

public class Child {

        private String ChildId;
        private int age;
        private String medicalInfo;

        public Child() {
        }

        public Child(Builder builder) {
            this.ChildId = builder.ChildId;
            this.age = builder.age;
            this.medicalInfo = builder.medicalInfo;
        }

        public String getChildId() {
            return ChildId;
        }

        public int getAge() {
            return age;
        }

        public String getMedicalInfo() {
            return medicalInfo;
        }

        @Override
        public String toString() {
            return "Child{" +
                    "ChildId='" + ChildId + '\'' +
                    ", age=" + age +
                    ", medicalInfo='" + medicalInfo + '\'' +
                    '}';
        }

        public static class Builder {
            private String ChildId;
            private int age;
            private String medicalInfo;


            public Builder setChildId(String childId) {
                this.ChildId = childId;
                return this;
            }

            public Builder setAge(int age) {
                this.age = age;
                return this;
            }

            public Builder setMedicalInfo(String medicalInfo) {
                this.medicalInfo = medicalInfo;
                return this;
            }
            public Child build() {return new Child(this);}
        }
    }
