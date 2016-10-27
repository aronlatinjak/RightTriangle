package righttriangletester;

public class RightTriangle 
{
    private double base, height;
    
    public RightTriangle()
    {
        base = 1;
        height = 1;
    }
    public RightTriangle(double x, double y)
    {
        base = x;
        height = y;
    }
    
    public void setBase(double x)
    {
        base = x;             
    }
    public double getBase()
    {
        return(base);
    }
    public void setHeight(double x)
    {
        height = x;             
    }
    public double getHeight()
    {
        return(height);
    }
    public double calculateArea()
    {
        double area = (base * height)/2;
        return(area);
    }
}