class Player {
    protected String name;
    protected int age;
    protected String country;
    protected int matchesPlayed;
    protected int jerseyNumber;

    public Player(String name, int age, String country,
                  int matchesPlayed, int jerseyNumber) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.matchesPlayed = matchesPlayed;
        this.jerseyNumber = jerseyNumber;
    }

    public void play() {
        System.out.println("Player is playing a sport.");
    }
}

class CricketPlayer extends Player {
    private int totalRuns;
    private int totalWickets;
    private String battingStyle;
    private String bowlingStyle;

    public CricketPlayer(String name, int age, String country,
                         int matchesPlayed, int jerseyNumber,
                         int totalRuns, int totalWickets,
                         String battingStyle, String bowlingStyle) {
        super(name, age, country, matchesPlayed, jerseyNumber);
        this.totalRuns = totalRuns;
        this.totalWickets = totalWickets;
        this.battingStyle = battingStyle;
        this.bowlingStyle = bowlingStyle;
    }

    @Override
    public void play() {
        System.out.println("Cricket player is batting and bowling.");
    }
}

class FootballPlayer extends Player {
    private int totalGoals;
    private String playingPosition;

    public FootballPlayer(String name, int age, String country,
                          int matchesPlayed, int jerseyNumber,
                          int totalGoals, String playingPosition) {
        super(name, age, country, matchesPlayed, jerseyNumber);
        this.totalGoals = totalGoals;
        this.playingPosition = playingPosition;
    }

    @Override
    public void play() {
        System.out.println("Football player is passing and scoring goals.");
    }
}
