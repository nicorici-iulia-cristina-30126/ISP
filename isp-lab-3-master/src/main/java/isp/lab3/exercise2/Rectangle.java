package isp.lab3.exercise2;

public class Rectangle {
    private int length = 2, width = 11;
    private String color = "red";
    
    public Rectangle(int l, int w){
        this.length = l;
        this.width = w;
    }
    public Rectangle(int l, int w, String c) {
        this.length = l;
        this.width = w;
        this.color = c;
    }
    
    public int getLength(){
        return this.length;
    }
    public int getWigth(){
        return this.width;
    }
    public String getColor(){
        return this.color;
    }
    public int getPerimeter(){
        int perimeter = 2*(this.length + this.width);
        return perimeter;
    }
    public int getArea(){
        int area = this.length * this.width;
        return area;
    }
    
    public static void main(String[] args){
        Rectangle r = new Rectangle(5,6,"green");
        System.out.println("length:" + r.getLength() + ", wigth:" + r.getWigth() + " and color:" + r.getColor());
        System.out.println("The perimeter of rectangle..." + r.getPerimeter() + " \nThe area of rectangle..." + r.getArea());
    }
}
