import javax.swing.JFrame;  
import java.util.Scanner; 
import javax.swing.JOptionPane; 

class Users 
{  
     linkList theList = new linkList(); 
     Scanner input = new Scanner(System.in); 
       
       int a = 0;  
       int b = 0;        
       int key,r; 
       Link v,d, f; 
        
public void Users() 
{     

JOptionPane.showMessageDialog (null, "   *~...~*  WELCOME *~...~*\n\n  PHONE DIRECTORY SYSTEM\n\n    For Login Please Click Ok\n\n", " {ELECTRONIC SYSTEM OF PHONE DIRECTORY]", JOptionPane.INFORMATION_MESSAGE); 
 JFrame frame = new JFrame(); 

        int SENTINEL = 123; //password number 
        String str;  //password number which the user will Enter it 
        int password = 0; 
        int counter = 5; 
         
               
while (counter != 0 && password != SENTINEL) 
       {      
        str = JOptionPane.showInputDialog("Enter Password"); 
        
        password = Integer.parseInt(str); 
           
        if(password == SENTINEL) 
        { 
            JOptionPane.showMessageDialog(null, "CORRECT"); 
            System.out.println("\n\t*~...~* The Messages of PHONE DIRECTORY SYSTEM *~...~*\n\n-------------------------------------------------------------------------- \n");         
        } 
        else if(password!=SENTINEL) 
        { 
             JOptionPane.showMessageDialog(null, "Wrong try again"); 
        } 
        counter = counter-1; 
        
        if (counter == 0) 
        { 
            JOptionPane.showMessageDialog(null, "Acces Denied!!! \nPlease contact Helpdesk");       
            System.exit(0); 
        } 
       } 
           String backupDir="" ; 
        
                theList.insertFirst(16, "08120014", "Ms. Fahmeeda Aziz","043258088"); 
                theList.insertFirst(15, "08120014", "Dr. Farhana Shaheen ","043258088"); 
                theList.insertFirst(14, "08120014", "Dr. Fatima Al-Zwaihri ", "043258088"); 
                theList.insertFirst(13, "08120014", "Dr. Tahani Sindi    ", "043258088");  
                theList.insertFirst(12, "08120014", "Dr. Nagla Osman     ", "043935024");  
                theList.insertFirst(11, "08120014", "Ms. Atiya Azmi      ", "043258088");  
                theList.insertFirst(10, "08120014", "Ms. Aisha Al-Johani   ", "043258088"); 
                theList.insertFirst(9, "08120014", "Ms. Siti Haryani Mohd ", "043935024");  
                theList.insertFirst(8,"08120014", "Ms.Humera Ghani     ", "043258088"); 
                theList.insertFirst(7, "08120014", "Ms. Salma Sadiqha    ", "043258088"); 
                theList.insertFirst(6, "08120014", "Ms. Azra Sultana     ", "043935024");  
                theList.insertFirst(5, "08120014", "Ms. Ruchi Tuli     ", "043258088"); 
                theList.insertFirst(4, "08120014", "Ms. Fozia Noor   ", "043258088"); 
                theList.insertFirst(3, "08120014", "Ms. Kajal nusratullah  ", "043258088"); 
                theList.insertFirst(2, "08120014", "Ms.Anusuyah Subbarao  ", "043935024"); 
                theList.insertFirst(1, "08120014", "Ms. Aizal Yusrina ", "043258088"); 
} 

public void mainUser(int ConvOption1,String Option1) 
{ 
while(ConvOption1!=6) 
    { 
       switch (ConvOption1) // 5 cases 
       { 
       case 1: { 
               theList.displayList(); 
               System.out.println("---------------------------------------------------------------------------\n"); 
              } 
       break; 
        
       case 2: { 
            
           //  Option1 = JOptionPane.showInputDialog("Enter how MANY TEACHERS U WANT TO FIND"); 
      //        a = Integer.parseInt(Option1); 
                     
    System.out.println("Enter how MANY TEACHERS U WANT TO FIND"); 
            a=input.nextInt(); 
                
              //theList. display1() ; 
               for(int j=1;j<=a;j++) 
               { 
                    
           //        Option1 = JOptionPane.showInputDialog("\nEnter Number of Teacher Room   оо "+j+" оо "); 
           //     b = Integer.parseInt(Option1); 
                   
             System.out.println("\nEnter Number of Teacher Room   оо "+j+" оо "); 
               b=input.nextInt(); 
                 
               f = theList.find( b);  
                        // find item 
               if( f != null) 
               { 
                
            System.out.println("\nTEACHER NAME IS: "+f.Teacher_Name+"\nTEACHER ID: "+f.teacher_ID+"\nPHONE NUMBER IS: "+f.Phone_number); 
                
             //  JOptionPane.showMessageDialog(null,"\nTEACHER NAME IS: "+f.Items+"\nTEACHER ID: "+f.qui+"\nPHONE NUMBER IS: "+f.price); 
                  
                // System.out.println("\nQuintity of "+f.Items+" Now is "+e); 
                  
                 } 
               else 
               { 
               System.out.println("we did FOUND "+f.Teacher_Name);   
                }  
                } 
                
              // System.out.println("\n рр price ="+t); 
                 
              System.out.println("---------------------------------------------------------------------------\n"); 
            } 
      break; 
       
      case 3: { 
           
          System.out.println("Enter THE ROOM NUMBER OF TEACHER  "); 
          int key=input.nextInt(); 
          Link i = theList.delete(key);        // delete item 
          if( i != null ) 
          { 
           
           System.out.println("Deleted NUMBER OF ROOM : "+  i.Room_Number+"\n"); 
           System.out.println("Delet the ID :  "+i.teacher_ID +"\n"); 
           System.out.println("Delet the Name Of TEACHER : "+ i.Teacher_Name+"\n" ); 
           System.out.println("Delet the PHONE NUMBER :  "+i.Phone_number+"\n"); 
           
           
          System.out.println("SUCCESSFUL DELET"); 
          }  
          else 
          { 
           
          System.out.println("Can't delete "); 
           
          System.out.println("the data still in list "+i); 
          } 
          System.out.print("---------------------------------------------------------------------------\n"); 
             }  
          break; 
        
       case 4: { 
              theList.display2(); 
              System.out.println("Enter ROOM NUMBER:>"); 
              key= input.nextInt(); 
              Link i = theList.delete(key);   
              System.out.print("---------------------------------------------------------------------------"); 
               
              System.out.println("\nlist after EDIT:>"); 
              theList.display2(); 
              System.out.println("---------------------------------------------------------------------------\n"); 
             } 
        break; 
           
   }//end switch 
    
    if(ConvOption1>6) 
    { 
     
     JOptionPane.showMessageDialog(null, "YOUAR INPUT NUMBER NOT IN THE LIST\n              PLEASE, TRY AGAIN");        
    } 
     Option1 = JOptionPane.showInputDialog("\n1-Show List of TEACHERS\n2-SEARCH \n3-Remove \n4-Borrow\n5-Return\n6-Exit"); 
     ConvOption1 = Integer.parseInt(Option1); 
    }//end while 
   } 
}//end mainUser methods