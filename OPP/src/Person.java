public class Person {
    String name;
    String birthday;
    String email;
    String phoneNumber;

    public Person(String name, String birthday, String email, String phoneNumber) {
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        Person nik = new Person("Nik", "1994-11-15", "nik@email.com", "+1848589");
        nik.getName();
        nik.getBirthday();
        nik.getEmail();
        nik.getPhoneNumber();
        Person max = new Person("Max", "1992-03-16", "max@email.com", "+532564752");
        max.getName();
        max.getBirthday();
        max.getEmail();
        max.getPhoneNumber();
    }

    public void getName() {
        System.out.println("Name ------- | " + name);
    }

    public void getBirthday() {
        System.out.println("Birth day -- | " + birthday);
    }

    public void getEmail() {
        System.out.println("Email ------ | " + email);
    }

    public void getPhoneNumber() {
        System.out.println("Phone number | " + phoneNumber);
    }
}
