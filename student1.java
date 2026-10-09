class student{
    private String name;
    private int marks1;
    private int marks2;


void setname(String name){
    this.name=name;
}
void setmarks1(int marks1){
    if(marks1>=0 && marks1<=100){
        this.marks1=marks1;
    }else{
        System.out.println("Invalid marks: "+marks1);
    }
}
void setmarks2(int marks2){
    if(marks2>=0 && marks2<=100){
        this.marks2=marks2;
    }else{
        System.out.println("Invalid marks: "+marks2);
    }
    
}
      String getname(){
      return name;
      }
      int getmarks1(){
        return marks1;
      }
      int getmarks2(){
        
        return marks2;
      }
}
public class student1{
    public static void main(String[] args){
        student s1=new student();
        s1.setname("XYZ");
        s1.setmarks1(98);
        s1.setmarks2(679);
        System.out.println("Student name:"+s1.getname());
        System.out.println("Marks: "+s1.getmarks1());
        System.out.println("Marks: "+s1.getmarks2());
    }
}
