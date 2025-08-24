package Inheritance;

public class Test {
    public static void main(String[]  args){
        Cat cat = new Cat();
        cat.breed = "White gini";
        System.out.println(cat.breed);
        cat.name="CAT - Tony";
        System.out.println(cat.name);
        TestTwo.main(args);
        cat.breedSound();
    }
}
