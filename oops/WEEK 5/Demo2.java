//b. Example for super keyword
class Animal
{
    String Sound = "Bark";
}
class Dog extends Animal
{
    String Sound = "Bark Bark";
    void display()
    {
        System.out.println("Dog will "+super.Sound);
    }
}
class Demo2
{
    public static void main(String[] args)
    {
        Dog D = new Dog();
        D.display();
    }
}