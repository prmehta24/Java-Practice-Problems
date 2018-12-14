class Prac9_This
{
    int id;
    String name;
    Prac9_This(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    void display()
    {
        System.out.println(id);
        System.out.println(name);
    }
    public static void main()
    {
        Prac9_This s1 = new Prac9_This(1,"Amit");
        Prac9_This s2 = new Prac9_This(2,"Arya");
        s1.display();
        s2.display();
    }
}
