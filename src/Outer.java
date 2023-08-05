public class Outer {
    private int out;

    public Outer(int out) {
        this.out = out;
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }

    public void display() {
        System.out.println("out = " + out);
    }

    public class Inner {
        private int in;

        public Inner(int in) {
            this.in = in;
        }

        public int getIn() {
            return in;
        }

        public void setIn(int in) {
            this.in = in;
        }

        public void display() {
            System.out.println("in = " + in + " out = " + out);
            Outer.this.display();
        }
    }
}


//Inner is a class
//Inner is non-static member of Outer
//Inner class will have existence as part of outer class object
//Inner class object will be holding a reference to outer class object, that is why inner class can access the members of outer class object
//However outer class object will not be holding reference to inner class object

//inner class functions will receive two this, one which refers to inner class object, and other one which refers to outer class object
