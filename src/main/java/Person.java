public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
        System.out.println("Initialized person.");
        System.out.println(this);
    }


    public String getName() {
        return name;
    }


}
