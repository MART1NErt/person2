public class driver {
    public static void main(String[] args) {
        person Mykyta = new person("Mykyta","Shportko",16,73,184);
        Dog Max = new Dog("Max",2,"labrador","Yellow");
        Mykyta.x = Max;
        System.out.println(Mykyta.toString());
    }
}
