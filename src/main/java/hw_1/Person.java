package hw_1;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private String gender;
    private int age;

    private Person() {
    }

    public static Builder createBuilder() {
        return new Builder();
    }

    public static class Builder {

        private final Person person = new Person();

        public Builder withFirstName(String firstName) {
            person.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            person.lastName = lastName;
            return this;
        }

        public Builder withMiddleName(String middleName) {
            person.middleName = middleName;
            return this;
        }

        public Builder withCountry(String country) {
            person.country = country;
            return this;
        }

        public Builder withAddress(String address) {
            person.address = address;
            return this;
        }

        public Builder withPhone(String phone) {
            person.phone = phone;
            return this;
        }

        public Builder withGender(String gender) {
            person.gender = gender;
            return this;
        }

        public Builder withAge(int age) {
            person.age = age;
            return this;
        }

        public Person build() {
            return person;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
