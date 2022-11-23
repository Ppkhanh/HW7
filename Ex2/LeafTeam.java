
public class LeafTeam implements Team {
    private String name;
    private int noOfAthletes;
    private int noOfGoldmedals;
    public int printInfo;

    public LeafTeam(String name, int noOfAthletes, int noOfGoldmedals, int printInfo){
        this.name = name;
        this.noOfAthletes = noOfAthletes;
        this.noOfGoldmedals = noOfGoldmedals;
        this.printInfo = printInfo;
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
    public void accept(Visitor2 v) {
      v.visitLeafTeam(this, printInfo);
    }
}
