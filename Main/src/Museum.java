import java.time.LocalDate;
import java.util.ArrayList;

public class Museum {
    private final String address;
    private final String name;
    public ArrayList<Exhibit> exhibits = new ArrayList<>();

    public Museum(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void addExhibit(Exhibit exhibit) {
        try {
            if (exhibits.contains(exhibit)) {
                throw new IllegalArgumentException("Exhibit already exists");
            }
            exhibits.add(exhibit);
        } catch (IllegalArgumentException e) {
            e.getStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void removeExhibit(Exhibit exhibit) {
        try {
            if (!exhibits.contains(exhibit)) {
                throw new IllegalArgumentException("Exhibit does not exist");
            }
            exhibits.remove(exhibit);
        } catch (IllegalArgumentException e) {
            e.getStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void showLastMaintenanceDate() {
        System.out.println(LocalDate.now());
    }
}