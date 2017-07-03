package co.com.oca.java.chapter1.gc;

/**
 * There are no instances of M to be garbage collected till the program ends.
 *
 * @author Jonathan Fernandez <jonathan.fvargas@gmail.com>
 */
class M {
}

class N {

    private M m = new M();

    public void makeItNull( M pM ) {
        System.out.println("2 " + this.m);
        pM = null;
        System.out.println("2 " + this.m);
    }

    public void makeThisNull() {
        System.out.println("1 " + this.m);
        makeItNull(m);
        System.out.println("1 " + this.m);
    }

    public static void main(String[] args) {
        N n = new N();
        n.makeThisNull();
    }
}
