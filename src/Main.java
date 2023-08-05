public class Main {
    public static void main(String[] args) {

        //new Outer.Inner();

        Outer o1 = new Outer(100);
        o1.display();
        Outer.Inner in11 = o1.new Inner(10);
        in11.display();

        System.out.println();

        Outer o2 = new Outer(200);
        o2.display();
        Outer.Inner in21 = o2.new Inner(20);
        in21.display();

    }
}
