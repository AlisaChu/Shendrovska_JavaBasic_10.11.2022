package less12;

public class Main {
    public static void main(String[] args) {


        MusicStyle[] musicStyles = {new RockMusic("Sky"),
                new PopMusic("Boombox"),
                new ClassicMusic("Nikolai Leontovich"),
        };
        for (MusicStyle musicStyle : musicStyles) {
            musicStyle.playMusic();
        }
    }
}

