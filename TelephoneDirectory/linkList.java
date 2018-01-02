class linkList 
 {  
    private Link first; // ref to first link on list  

    // -------------------------------------------------------------  
    public linkList() // constructor  
    {  
        first = null; // no links on list yet  
    }  

    // -------------------------------------------------------------  
    public boolean isEmpty() // true if list is empty  
    {  
        return (first == null);  
    }  
    // -------------------------------------------------------------  
    // insert at start of list  
        public String insertFirst(int a, String SD, String teacher, String Phone) { // make  
                                                                        // new  
                                                                        // link  
        Link newLink = new Link(a, SD, teacher, Phone);  
        newLink.next = first; // newLink --> old first  
        first = newLink; // first --> newLink  
        return first.Room_Number + "  " + first.teacher_ID + "  " + first.Teacher_Name + "{" + first.Phone_number + "}";  
    }  

    // -------------------------------------------------------------  
    public Link find(int key) // find link with given key  
    { // (assumes non-empty list)  
        Link current = first; // start at 'first'  
        while (current.Room_Number != key) // while no match,  
        {  
            if (current.next == null) // if end of list,  
                return null; // didn't find it  
            else  
                // not end of list,  
                current = current.next; // go to next link  
        }  
        return current; // found it  
    }  

    // /////////////////////////////////////  
    public Link delete(int key) // delete link with given key  
    { // (assumes non-empty list)  
        Link current = first; // search for link  
        Link previous = first;  
        while (current.Room_Number != key) {  
            if (current.next == null)  
                return null; // didn't find it  
            else {  
                previous = current; // go to next link  
                current = current.next;  
            }  
        } // found it  
        if (current == first) // if first link,  
            first = first.next; // change first  
        else  
            // otherwise,  
            previous.next = current.next; // bypass it  
        return current;  
    }  

    // -------------------------------------------------------------  

    public void displayList() {  
        System.out.println("\t\t\n\n                        *~...~*  Welcome *~...~*\n\n ");  
        System.out.print("\n\n\t\t               The Menue  \n\n");  
        System.out.println("\n\t :: NAME OF TEACHERS ::\t\t:: NUMBER OF ROOM ::");  
        System.out.println("");  
        Link current = first; // start at beginning of list  
        while (current != null) // until end of list,  
        {  
            current.displayLink1(); // print data  
            current = current.next;  
            // move to next link  
        }  
        System.out.println("");  
    }  

    public void display2() {  
        System.out.print("\t\t        *~...~*  The Menue *~...~*  \n\n");  
        System.out.println("\n\tR.N.    ID              TEACHER NAME \t                PHONE NUMBER\n ");  
        Link current = first; // start at beginning of list  
        while (current != null) // until end of list,  
        {  
            current.displayLink2(); // print data  
            current = current.next;  
            // move to next link  
        }  
        System.out.println("");  
    }  
    // -------------------------------------------------------------  
} // en