import java.util.Scanner;

public class LList {

    private int no;
    private String name;
    private String surName;
    int vise;
    int fin;
    double avarage;
    String situation;

    StudentNode temp=null;
    StudentNode temp2=null;
    StudentNode head=null;
    StudentNode tail=null;

    Scanner sc =new Scanner(System.in);

    public void add(){
        System.out.println("No of student: ");
        no=sc.nextInt();
        sc.nextLine();
        System.out.println("Name of student: ");
        name=sc.nextLine();
        System.out.println("Surname of student: ");
        surName=sc.nextLine();
        System.out.println("Vise of student: ");
        vise=sc.nextInt();
        System.out.println("Final of student: ");
        fin=sc.nextInt();

        StudentNode student = new StudentNode(no,name,surName,vise,fin);

        if(head==null){
            head=student;
            tail=student;
        }
        else{
            student.next=head;
            head=student;
        }
    }

    public void dlt(){
        if(head==null)
            System.out.println("There is no student in the list...");
        else{
            System.out.println("No of student that you want to delete: ");
            no=sc.nextInt();
            if(no==head.getNo() && head.next==null){
                head=null;
                tail=null;
            }
            else if(no==head.getNo() && head.next!=null){
                head.next=head;
            }
            else{
                temp=head;
                temp2=head;
                while(temp.next!=null){
                    if(temp.getNo()==no){
                        temp2.next=temp.next;
                        System.out.println("Student has been deleted...");
                    }
                    temp2=temp;
                    temp=temp.next;
                }
                if(temp.getNo()==no){
                    temp2.next=null;
                    tail=temp2;
                    System.out.println("Student has been deleted...");
                }
            }
        }
    }

    public void print(){
        if(head==null){
            System.out.println("There is no student in the list...");
        }
        else{
            temp=head;
            while (temp!=null){
                System.out.println("Information of student number: "+temp.getNo());
                System.out.println("***************************************");
                System.out.println("Name    : "+temp.getName());
                System.out.println("Surname : "+temp.getSurName());
                System.out.println("***************************************");
                temp=temp.next;
            }
        }
    }

    public void mostSuccesful(){
        temp=head;
        double a = temp.getAvarage();
        while(temp!=null){
            if(a<temp.getAvarage()){
                a = temp.getAvarage();
                no=temp.getNo();
                name=temp.getName();
                surName=temp.getSurName();
            }
            temp=temp.next;
        }
        System.out.println("Information of most succesfull student: ");
        System.out.println("***************************************");
        System.out.println("No      : "+no);
        System.out.println("Name    : "+name);
        System.out.println("Surname : "+surName);
        System.out.println("***************************************");
    }
}
