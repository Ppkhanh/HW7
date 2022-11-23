
public class Print implements Visitor {

    @Override
    public void visitCompositeTeam(CompositeTeam CT) {
        int count = CT.getLevel();
        System.out.println();
        while(count>0){
            System.out.print(" ");
            count--;
        }
        System.out.print(CT.getName());

    }

    @Override
    public void visitLeafTeam(LeafTeam LT, int printInfo) {
        System.out.print("\n"+"  > Team: " + LT.getName() + ", ");
        if (printInfo == 1) {
            System.out.print("Number of Athletes: " + LT.getNOA());
        }
        if (printInfo == 2) {
            System.out.print("Number of Gold Medals: " + LT.getNOGM());
        }

    }

}
