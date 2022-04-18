package BuilderShablon;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    private int age;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        return this.age > 0;
    }

    public boolean hasAddress() {
        return this.address != null;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return  this.age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) {
            this.age += 1;
        }
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder builder = new PersonBuilder();
        builder.setSurname(this.getSurname());
        builder.setAge(this.age);
        builder.setAddress(this.getAddress());
        return builder;
    }

    @Override
    public String toString() {
        if (!hasAge() || address == null) {
            return name + " " + surname;
        } else {
            return name + " " + surname + " возраста " +
                    age + " лет (проживает в городе " + address + ")";
        }
    }

    /*@Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }*/

}
