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

    public void displayPlayer() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
        System.out.println("Matches Played: " + matchesPlayed);
        System.out.println("Jersey Number: " + jerseyNumber);
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

    public void displayCricketPlayer() {
        displayPlayer();
        System.out.println("Total Runs: " + totalRuns);
        System.out.println("Total Wickets: " + totalWickets);
        System.out.println("Batting Style: " + battingStyle);
        System.out.println("Bowling Style: " + bowlingStyle);
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

    public void displayFootballPlayer() {
        displayPlayer();
        System.out.println("Total Goals: " + totalGoals);
        System.out.println("Playing Position: " + playingPosition);
    }
}
