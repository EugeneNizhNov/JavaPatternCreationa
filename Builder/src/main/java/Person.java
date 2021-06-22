import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surName;
    protected int age;
    protected String address;

    public Person(String name, String surName, int age, String address) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        if (!hasAddress()) {
            this.address = address;
        }
    }

    @Override
    public String toString() {
        return " name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'';
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder builder = new PersonBuilder();
        builder.setSurname(surName);
        builder.setAddress(address);
        return builder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && surName.equals(person.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }

    public void happyBirthday() {
        if (hasAge()) {
            PersonBuilder builder = new PersonBuilder();
            age++;
            builder.setAge(age);
        }
    }

    public Boolean hasAddress() {
        return address != null;
    }

    public Boolean hasAge() {
        return age != 0;
    }
}
