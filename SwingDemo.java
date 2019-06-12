//Swings Demo
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class SwingDemo
{
	public static JFrame jf;
	private JTextField jt,jt1;
	private JLabel jl;
	private JButton jb;
	private JPanel p;
	public SwingDemo()
	{
		prepareGUI();
	}
	public static void main(String args[])
	{
		SwingDemo s=new SwingDemo();
		s.showEventDemo();
	}
	public void prepareGUI()
	{
		jf= new JFrame("Java Swing");
		jf.setSize(400,400);
		jf.setLayout(new GridLayout(3,1));
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}        
		});
		p=new JPanel();
		p.setLayout(new FlowLayout());
		jl=new JLabel("Enter Text : ");
		jt=new JTextField("",30);
		jt1=new JTextField("",30);
		p.add(jl);
		p.add(jt);
		p.add(jt1);
		jf.setVisible(true);
	}
	private void showEventDemo()
	{	
		jb=new JButton("Click");
		jb.addActionListener(new ButtonClickListener());
		p.add(jb);
		jf.setVisible(true);
	}
	private class ButtonClickListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         String command = e.getActionCommand();  
         String text=jt.getText();
         if( command.equals("Click"))  {
            jt1.setText(text);
         } 	
      }		
   }
}