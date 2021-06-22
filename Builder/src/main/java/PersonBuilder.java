public class PersonBuilder implements Builder {
    private String name;
    private String surName;
    private int age;
    private String address;


    @Override
    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Builder setSurname(String surName) {
        this.surName = surName;
        return this;
    }

    @Override
    public Builder setAge(int age) {
       if (age <= 0) {
            throw new IllegalArgumentException("Неверный возраст");
        }
       else {
           this.age = age;
           return this;
       }
    }

    @Override
    public Builder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public Person build() {
        if(name == null || surName == null){
            throw new IllegalStateException("Не заполнены поля Имя и(или) Фамилия");
        }
        return new Person(name, surName, age, address);
    }
}
