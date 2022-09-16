package hw_1;

public class Main {
    public static void main(String[] args) {
        Person person = Person.createBuilder()
                .withFirstName("fn")
                .withLastName("ln")
                .withAddress("add")
                .withGender("m")
                .withCountry("denmark")
                .withPhone("123")
                .withAge(30)
                .withMiddleName("mn")
                .build();

        System.out.println(person);
    }
}
