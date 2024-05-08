import java.time.LocalDate;

public abstract class Exhibit {
    private final int exhibitCount;
    private final LocalDate lastMaintenanceDate;
    private final String name;
    private final String idNumber;
    private final String description;

    public Exhibit(LocalDate lastMaintenanceDate, String name, String description) {
        if(this.getClass().getName().equals("Painting")) {
            this.exhibitCount = Main.counterP;
            Main.counterP++;
        } else if(this.getClass().getName().equals("Sculpture")) {
            this.exhibitCount = Main.counterS;
            Main.counterS++;
        } else {
            this.exhibitCount = Main.counterA;
            Main.counterA++;
        }
        this.lastMaintenanceDate = lastMaintenanceDate;
        this.name = name;
        this.idNumber = this.getClass() + "#" + exhibitCount;
        this.description = description;
    }

    public int getExhibitCount() {
        return exhibitCount;
    }

    public LocalDate getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getDescription() {
        return description;
    }

    public void showInfo() {
        System.out.println(this.getClass() + " (" + this.getExhibitCount() + " " + this.getLastMaintenanceDate() + " "
                + this.getName() + " " + this.getIdNumber() + " " + this.getDescription() + " " + ")");
    }
}

class Painting extends Exhibit {
    private final String style;
    private final String author;
    private final int year;

    public Painting(LocalDate lastMaintenanceDate, String name, String description, String style, String author, int year) {
        super(lastMaintenanceDate, name, description);
        this.style = style;
        this.author = author;
        this.year = year;
    }

    public String getStyle() {
        return style;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void showInfo() {
        System.out.println(this.getClass().getName() + " (" + this.getExhibitCount() + " " + this.getLastMaintenanceDate() + " "
                + this.getName() + " " + this.getIdNumber() + " " + this.getDescription() + " " + this.getStyle() + " "
                + this.getAuthor() + " " + this.getYear() + ")");
    }
}

class Sculpture extends Exhibit {
    private final String material;
    private final String author;
    private final int year;

    public Sculpture(LocalDate lastMaintenanceDate, String name, String description, String material, String author,
                     int year) {
        super(lastMaintenanceDate, name, description);
        this.material = material;
        this.author = author;
        this.year = year;
    }

    public String getMaterial() {
        return material;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void showInfo() {
        System.out.println(this.getClass().getName() + " (" + this.getExhibitCount() + " " + this.getLastMaintenanceDate() + " "
                + this.getName() + " " + this.getIdNumber() + " " + this.getDescription() + " " + this.getMaterial() + " "
                + this.getAuthor() + " " + this.getYear() + ")");
    }
}

class Artefact extends Exhibit {
    private final String material;
    private final int timePeriod;

    public Artefact(LocalDate lastMaintenanceDate, String name, String description, String material, int timePeriod) {
        super(lastMaintenanceDate, name, description);
        this.material = material;
        this.timePeriod = timePeriod;
    }

    public String getMaterial() {
        return material;
    }

    public int getTimePeriod() {
        return timePeriod;
    }

    @Override
    public void showInfo() {
        System.out.println(this.getClass().getName() + " (" + this.getExhibitCount() + " " + this.getLastMaintenanceDate() + " "
                + this.getName() + " " + this.getIdNumber() + " " + this.getDescription() + " " + this.getMaterial() + " "
                + this.getTimePeriod() + ")");
    }
}