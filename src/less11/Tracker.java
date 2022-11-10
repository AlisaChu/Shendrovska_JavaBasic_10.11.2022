package less11;

public class Tracker {

    private final String name;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private final String email;
    private final String phone;

    private String surname;
    private int weight;
    private int pressure;
    private long stepsByDay;
    private int age;

    public Tracker (String name, int dayOfBirth, int monthOfBirth,
            int yearOfBirth, String email, String phone,
            String surname, int weight, int pressure, long stepsByDay) {

        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsByDay = stepsByDay;
        this.age = 2022 - yearOfBirth;
    }
    public String getName() {
        return this.name;
    }
    public int getDayOfBirth() {
        return this.dayOfBirth;
    }
    public int getMonthOfBirth() {
        return this.monthOfBirth;
    }
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhone() {
        return this.phone;
    }
    public String getSurname() {
        return this.surname;
    }
    public int getWeight() {
        return this.weight;
    }
    public int getPressure() {
        return this.pressure;
    }
    public long getStepsByDay() {
        return this.stepsByDay;
    }
    public int getAge() {
        return this.age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    public void setStepsByDay(int stepsByDay) {
        this.stepsByDay = stepsByDay;
    }

    public void printAccountInfo() {
        System.out.println(this);
    }
    public String toString() {

        return "AccountInfo: "+ " " + "name "+ " " + this.name + " " + "day birth " + " " + this.dayOfBirth + " " + "month birth "
                + this.monthOfBirth + " " + "year birth " + this.yearOfBirth + " " + "email " + this.email + " "
                + "phone " + this.phone + " " + "surname " + this.surname + " " + "weight " + this.weight + " " + "pressure " +
                this.pressure + " " + "stepsByDay " + this.stepsByDay + " " + "age " + this.age + " ";
    }
}










