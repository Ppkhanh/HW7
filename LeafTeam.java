public class LeafTeam implements Team {
    private String name;
    private int noOfAthletes;
    private int noOfGoldmedals;
    public int numberOf;

    public LeafTeam(String name, int noOfAthletes, int noOfGoldmedals, int numberOf){
        this.name = name;
        this.noOfAthletes = noOfAthletes;
        this.noOfGoldmedals = noOfGoldmedals;
        this.numberOf = numberOf;
    }
    public String getName(){
        return this.name;
    }
    public int getNOA(){
        return this.noOfAthletes;
    }
    public int getNOGM(){
        return this.noOfGoldmedals;
    }
    @Override
    public void accept(Visitor v) {
      v.visitLeafTeam(this, numberOf);
    }
}
