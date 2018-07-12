package IW2.q2;

public class Main {
    public static void main(String[] args) {

        CompositionOne one = new CompositionOne();
        one.OneA.a();
        one.OneB.b();

        CompositionTwo two = new CompositionTwo();
        two.OneB.b();
        two.OneC.c();

        CompositionThree three = new CompositionThree();
        three.OneA.a();
        three.OneC.c();

    }
}
