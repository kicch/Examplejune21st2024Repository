package Com.PackageSG.Testing.Assignmnet;
class University{
    String University_name;
    String University_Type;
    int University_student_count;
    University(String University_name,String University_Type,int University_student_count){
        this.University_name=University_name;
        this.University_Type=University_Type;
        this.University_student_count=University_student_count;
        System.out.println("University name="+University_name);
        System.out.println("University Type="+University_Type);
        System.out.println("University student_count="+University_student_count);
        System.out.println();
    }
    void Disp(){
        System.out.println("University name="+University_name);
        System.out.println("University Type="+University_Type);
        System.out.println("University student_count="+University_student_count);
        System.out.println();
    }
}
class College {
    String College_name;
    String College_Type;
    int College_student_count;
        College(String College_name, String College_Type, int College_student_count) {
        this.College_name = College_name;
        this.College_Type = College_Type;
        this.College_student_count = College_student_count;
        System.out.println("College_name=" + College_name);
        System.out.println("College_Type=" + College_Type);
        System.out.println("College_student_count=" + College_student_count);
        System.out.println();
    }

    void Display() {
        System.out.println("College_name=" + College_name);
        System.out.println("College_Type=" + College_Type);
        System.out.println("College_student_count=" + College_student_count);
        System.out.println();
    }
}
 class Students{
     String STD_name;
     int STD_count;String STD_Type;
     Students(String STD_name,String STD_Type,int STD_count){
        this.STD_name=STD_name;
        this.STD_Type=STD_Type;
        this.STD_count=STD_count;
         System.out.println("STD Name="+STD_name);
         System.out.println("STD TYPE="+STD_Type);
         System.out.println("STD_count="+STD_count);
         System.out.println();

     }
    void disp2(){
        System.out.println("STD Name="+STD_name);
        System.out.println("STD TYPE="+STD_Type);
        System.out.println("STD_count="+STD_count);
        System.out.println();

    }
 }
    public class Education {
        public static void main(String[] args) {
            University K = new University("KCD", "Science", 10000);
            K.Disp();
            College k2= new College("LVD","Arts",9999);
            k2.Display();
            Students k3= new Students("Ankith","arts",21);
            k3.disp2();
        }
    }