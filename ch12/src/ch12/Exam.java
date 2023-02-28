package ch12;
class Super { 
    int index = 5; 
    public void printVal() {
        System.out.println("Super");
    } 
} 
class Sub extends Super {   
    int index = 2;   
    public void printVal() {   
        System.out.println("Sub"); 
    } 
} 
public class Exam {   
    public static void main(String[ ] args) {   
        Super sup = new Sub();   
        System.out.print(sup.index + " ");   
        sup.printVal(); 
    } 
  }