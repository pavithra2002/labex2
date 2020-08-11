/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprogramsstart;


/**
 *
 * @author PAVITHRA T
 */
    public class employee {
    
    
    
     
    
    public static void main(String[] args) {
   
     
    employe e1=new employe(100,"pavi","thara",10000);
    System.out.println(e1.getid());
    System.out.println(e1.getfirstname());
    System.out.println(e1.getlastname());
    System.out.println(e1.getfullname());
    System.out.println(e1.getsalary());
    e1.setsalary(15000);
    System.out.println(e1.getsalary());
    System.out.println(e1.getannualsalary());
    System.out.println(e1);
    
       }
    }
    
    class employe
    {
        int id;
        String firstname;
        String lastname;
        int salary;
        employe(int i,String fn,String ln,int s)
        {
            id=i;
            firstname=fn;
            lastname=ln;
            salary=s;
            
        }
        int getid()
        {
            return id;
        }
        String getfirstname()
        {
            return firstname;
        }
        String getlastname()
        {
           return lastname;
        }
        String getfullname()
        {
            return (""+firstname+ ""+lastname);
        }
        int getsalary()
        {
           return salary;
        }
        void setsalary(int s1)
        {
            salary=s1;
        }
        int getannualsalary()
        {
            return salary*12;
        }
        int raisesalary(int p1)
        {
            return(salary*p1)/100+salary;
        }
        
    }
    
    
    
    
                
    
    
    
    
