class Artist {
    protected String name;
    protected int age;

    public Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void perform() {
        System.out.println("Artist is performing.");
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

    @Override
    public void perform() {
        System.out.println("Painter is creating a painting.");
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

    @Override
    public void perform() {
        System.out.println("Musician is playing music.");
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

    @Override
    public void perform() {
        System.out.println("Actor is performing in a movie.");
    }
}
