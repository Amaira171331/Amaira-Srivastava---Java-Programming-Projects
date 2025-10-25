class result
{
    public static void main()
    {
        double x=0;
        while (x<=100.0)
        {
            double y = x*(3.0/x);
            if ((y==3.0)==false)
            {
                System.out.println(x+" False "+y);
            }
            else
            {
                System.out.println(x+" True "+y);
            }
            x=x+0.1;
        }
    }
}