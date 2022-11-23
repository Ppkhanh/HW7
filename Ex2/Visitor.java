
public interface Visitor {
    public void visitCompositeTeam(CompositeTeam CT);
    public void visitLeafTeam(LeafTeam LT, int printInfo);
    public void VisitElectronic(Electronic electronic);
    public void VisitFurniture(Furniture furniture);
    public void VisitGlass(Glass glass);
}
