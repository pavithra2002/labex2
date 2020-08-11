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
public class bill {
    public static void main(String[] args) {
        ebbill b1=new ebbill(205,"pavi",200,100,"domestic");
        System.out.println(b1.getno());
        System.out.println(b1.getname());
        System.out.println(b1.getpreviousmonthreadings());
        System.out.println(b1.getcurrentmonthreading());
        double total=b1.getpreviousmonthreadings()+b1.getcurrentmonthreading();
        System.out.println(""+total);
        System.out.println(b1.typeofebconnection());
        double amount;
        
        
        if(b1.typeofebconnection()=="domestic")
        {
            if(total<=100)
                amount=total*1;
            else if(total>100&&total<=200)
                amount=100+(total-100)*2.50;
            else if(total>200&&total<=500)
                amount=100+250+(total-200)*4;
            else if(total>500)
                amount=100+250+1200+(total-500)*6;
            else
                amount=0.0;
        
        System.out.println("amount="+amount);
        }
        else
        {
            if(total<=100)
                amount=total*2;
            else if(total>100&&total<=200)
                amount=100+(total-100)*4.50;
            else if(total>200&&total<=500)
                amount=100+250+(total-200)*6;
            else if(total>500)
                amount=100+250+1200+(total-500)*7;
            else
                amount=0.0;
        
        System.out.println("amount="+amount);
        }
            
    }   
                
                
            
            
                  
    }

        
       
                
                
        
    
    

class ebbill
{
    int no;
    String name;
    int pmr;
    int cmr;
    String type;
    ebbill(int n,String namee,int epmr,int ecmr,String t)
    {
        no=n;
        name=namee;
        pmr=epmr;
        cmr=ecmr;
        type=t;
    }
    int getno()
    {
        return no;
    }
    String getname()
    {
        return name;
    }
    int getpreviousmonthreadings()
    {
        return pmr;
    }
    int getcurrentmonthreading()
    {
        return cmr;
    }
    String typeofebconnection()
    {
        return type;
    }
    
    
}