/*
 * Binita Shah
 * Student ID: 991549124
 * 
 */
package week1fosd;

public class StudentArray {
    public static void main(String[] args) {
        StudentDetails[]list=new StudentDetails[3]; //array of object
        StudentDetails s1 = new StudentDetails();
        s1.setName("bini");
        s1.setSid(234);
        StudentDetails s2 = new StudentDetails();
          s2.setName("kaushil");
        s2.setSid(456);
        StudentDetails s3 = new StudentDetails();
          s3.setName("miki");
        s3.setSid(678);
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0; i<list.length;i++){
        System.out.println(list[i].getName()+" "+list[i].getSid());
        } 
        
    }
    
}
