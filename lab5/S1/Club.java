public class Club {
    private String name;
    private int wins;
    private int draws;
    private int losses;
    public Club() {
        this.name = "";
        this.wins = 0;
        this.draws = 0;
        this.losses = 0;
    }
    public Club(String name, int wins, int draws, int losses) {
        this.name = name;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
    } 
    public Club(Club club) {
        this.name = club.name;
        this.wins = club.wins;
        this.draws = club.draws;
        this.losses = club.losses;
    }
    public String getName() {
        return this.name;
    }
    public int getWins() {
        return this.wins;
    }
    public int getDraws() {
        return this.draws;
    }
    public int getLosses() {
        return this.losses;
    }
    public void setName() {
        name = this.name;
    }
    public void setWins() {
        wins = this.wins;
    }
    public void setDraws() {
        draws = this.draws;
    }
    public void setLosses() {
        losses = this.losses;
    }
    public int numMatchesPlayer() {
        int num = this.wins + this.draws + this.losses;
        return num;
    }
    public boolean isFinish() {
        if(numMatchesPlayer()==10) return true;
        return false;
    }
    public int getPoints() {
        int p = this.wins*3 + this.draws*1;
        return p;
    }
    public String toString() {
        return "Club "+this.name+": "+this.wins+"/"+this.draws+"/"+this.losses;
    }
}