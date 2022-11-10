package less11;

public class TrackerMain {
    public static void main(String[] args) {

        new Tracker("Alisa", 13, 3, 1989, "alisamorgan1303@gmail.com",
                "+30732195471", "Chu", 49, 92, 21000l).printAccountInfo();
        new Tracker("Vadym", 8, 2, 1982, "german1488@gmail.com",
                "+30732514803", "German", 92, 68, 15000l).printAccountInfo();
        new Tracker("Sergei",10,5,1986,"SergeiAndreev@gmail.com",
                "+380987151985","Andreev",92,85,30000l).printAccountInfo();
        new Tracker("Anna",10,12,1987,"VictoriaShanty@gmail.com",
                "+30732452369","Molly",60,80,6000).printAccountInfo();
        Tracker Victoria = new Tracker("Victoria", 14, 5, 1988,
                "VictoriaShanty@gmail.com", "+30732415698", "Voronina", 55, 86, 9000l);
        Tracker Sem = new Tracker("Sem", 20, 6, 1990,
                "Sem1990@gmail.com", "+30732596898", "Sidorov", 72, 61, 12000l);

        Victoria.printAccountInfo();
        Victoria.setSurname("Komanina");
        Victoria.setWeight(49);
        Victoria.setPressure(140);
        Victoria.setStepsByDay(20000);
        Victoria.printAccountInfo();

        Sem.printAccountInfo();
        Sem.setSurname("Ivanov");
        Sem.setWeight(80);
        Sem.setPressure(120);
        Sem.setStepsByDay(30000);
        Sem.printAccountInfo();

    }
}

