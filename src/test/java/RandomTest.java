public class RandomTest {

    String name;
    int age;

    public RandomTest(String name, int age)
    {
        this.name=name;
        this.age=age;

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args){
        RandomTest r = new RandomTest("Hrushikesh", 10);
    }

}


