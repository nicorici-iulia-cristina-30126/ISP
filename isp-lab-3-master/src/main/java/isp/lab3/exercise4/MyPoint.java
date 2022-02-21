package isp.lab3.exercise4;

import static java.lang.Math.sqrt;

public class MyPoint {
    public int x, y, z;
    
    public MyPoint(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setZ(int z) {
        this.z = z;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getZ(){
        return this.z;
    }
    public void setXYZ(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String toString(){
       return " " + this.x + "" + ", " + this.y + "" + ", " + this.z + "" + ")";
    }
    public double distance(int x, int y, int z){
        double d = sqrt(Math.pow(x-this.x, 2) + Math.pow(y - this.y, 2) + Math.pow(z - this.z, 2));
        return d;
    }
    public double distance(MyPoint point){
        double d =  sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2) + Math.pow(point.z - this.z, 2));
        return d;
    }
    
    public static void main(String[] args){
        MyPoint p1 = new MyPoint(7, 4, 3);
        MyPoint p2 = new MyPoint();
        p2.setXYZ(17, 6, 2);
        double d1 = p1.distance(17, 6, 2);
        double d = p1.distance(p2);
        System.out.println("1)Distance beetwen two points: " + d1);
        System.out.println("2)Distance beetwen two points: " + d);
    }
    
}
