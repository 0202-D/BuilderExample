import java.util.Objects;
import java.util.OptionalInt;

/**
 * @author Dm.Petrov
 * DATE: 21.08.2022
 */
public class Person {

    protected final String name;
    protected final String surname;
    protected int age;
    protected String currentCityOfResidence;



    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Person(String name, String surname,int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && surname.equals(person.surname) && currentCityOfResidence.equals(person.currentCityOfResidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, currentCityOfResidence);
    }
    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }


    public boolean hasAge() {
        return age >= 0;
    }

    public boolean hasAddress() {
        return currentCityOfResidence != null;
    }

    public void happyBirthday() {
        if (hasAge()) age++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public String getCurrentCityOfResidence() {
        return currentCityOfResidence;
    }

    public void setCurrentCityOfResidence(String currentCityOfResidence) {
        this.currentCityOfResidence = currentCityOfResidence;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilderImpl().setSurname(surname).setCurrentCityOfResidence(currentCityOfResidence);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", currentCityOfResidence='" + currentCityOfResidence + '\'' +
                '}';
    }
}
