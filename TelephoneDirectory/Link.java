class Link  
  {  
    public int Room_Number;  
    public String teacher_ID;  
    public String Teacher_Name;  
    public String Phone_number; // data item  
    public Link next; // next link in list  

    // -------------------------------------------------------------  

    public Link(int a, String b, String teacher, String Phone) // constructor  
    {  
        Room_Number = a;  
        teacher_ID = b; // constructor  
        Teacher_Name = teacher;  
        Phone_number = Phone;  

    } // set to null)  
        // -------------------------------------------------------------  

    public void displayLink1()  
    // display ourself  
    {  

        System.out.println("\t" + Teacher_Name + "\t\t{" + Room_Number + "}");  
        System.out.println("");  
    }  


    public void displayLink2()  
    // display ourself  
    {  
        System.out.print("\t" + Room_Number);  
        System.out.print("\t" + teacher_ID);  
        System.out.print("\t" + Teacher_Name);  
        System.out.println("\t\t{" + Phone_number + "}");  
    } 
} 