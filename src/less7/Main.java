package less7;

public class Main {
    public static void main(String[] args) {

        Persona Will = new Persona("Will", "Smith", "New York", "2936729462846");
        Persona Jackie = new Persona("Jackie", "Chan", "Shanghai", "12312412412");
        Persona Sherlock = new Persona("Sherlock", "Holmes", "London", "37742123513");

        System.out.println(Will.personaInfo());
        System.out.println(Jackie.personaInfo());
        System.out.println(Sherlock.personaInfo());

    }
}

