
public class Implementation {
    public static void main(String[] args) {
        Visitor2 v = new Print();

        // a: Germany Team
        System.out.println("Exercise a)");
        CompositeTeam GermanyMen = new CompositeTeam("Germany's Men", 3);
        LeafTeam MenTT = new LeafTeam("Table Tennis", 31, 21, 1);
        LeafTeam MenFootball = new LeafTeam("Football", 40, 1, 1);
        GermanyMen.addTeam(MenTT);
        GermanyMen.addTeam(MenFootball);
        GermanyMen.accept(v);
        // b
        System.out.println("\nExercise b)");
        CompositeTeam Germany = new CompositeTeam("Germany", 2);
        CompositeTeam GermanyWomen = new CompositeTeam("Germany's Women", 3);
        Germany.addTeam(GermanyMen);
        Germany.addTeam(GermanyWomen);
        LeafTeam WomCycling = new LeafTeam("Cycling", 50, 3, 2);
        LeafTeam WomTennis = new LeafTeam("Tennis", 25, 3, 2);
        GermanyWomen.addTeam(WomCycling);
        GermanyWomen.addTeam(WomTennis);
        Germany.accept(v);

        // c: Asia Team
        System.out.println("\nExercise c)");
        CompositeTeam Asia = new CompositeTeam("Asia", 1);
        CompositeTeam China = new CompositeTeam("China", 2);
        CompositeTeam Chinwomen = new CompositeTeam("China's Women", 3);
        CompositeTeam ChinMen = new CompositeTeam("China's Men", 3);
        Asia.addTeam(China);
        China.addTeam(Chinwomen);
        China.addTeam(ChinMen);
        LeafTeam Taekkwondo = new LeafTeam("Taekwondo", 26, 10, 2);
        LeafTeam Waterpolo = new LeafTeam("Waterpol0", 12, 0, 2);
        LeafTeam AG = new LeafTeam("Artistic Gymnastics", 21, 0, 2);
        LeafTeam Shooting = new LeafTeam("Shooting", 15, 3, 2);

        Chinwomen.addTeam(Taekkwondo);
        Chinwomen.addTeam(Waterpolo);
        Chinwomen.addTeam(AG);
        ChinMen.addTeam(Shooting);
        Asia.accept(v);
        // d
        System.out.println("\nExercise d)");
        CompositeTeam Olympics = new CompositeTeam("Olympics 2014", 0);

        CompositeTeam Africa = new CompositeTeam("Africa", 1);
        CompositeTeam Europe = new CompositeTeam("Europe", 1);
        CompositeTeam SA = new CompositeTeam("South America", 1);
        CompositeTeam Afgha = new CompositeTeam("Afghanistan", 2);
        CompositeTeam Italy = new CompositeTeam("Italy", 2);
        Olympics.addTeam(Asia);
        Olympics.addTeam(Africa);
        Olympics.addTeam(Europe);

        Olympics.addTeam(SA);
        Europe.addTeam(Germany);
        Europe.addTeam(Italy);

        Asia.addTeam(Afgha);
        Olympics.accept(v);

    }
}
