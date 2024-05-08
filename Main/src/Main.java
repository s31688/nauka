import java.time.LocalDate;

public class Main {
    public static int counterP = 1;
    public static int counterS = 1;
    public static int counterA = 1;

    public static void main(String[] args) {
        Museum museum = new Museum("Street Warsaw", "War");
        Painting painting = new Painting(LocalDate.now(), "Flowers", "Sth", "Bohemian",
                "Qwerty Abc", 2012);
        painting.showInfo();
        Sculpture sculpture = new Sculpture(LocalDate.now(), "Vase", "Another sth", "rock",
                "Abc Qwerty", 1992);
        sculpture.showInfo();
        Artefact artefact = new Artefact(LocalDate.now(), "Someone someone", "Next sth", "silk",
                1000);
        artefact.showInfo();
        Sculpture sculpture2 = new Sculpture(LocalDate.now(), "Vase", "Another sth", "rock",
                "Abc Qwerty", 1992);
        sculpture2.showInfo();
        museum.addExhibit(painting);
        museum.addExhibit(sculpture);
        museum.addExhibit(painting);
        museum.removeExhibit(artefact);
        System.out.println(museum.exhibits);
        museum.removeExhibit(painting);
        museum.addExhibit(artefact);
        System.out.println(museum.exhibits);
        museum.showLastMaintenanceDate();
    }
}