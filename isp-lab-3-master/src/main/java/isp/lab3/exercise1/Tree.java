package isp.lab3.exercise1;

public class Tree {
    public int height;
    
    public Tree(){
        this.height = 15;
    }
    public void Grow(int meters){
        if(meters >= 1){
             this.height = this.height + meters;
        }
    }
    public String ToString(){
        return this.height+"";
    }
    
    public static void main(String[] args){
        Tree a = new Tree();
        a.Grow(10);
        System.out.println("The height is: " + a.height);
        String m = a.ToString();
        System.out.println("String height = " + m);
    }
}
