public class Main {
    public static void main(String[] args) {

        //new Outer.Inner();

        Outer o1 = new Outer(100);
        Outer.Inner in11 = o1.new Inner(10);

        Outer o2 = new Outer(200);
        Outer.Inner in21 = o2.new Inner(20);

    }
}
