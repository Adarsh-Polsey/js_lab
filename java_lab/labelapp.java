import java.awt.*;
public class labelapp {
    public static void main(String args[]){
        Frame f=new Frame("label example");
        Label l1,l2;
        
        l1=new Label("First Label");
        l2=new Label("second  Label");
        
        l1.setBounds(50, 100,100,30);
        l2.setBounds(50, 150,100,30);
        
        f.add(l1);
        f.add(l2);
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
        
        
        
    }
    
}
