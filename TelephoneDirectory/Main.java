import java.util.*; 
import java.util.Scanner; 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

//--------------------------------------------------------------------------------------Class Main 
public class Main extends JFrame  
{ 
         final Users theUser = new Users(); 
           
//------------------------------------------------------------------------------------1--Method main   
public static void main(String[] args) 
  {  
        new Main().setVisible(true);//call method Main    
  }//end public static void main 

//-----------------------------------------------------------------------------------2--Mathod Main 
  public Main()  
  { 
         theUser.Users(); 
         //------------------ 
         setTitle("Phone Directory"); 
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//---------------------------------------------------------------------------Date-Photo-size-color 
         Date da = new Date(); 
         Container contentPane = getContentPane(); 
         contentPane.setLayout(new BorderLayout()); 
         contentPane.setBackground(Color.green); 
         setSize(300,300); 
         //------------------- 
         JLabel time = new JLabel("          Today is : " +da); 
       getContentPane().add(time); 
         //---------------- 
        setResizable(false);         
         setLocationRelativeTo(null);      
         String imgStr1 = "c://EQLS.png"; 
         ImageIcon image = new ImageIcon(imgStr1);      
         JLabel label1 = new JLabel(" ", image, JLabel.CENTER); 
         getContentPane().add(label1); 
         validate();     
         setVisible(true);  
//-----------------------------------------------------------------------------------------Button1 
    JButton button1 = new JButton("*~...~*  Welcome *~...~*"); 
     
    button1.addActionListener(new ActionListener() {   public void actionPerformed(ActionEvent e)  
      { 
          JOptionPane.showMessageDialog((Component) e.getSource(), "\n\nThe main idea behind my system is\n\n\n to make the search for teacher information easier using a computer system.\n\n"); 
        } 
    });//end button1 
     
//-----------------------------------------------------------------------------------------Button2 
    JButton button2 = new JButton("Main User Access: Phone Directory"); 
    button2.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) 
      {  
         String Option1 = JOptionPane.showInputDialog(null,"Please Enter The Number of Choice !? \n1) View list ROOM\n2) SEARCH THE DATA OFTEACHER\n3) Remove DATA OF TEACHER list\n4) Delete\n5) Return\n6) Exit\n", "Phone Directory Options", JOptionPane.INFORMATION_MESSAGE); 
         int ConvOption1 = Integer.parseInt(Option1); 
         theUser.mainUser(ConvOption1,Option1);//go to main User method 
      }//end method public void actionListener       String Option1 = JOptionPane.showInputDialog( 
    });//end button2 
     
//-----------------------------------------------------------------------------------------Button3          
    JButton button3= new JButton("Exit"); 
    button3.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent e) 
      { 
        int result = JOptionPane.showConfirmDialog((Component) e.getSource(),"Close Phone Directory SYSTEM"); 
        if (result == JOptionPane.YES_OPTION) 
        {System.exit(0);}  
      } 
    });//end button3 
//------------------------------------------------------------------------------------------ 
  //  setLayout(new FlowLayout(FlowLayout.CENTER)); 
    setLayout(new GridLayout(8,4)); 
    getContentPane().add(button1); 
     
   getContentPane().add(button2); 
     
    getContentPane().add(button3); 
     
  }//end public method Main 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
}