package DZ1;

abstract class Parent {
    private String name;

    static {
        System.out.println("DZ1.Parent:static 1");
    }

    {
        System.out.println("DZ1.Parent:instance 1");
    }

    static {
        System.out.println("DZ1.Parent:static 2");
    }

    public Parent() {
        System.out.println("DZ1.Parent:constructor");
    }

    {
        System.out.println("DZ1.Parent:instance 2");
    }

    public Parent(String name) {
        this.name = name;
        System.out.println("DZ1.Parent:name-constructor");
        //System.out.printf("DZ1.Parent:%s-constructor", name);
    }
}
