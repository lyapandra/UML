package CompositionDelegation;

public class DelegationA implements ITestable {
    private ITestable testable ;

    public DelegationA ( ITestable testable )
    {
        this.testable = testable ;
    }

    public void test ()
    {
        System.out.println ( "delegating test to: " + testable.getClass () ) ;
        testable.test () ;
    }
}
