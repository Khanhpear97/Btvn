import java.time.LocalDate;

public class Person {
    String name;
    String birthday;
    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    public String getName() {
        return this.name;
    }
    public String getBirthday() {
        return this.birthday;
    }
    public int getAge() {
        LocalDate date1 = LocalDate.parse(this.birthday);
        int year1 = date1.getYear();
        LocalDate date2 = LocalDate.now();
        int year2 = date2.getYear();
        return year2 - year1;
    }
    public String celebrateBirthday() {
        LocalDate date1 = LocalDate.parse(this.birthday);
        int birthDay = date1.getDayOfMonth();
        int birthMonth = date1.getMonthValue();
        LocalDate date2 = LocalDate.now();
        int nowDay = date2.getDayOfMonth();
        int nowMonth = date2.getMonthValue();
        int nowYear = date2.getYear();
        if (nowDay >= birthDay && nowMonth >= birthMonth || nowMonth >= birthMonth) {
            return (nowYear + 1) + "-" + birthMonth + "-" + birthDay;
        }
        return nowYear + "-" + birthMonth + "-" + birthDay;
    }
}
