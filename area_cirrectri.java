import java.util.*;
import java.io.*;
import java.lang.Math;
class area_cirrectri
{
    public static float circle(float rad)
    {
        float area_cir=(float)(3.14*rad*rad);
        return area_cir;
    }
    
    public static float rectangle(float width,float height)
    {
        float area_rec=width*height;
        return area_rec;
    }
    
    static public float triangle(float breadth,float height)
    {
        float area_tri=(float)(0.5*breadth*height);
        return area_tri;
    }
    
    static public void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Area of Circle:");
        float circ;
        float c_rad=s.nextFloat();
        System.out.println(circle(c_rad));
        
        System.out.println("Area of Rectangle:");
        float rec_wid=s.nextFloat();
        float rec_het=s.nextFloat();
        float rect;
        System.out.println(rectangle(rec_wid,rec_het));
        
        System.out.println("Area of Triangle:");
        float tri_bre=s.nextFloat();
        float tri_het=s.nextFloat();
        float tri;
        System.out.println(triangle(tri_bre,tri_het));
    }
}
