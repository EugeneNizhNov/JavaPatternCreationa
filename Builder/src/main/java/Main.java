public class Main {
    public static void main(String[] args) {
/** Создание персоны и ребенка*/
        Person mom = new PersonBuilder()
                .setName("Natasha")
                .setSurname("Radchenko")
                .setAge(45)
                .setAddress("Vlodimir")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Leha")
                .setAge(12)
                .build();
        System.out.println("Мама: " + mom + " Сын: " + son);
/** не корректный возраст
 Person age = new PersonBuilder()
 .setName("Natasha")
 .setSurname("Radchenko")
 .setAge(-5)
 .setAddress("Vlodimir")
 .build();
 */
/** отсутствует необходимое поле name
 Person name = new PersonBuilder()
 .setSurname("Radchenko")
 .setAge(45)
 .setAddress("Vlodimir")
 .build();
 */
/** увеличиваем возраст на 1 год через метод happyBirthday()*/
        Person happyBirthday = new PersonBuilder()
                .setName("Natasha")
                .setSurname("Radchenko")
                .setAge(45)
                .setAddress("Vlodimir")
                .build();
        happyBirthday.happyBirthday();
        System.out.println(happyBirthday);
/** установка адресса*/
        Person address = new PersonBuilder()
                .setName("Natasha")
                .setSurname("Radchenko")
                .setAge(45)
                .build();
        address.setAddress("Vlodimir");
        System.out.println(address);
    }
}
