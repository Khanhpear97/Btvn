public class Main {
    public static void main(String[] args) {
        Person person = new Person("Khanh", "1997-04-19");
        int age = person.getAge();
        System.out.println("Tuoi: " + age);
        System.out.println("Ngay sinh nhat tiep theo: " + person.celebrateBirthday());
    }
}