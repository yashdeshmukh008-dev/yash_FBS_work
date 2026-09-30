class Artist {
    protected String name;
    protected int age;

    public Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayArtist() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Painter extends Artist {
    private String paintingStyle;
    private String mediumUsed;
    private int numberOfPaintings;

    public Painter(String name, int age, String paintingStyle,
                   String mediumUsed, int numberOfPaintings) {
        super(name, age);
        this.paintingStyle = paintingStyle;
        this.mediumUsed = mediumUsed;
        this.numberOfPaintings = numberOfPaintings;
    }

    public void displayPainter() {
        displayArtist();
        System.out.println("Painting Style: " + paintingStyle);
        System.out.println("Medium Used: " + mediumUsed);
        System.out.println("Number of Paintings: " + numberOfPaintings);
    }
}

class Musician extends Artist {
    private String instrument;
    private String musicGenre;
    private int numberOfAlbums;

    public Musician(String name, int age, String instrument,
                    String musicGenre, int numberOfAlbums) {
        super(name, age);
        this.instrument = instrument;
        this.musicGenre = musicGenre;
        this.numberOfAlbums = numberOfAlbums;
    }

    public void displayMusician() {
        displayArtist();
        System.out.println("Instrument: " + instrument);
        System.out.println("Music Genre: " + musicGenre);
        System.out.println("Number of Albums: " + numberOfAlbums);
    }
}

class Actor extends Artist {
    private String filmIndustry;
    private int numberOfMovies;

    public Actor(String name, int age, String filmIndustry,
                 int numberOfMovies) {
        super(name, age);
        this.filmIndustry = filmIndustry;
        this.numberOfMovies = numberOfMovies;
    }

    public void displayActor() {
        displayArtist();
        System.out.println("Film Industry: " + filmIndustry);
        System.out.println("Number of Movies: " + numberOfMovies);
    }
}
