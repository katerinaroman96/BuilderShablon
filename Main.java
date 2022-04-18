package BuilderShablon;

public class Main {

    public static void main(String[] args) {
        Person dad = new PersonBuilder()
                .setName("Валерий")
                .setSurname("Иванов")
                .setAge(38)
                //.setAddress("Москва")
                .build();

        Person son = dad.newChildBuilder()
                .setName("Иван")
                .setAge(9)
                .build();

        Person mom = new PersonBuilder()
                .setName("Людмила")
                .setSurname("Роман")
                .setAge(50)
                .setAddress("Барнаул")
                .build();

        Person daughter = mom.newChildBuilder()
                .setName("Катя")
                .setAge(4)
                .build();

        System.out.println("У пользователя " + dad + " есть сын " + son);
        System.out.println("У пользователя " + mom + " есть дочь " + daughter);

        son.happyBirthday();
        System.out.println("С днем рождения! " +
                "Сегодня человечку по имени " + son.getName() + " " + son.getSurname()
                + " исполнилось " + son.getAge() + " лет!");

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException ex) {
            ex.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(-1).build();
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
    }
}
