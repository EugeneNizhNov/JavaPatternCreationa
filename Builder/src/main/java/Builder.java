public interface Builder {
    Builder setName(String name);

    Builder setSurname(String surName);

    Builder setAge(int age);

    Builder setAddress(String address);

    Person build();
}
