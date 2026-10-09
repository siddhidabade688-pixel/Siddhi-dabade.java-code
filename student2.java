class info{
    private String name;
    private int marks;
    
void setname(String name){
    this.name=name;
}
void setmarks(int marks){
    this.marks=marks;
}
String getname(){
    return name;
}
int getmarks(){
    return marks;
}
}
public class student2 {
    public static void main(String[] args) {
        info s1=new info();
        s1.setname("xyz");
        s1.setmarks(97);
        System.out.println("Student name:"+s1.getname());
        System.out.println("Student marks:"+s1.getmarks());
    }
}
