package BuilderShablon;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        if (age >= 0) {
            return this;
        } else {
            throw new IllegalArgumentException("Возраст не может быть отрицательным.");
        }
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        /*PersonBuilder builder = new PersonBuilder();
        builder.setName(name);
        builder.setSurname(surname);
        builder.setAge(age);
        builder.setAddress(address);*/
        if (name == null || surname == null) {
            throw new IllegalStateException("Для создания пользователя недостаточно данных.");
        } else if (age == 0 || address == null) {
            {
                return new Person(name, surname);
            }
        } else {
            return new Person(name, surname, age, address);
        }
    }

}
