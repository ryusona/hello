package inheritance;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class InheritanceTest {
    public static void main (String args[]){

        Child c = new Child();
        Parent d = new Child(); // is - a 관계가 성립 되기 때문에 가능한 이야기임

        d.smoke();

    }
}

