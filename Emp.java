import java.util.Scanner;
public class Emp {
public static Scanner ent;
String perk;
String work;
String resp;
String role;
String name;
public Emp(String nm,String pk,String wk,String rsp,String rl) {
	perk=pk;
	work=wk;
	resp=rsp;
	role=rl;
	name=nm;
}

public static void  main(String[] args) {
	ent=new Scanner(System.in);
	for(byte j=0;j<20;j++) {
		System.out.println("\n\t   Welcome to Our Software Solution Ltd.\n\t\tEnter Any Option To Go On\n\n\t\t 1.Search Any\t2.Exit");
			byte k=ent.nextByte();
			switch(k) {
			case 1:{
			System.out.println(" \n\t\tTo know About Our Emplyees\n\t     Please Enter Any Name Given Below\n\n\nMr.Ravi Lokhande\nMr.Dharmendra Pathak\nMr.Keshav Mahiwal\nMr.Vikash Yadav\nMr.Mayank Kumar\nMr.Abhay Singh\nMr.Mohd Mehtab\nMr.Lokesh Bohra\n\n\t!!!Warining!!! :- \nUse Underscores(_) for Spaces\nPrifiexes like Mr./Mrs. is not valid.\n\nYour Query : ");
	String str=ent.next();
	Emp emp[]=new Emp[8];
	emp[0]= new Emp("Ravi_Lokhande","Rs.4000","He writes all the program\nHe manages all the required data etc.","Program Planning,Explaining,Designing,Coding,Error Handlling etc.","Software_Engineers");
	emp[1]= new Emp("Dharmendra_Pathak","Rs.5500","He solves all complicated jobs.\nHe Guides Jr.Programmer etc.","Program Planning,Error Handlling etc.","Sr.Software_Engineers");
	emp[2]= new Emp("Keshav_Mahiwal","Rs.3000","He makes complex jobs into small Modules.","Program Coding,Error Handling etc.","Module_Lead");
	emp[3]= new Emp("Vikash_Yadav","Rs.4500","He provides technical supports to programmer.","Avails resources","Technical_Lead");
	emp[4]= new Emp("Mayank_Kumar","Rs.5500","He checks all programmers and their programming codes and consults to Senior person.","Manages resources,Handles all probblems at low level","Project_Lead");
	emp[5]= new Emp("Abhay_Singh","Rs.6500","He Distributes and manages all the projects into programs to whole team.","Manages everything related to a project,Consumer Satisfaction,Managing Employees etc.","Project_Manager");
	emp[6]= new Emp("Mohd_Mehtab","Rs.7000","He manages all kind of services,informations from Senior Persons etc.","Condition Handling,Resources availing,Managing Employees etc.","Program_Manager");
	emp[7]= new Emp("Lokesh_Bohra","Rs.8000","He manages all the requirments,resouces,and consumers etc.","Tendors,Paying Salary,Connsumer Satifaction etc.","Directors");
	for(int i=0;i<8;i++) {
		if(str.equalsIgnoreCase(emp[i].name))
		System.out.println("Entered Name is: "+emp[i].name+"\nDesignation is: "+emp[i].role+"\nPayable Perk is : "+emp[i].perk+"\nWorks are as given below:\n"+emp[i].work+"\nResponsibilities are given below:\n"+emp[i].resp);
		}
			}
	break;
	case 2:
		{
		System.exit(k);
			}
		break;
		default:
			System.out.print("\t\tPlease enter any Correct Value \n");
}}}
		}