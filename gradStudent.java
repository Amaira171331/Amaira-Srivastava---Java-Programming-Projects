class student
{
    private String name;
    private int tests[];
    private String grade;
    student()
    {
       name="";
        tests=new int[3];
        grade="";
    }
    student(String name1, int[] tests1, String grade1)
    {
        name=name1;
        tests=new int[3];
        int i=0;
        for (i=0;i<=2;i++)
        {
            tests[i]=tests1[i];
        }
        grade=grade1;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(tests[0]);
        System.out.println(tests[1]);
        System.out.println(tests[2]);
        System.out.println(grade);
    }
    public static void main()
    {
        int marks[]={80,90,100};
        student studentobj=new student("Amaira",marks,"A");
        student studentobj1=new student();
        studentobj.display();
        studentobj1.display();
    }
}
class gradStudent extends student
{
    private int gradID;
    public gradStudent()
    {
        super();
        gradID=0;
    }
    public gradStudent(String name1, int[] tests1, String grade1, int gradID1)
    {
        super(name1,tests1,grade1);
        gradID=gradID1;
        
    }
    void display()
    {
        super.display();
        System.out.println(gradID);
    }
     public static void main()
    {
        int marks[]={80,90,100};
        gradStudent gradobj=new gradStudent("Amaria",marks,"A",10389);
        gradStudent gradobj1=new gradStudent();
        gradobj.display();
        gradobj1.display();
    }
}