class Test {  
  
   private double radius;
   public Test() 
   {  
      radius = 1.0;
      
   }
   public Test(double r) { 
      radius = r;
      
   }
   public double getArea() 
   {
      return radius*radius*3.14;
   }
   public double getPerimeter()
   {
      return 2*radius*3.14;
   }
}
class Pr1
{
    public static void main(String[] args)
    {
        Test t=new Test(3);
        double ans,ans1;
        ans=t.getArea( );
        ans1=t.getPerimeter();
        System.out.println(ans);
        System.out.println(ans1);
    }
}