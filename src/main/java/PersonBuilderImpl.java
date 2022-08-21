/**
 * @author Dm.Petrov
 * DATE: 21.08.2022
 */
public class PersonBuilderImpl implements PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String currentCityOfResidence;

    @Override
    public PersonBuilder setName(String name) {
        this.name = name;

        return this;
    }


    @Override
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;

        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Wrong age");
        }
        return this;
    }

    @Override
    public PersonBuilder setCurrentCityOfResidence(String city) {
        this.currentCityOfResidence = city;
        return this;
    }

    @Override
    public Person build() {
        Person person;
        if (name == null ||surname == null ||name.isEmpty() ||surname.isEmpty()) {
            throw new IllegalStateException("You need to specify both the first and last name");
        }
        if (age < 0) {
            person = new Person(name, surname);
        } else person = new Person(name, surname, age);
        person.setCurrentCityOfResidence(currentCityOfResidence);
        return person;
    }


}



