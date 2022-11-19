package less7;

public class Persona {
    private String name;
    private String secondName;
    private String city;
    private String phone;

    public Persona(String name, String secondName, String city, String phone){
        this.name = name;
        this.secondName = secondName;
        this.city = city;
        this.phone = phone;

    }
    public String personaInfo(){
        String info = "call citizen" + " " + name + " " + secondName + " " + "city" + " " + city + " " +"can by number" + " " + phone;
        return info;
    }
}

