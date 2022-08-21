/**
 * @author Dm.Petrov
 * DATE: 21.08.2022
 */
public class Main {
    public static void main(String[] args)  {
        Person mom = new PersonBuilderImpl()
                .setName("Claire")
                .setSurname("Thomson")
                .setAge(25)
                .setCurrentCityOfResidence("Saint-Petersburg")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Tony")
                .build();
        System.out.println( mom + " has son, " + son);

        try {
            // Не хватает обяхательных полей
            new PersonBuilderImpl().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilderImpl().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}

