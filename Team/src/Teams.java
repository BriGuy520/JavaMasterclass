interface Player{}

record BaseballPlayer(String name, String position) implements Player {}

record FootballPlayer(String name, String position) implements Player {}


public class Teams {
    public static void main(String[] args) throws Exception {

        BaseballTeam cubs1 = new BaseballTeam("Chicago Cubs");
        BaseballTeam whiteSox1 = new BaseballTeam("Chicago White Sox");

        scoreResult(cubs1, 11, whiteSox1, 2);

        SportsTeam cubs2 = new SportsTeam("Chicago Cubs");
        SportsTeam whiteSox2 = new SportsTeam("Chicago White Sox");

        scoreResult(cubs2, 11, whiteSox2, 2);

        Team<BaseballPlayer> cubs = new Team<>("Chicago Cubs");
        Team<BaseballPlayer> whiteSox = new Team<>("Chicago White Sox");

        scoreResult(cubs, 11, whiteSox, 2);

        var bellinger = new BaseballPlayer("C Bellinger", "Right Field");
        var hoerner = new BaseballPlayer("N Hoerner", "Shortstop");

        cubs.addTeamMember(bellinger);
        cubs.addTeamMember(hoerner);
        cubs.listTeamMembers();

        SportsTeam bears1 = new SportsTeam("Chicago Bears");
        Team<FootballPlayer> bears = new Team<>("Chicago Bears");

        var fields = new FootballPlayer("J Fields", "Quarterback");
        var moore = new FootballPlayer("D Moore", "Wide Reciever");

        bears.addTeamMember(fields);
        bears.listTeamMembers();

        var happ = new BaseballPlayer("I Happ", "Left Field");

        bears.addTeamMember(moore);

        cubs.addTeamMember(happ);
    }

    public static void scoreResult(BaseballTeam team1, int score1, BaseballTeam team2, int score2){

        String message = team1.setScore(score1, score2);
        team2.setScore(score2, score1);

        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int score1, SportsTeam team2, int score2){

        String message = team1.setScore(score1, score2);
        team2.setScore(score2, score1);

        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int score1, Team team2, int score2){

        String message = team1.setScore(score1, score2);
        team2.setScore(score2, score1);

        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
