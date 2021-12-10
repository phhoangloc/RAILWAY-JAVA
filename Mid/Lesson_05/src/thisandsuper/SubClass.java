package thisandsuper;

public class SubClass extends SuperClass {
	 @Override
	    public void method1(SubClass this)
	    {
	        System.out.println("subclass method1");
	        super.method1();
	    }

	    @Override
	    public void method2(SubClass this)
	    {
	        System.out.println("subclass method2");
	    }
}
