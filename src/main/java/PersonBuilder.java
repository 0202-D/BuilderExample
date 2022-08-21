public interface PersonBuilder {
    PersonBuilder setName(String name);
    PersonBuilder setSurname(String surname);
    PersonBuilder setAge(int age);
    PersonBuilder setCurrentCityOfResidence(String city);
    Person build();

}
