package DZ1;

public class Child extends Parent {
    static {
        System.out.println("DZ1.Child:static 1");
    }

    {
        System.out.println("DZ1.Child:instance 1");
    }

    static {
        System.out.println("DZ1.Child:static 2");
    }

    public Child() {
        super();
        System.out.println("DZ1.Child:constructor");
    }

    public Child(String name) {
        super(name);
        System.out.println("DZ1.Child:name-constructor");
        //System.out.printf("DZ1.Child:%s-constructor", name);
    }

    {
        System.out.println("DZ1.Child:instance 2");
    }
}
