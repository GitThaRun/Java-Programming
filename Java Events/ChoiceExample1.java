    // importing awt class  
    import java.awt.*;   
    public class ChoiceExample1 {    
      
             // class constructor  
            ChoiceExample1() {    
      
            // creating a frame  
            Frame f = new Frame();    
      
            // creating a choice component  
            Choice c = new Choice();   
      
            // setting the bounds of choice menu   
            c.setBounds(100, 100, 75, 75);    
      
            // adding items to the choice menu  
            c.add("C");    
            c.add("JAVA");    
            c.add("C++");    
            c.add("JavaScript");    
            c.add("PYTHON");    
      
            // adding choice menu to frame  
            f.add(c);    
      
            // setting size, layout and visibility of frame  
            f.setSize(400, 400);    
            f.setLayout(null);    
            f.setVisible(true);    
         }    
      
    // main method  
    public static void main(String args[])    
    {    
       new ChoiceExample1();    
    }    
    }     