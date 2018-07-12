package CompositionDelegation;

public class Composition {
    private ITestable testable ;

    public ITestable getTestable ()
    {
        return testable ;
    }

    public void setTestable ( ITestable testable )
    {
        this.testable = testable ;
    }
}
