public class Main 
{  
    public static void main(String[] args) 
    {  
            //outer loop  
            for(int i=1;i<=3;i++)
            {    
                    //inner loop  
                    for(int j=1;j<=3;j++)
                    {    
                        if(i==j)
                        {    
                            //using continue statement inside inner loop  
                            continue;    
                        }    
                        //Print the elements
                        System.out.println(i+" "+j);    
                    }    
            }    
    }  
}  

