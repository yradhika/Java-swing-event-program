import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;  
import javax.swing.event.*; 

public class Swing_Event_lak
{ 
  public Swing_Event() 
    { 
        JFrame f=new JFrame(); 
	f.setSize(400, 500) ; 
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	f.setLayout(new FlowLayout());
        
	JLabel l1=new JLabel("Enter your Name");
	f.add(l1);
	
	JTextField t1=new JTextField(20); 
	f.add(t1);
	
	JButton button1 = new JButton("click here"); 
        f.add(button1);	
	
	JTextField t2=new JTextField(20);
	t2.setBackground(Color.green); 
	f.add(t2);
	
	JLabel l2=new JLabel("Choose items from the list");
	f.add(l2);
	 
    	String Items[]= {"Sandwich:Rs   50","Pizza: Rs 200","Burger: Rs 100", 
                         "Icecream: Rs 75","Waterbottle: Rs 30"};
	JList li=new JList(Items);
	li.setBackground(Color.cyan);	
 	li.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	f.add(li);
	
	JLabel l3=new JLabel("You Selected:");
	
	f.add(l3);
	
		
	JList lc=new JList();
	f.add(lc);
	JLabel l4=new JLabel("Select payment mode");
	f.add(l4);
	JRadioButton r1=new JRadioButton("cash");
	JRadioButton r2=new JRadioButton("card");
	ButtonGroup bg=new ButtonGroup();    
	bg.add(r1);bg.add(r2); 
	f.add(r1);
	f.add(r2);
	JLabel l5=new JLabel("Feedback related to food  ..");
	f.add(l5);
	JCheckBox c1 = new JCheckBox("Tasty "); 
        JCheckBox c2 = new JCheckBox("wide choices in Menu");
	JCheckBox c3 = new JCheckBox("Good presentation of food"); 
        JCheckBox c4 = new JCheckBox("Worth its price");
	f.add(c1);f.add(c2);f.add(c3);f.add(c4); 

	JLabel l6=new JLabel("Specific Remarks");
	f.add(l6);
	JTextArea ta=new JTextArea(2,20);
	f.add(ta);
	f.setVisible(true); 
	JLabel l7=new JLabel("Thank you, visit again");
	f.add(l7);
	button1.addActionListener(new ActionListener()
	{  
    		public void actionPerformed(ActionEvent e)
		{  
            	  t2.setText("Welcome "+t1.getText()); 
    		}  
    	});

	li.addListSelectionListener(new ListSelectionListener()
	{
            	public void valueChanged(ListSelectionEvent e) 
    		{ 
        	   
		    lc.setListData(li.getSelectedValues());
    		}
	}); 
    
      }
    
   
    public static void main(String[] args) 
    { 
  	Swing_Event obj = new Swing_Event(); 
    }          
} 