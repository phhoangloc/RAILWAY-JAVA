package thisandsuper;

public class SuperClass {
	public void method1(SuperClass this)
    {
        System.out.println("superclass method1");
        this.method2(); // <--- this == mSubClass
    }

    public void method2(SuperClass this)
    {
        System.out.println("superclass method2");
    }
}
