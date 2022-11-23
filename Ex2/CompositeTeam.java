
import java.util.ArrayList;

public class CompositeTeam implements Team {
    private String name;
    private int level;

    public CompositeTeam(String name, int level) {
        this.name = name;
        this.level = level;
    }

    private ArrayList<Team> subTeamList = new ArrayList<Team>();

    public void addTeam(Team t) {
        subTeamList.add(t);
    }

    public void removeTeam(Team t) {
        subTeamList.remove(t);
    }

    public ArrayList<Team> getSubTeamList() {
        return subTeamList;
    }

    @Override
    public void accept(Visitor2 v) {
        v.visitCompositeTeam(this);
        for (Team t : subTeamList) {
            t.accept(v);
        }
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return level;
    }

}
