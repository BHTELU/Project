package com.cg.payroll.main;
import java.util.Scanner;
import com.cg.payroll.dto.BankDetails;
import com.cg.payroll.dto.Employee;
import com.cg.payroll.dto.Salary;

 

 

 

public class MainClass 
{
    public static void main(String []args)
    {
       int EID;
      
        Scanner sc = new Scanner(System.in);
        System.out.println("enter emp.Id: ");   
        EID=sc.nextInt();
       
          if(EID==114320)        
        {
               Employee emp=new Employee(114320,4000,"nandu","venkat","FS","SA", "abcd6543","nandu123@gmail.com");
               System.out.println("employee Id: "+" "+emp.getId() );
               System.out.println("employee name:"+" "+emp.getFirstName()+" "+emp.getLastName() );
                  System.out.println("department: "+" "+emp.getDepartment() );
               System.out.println("designation: "+" "+emp.getDesignation());              
             System.out.println("pancard no: "+" "+emp.getPanCard());
             System.out.println("email id: "+" "+emp.getEmailId()); 
             
             Salary sal=new Salary(17000,3000,2000,4000,1500,100,50,1500,1500);
             System.out.println("basic salary: "+" "+sal.getBasicSalary());
             System.out.println("Hra: "+" "+sal.getHra());
             System.out.println("CA: "+" "+sal.getConveyenceAllowance());
             System.out.println("OA: "+" "+sal.getOtherAllowance());
             System.out.println("PA: "+" "+sal.getPersonalAllowance());
             System.out.println("MT: "+" "+sal.getMonthlyTax());
             System.out.println("Epf: "+" "+sal.getEpf());
             System.out.println("Cpf: "+" "+sal.getCpf());
             System.out.println("NetSalary: "+" "+sal.getNetSalary());
             
             BankDetails bd=new BankDetails(987654,"idfcbank","ifsc321");
             System.out.println("AC no: "+" "+bd.getAccountNumber());
             System.out.println("BankName: "+" "+bd.getBankName());
             System.out.println("IfscCode: "+" "+bd.getIfscCode());
             
         
        }
         else if(EID==114321)
         {
                
             Employee emp1=new Employee(114451,5000,"arun","devi","FS","SA","mnop1234","devi345@gmail.com");
             System.out.println("employee Id: "+" "+emp1.getId() );
               System.out.println("employee name:"+" "+emp1.getFirstName()+" "+emp1.getLastName() );
                  System.out.println("department: "+" "+emp1.getDepartment() );
               System.out.println("designation: "+" "+emp1.getDesignation());              
             System.out.println("pancard no: "+" "+emp1.getPanCard());
             System.out.println("email id: "+" "+emp1.getEmailId());
             
             Salary sal1=new Salary(17000,3000,2000,4000,1500,100,50,1500,1500);
            System.out.println("basic salary: "+" "+sal1.getBasicSalary());
           System.out.println("Hra: "+" "+sal1.getHra());
           System.out.println("CA: "+" "+sal1.getConveyenceAllowance());
           System.out.println("OA: "+" "+sal1.getOtherAllowance());
           System.out.println("PA: "+" "+sal1.getPersonalAllowance());
           System.out.println("MT: "+" "+sal1.getMonthlyTax());
           System.out.println("Epf: "+" "+sal1.getEpf());
           System.out.println("Cpf: "+" "+sal1.getCpf());
           System.out.println("NetSalary: "+" "+sal1.getNetSalary());
          
             
             BankDetails bd1=new BankDetails(2345678,"kotakbank","ifsc123");
            System.out.println("AC no: "+" "+bd1.getAccountNumber());
           System.out.println("BankName: "+" "+bd1.getBankName());
           System.out.println("IfscCode: "+" "+bd1.getIfscCode());
          
         }         
         else
         {
             System.out.println("your ID is wrong");
         }
       
    }
}
