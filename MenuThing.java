import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.event.*;
import java.awt.*;
public class MenuThing extends JPanel implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JButton north;
	JButton south;
	JButton east;
	JButton west;
	JMenuBar menuBar;
	JMenu fonts;
	JMenuItem font1;
	JMenuItem font2;
	JMenuItem font3;
	JMenu fontsizes;
	JMenuItem size1;
	JMenuItem size2;
	JMenuItem size3;
	JMenu colors;
	JMenuItem color1;
	JMenuItem color2;
	JMenuItem color3;
	JMenu backgroundcolors;
	JMenuItem bgcolor1;
	JMenuItem bgcolor2;
	JMenuItem bgcolor3;
	JMenu outlinecolors;
	JMenuItem olcolor1;
	JMenuItem olcolor2;
	JMenuItem olcolor3;
	JMenuItem olcolor4;
	JButton reset;
	
	JPanel buttons;
	
	Font[] fontarr;
	int[] fontsizearr;
	Color[] colorarr;
	Color[] bgcolorarr;
	Color[] olcolorarr;
	
	JTextArea textarea;
	
	public MenuThing()
	{
		frame=new JFrame();
		frame.add(this);
		
		textarea = new JTextArea();
		
		fontsizearr = new int[3];
		fontsizearr[0] = 12;
		fontsizearr[1] = 24;
		fontsizearr[2] = 36;
		
		fontarr = new Font[3];
		fontarr[0] = new Font("Times New Roman",Font.PLAIN,fontsizearr[0]);
		fontarr[1] = new Font("Comic Sans MS",Font.PLAIN,fontsizearr[0]);
		fontarr[2] = new Font("Georgia",Font.PLAIN,fontsizearr[0]);
		
		colorarr = new Color[3];
		colorarr[0] = Color.RED;
		colorarr[1] = Color.GREEN;
		colorarr[2] = Color.BLUE;
		
		bgcolorarr = new Color[3];
		bgcolorarr[0] = Color.WHITE;
		bgcolorarr[1] = Color.BLACK;
		bgcolorarr[2] = Color.GRAY;
		
		olcolorarr = new Color[3];
		olcolorarr[0] = Color.RED;
		olcolorarr[1] = Color.GREEN;
		olcolorarr[2] = Color.BLUE;
		
		menuBar = new JMenuBar();
		menuBar.setLayout(new GridLayout(1,5));
		
		north = new JButton("N");
		north.addActionListener(this);
		south = new JButton("S");
		south.addActionListener(this);
		east = new JButton("E");
		east.addActionListener(this);
		west = new JButton("W");
		west.addActionListener(this);
		reset = new JButton("Reset");
		reset.addActionListener(this);
		
		fonts = new JMenu("Font");
		fonts.addActionListener(this);
		font1 = new JMenuItem("Times New Roman");
		font1.addActionListener(this);
		font2 = new JMenuItem("Comic Sans MS");
		font2.addActionListener(this);
		font3 = new JMenuItem("Georgia");
		font3.addActionListener(this);
		fontsizes = new JMenu("Font Size");
		fontsizes.addActionListener(this);
		size1 = new JMenuItem("12");
		size1.addActionListener(this);
		size2 = new JMenuItem("24");
		size2.addActionListener(this);
		size3 = new JMenuItem("36");
		size3.addActionListener(this);
		colors = new JMenu("Text");
		colors.addActionListener(this);
		color1 = new JMenuItem("Red");
		color1.addActionListener(this);
		color2 = new JMenuItem("Green");
		color2.addActionListener(this);
		color3 = new JMenuItem("Blue");
		color3.addActionListener(this);
		backgroundcolors = new JMenu("Back");
		backgroundcolors.addActionListener(this);
		bgcolor1 = new JMenuItem("White");
		bgcolor1.addActionListener(this);
		bgcolor2 = new JMenuItem("Black");
		bgcolor2.addActionListener(this);
		bgcolor3 = new JMenuItem("Gray");
		bgcolor3.addActionListener(this);
		outlinecolors = new JMenu("Outline");
		outlinecolors.addActionListener(this);
		olcolor1 = new JMenuItem("None");
		olcolor1.addActionListener(this);
		olcolor2 = new JMenuItem("Red");
		olcolor2.addActionListener(this);
		olcolor3 = new JMenuItem("Green");
		olcolor3.addActionListener(this);
		olcolor4 = new JMenuItem("Blue");
		olcolor4.addActionListener(this);
		
		fonts.add(font1);
		fonts.add(font2);
		fonts.add(font3);
		menuBar.add(fonts);
		fontsizes.add(size1);
		fontsizes.add(size2);
		fontsizes.add(size3);
		menuBar.add(fontsizes);
		colors.add(color1);
		colors.add(color2);
		colors.add(color3);
		menuBar.add(colors);
		backgroundcolors.add(bgcolor1);
		backgroundcolors.add(bgcolor2);
		backgroundcolors.add(bgcolor3);
		menuBar.add(backgroundcolors);
		outlinecolors.add(olcolor1);
		outlinecolors.add(olcolor2);
		outlinecolors.add(olcolor3);
		outlinecolors.add(olcolor4);
		menuBar.add(outlinecolors);
		
		buttons = new JPanel();
		buttons.setLayout(new GridLayout(1,4));
		buttons.add(north);
		buttons.add(south);
		buttons.add(east);
		buttons.add(west);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(1,3));
		panel.add(buttons);
		panel.add(menuBar);
		panel.add(reset);
		
		setMenuTextFont(0);
		setButtonTextFont(0);
		
		textarea.setFont(fontarr[0]);
		
		font1.setFont(fontarr[0]);
		font2.setFont(fontarr[1]);
		font3.setFont(fontarr[2]);
		
		frame.add(panel,BorderLayout.NORTH);
		frame.add(textarea,BorderLayout.CENTER);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,600);
		frame.setVisible(true);
	}
	
	public void setButtonTextFont(int x) {
		north.setFont(fontarr[x]);
		south.setFont(fontarr[x]);
		east.setFont(fontarr[x]);
		west.setFont(fontarr[x]);
		reset.setFont(fontarr[x]);
	}
	
	public void setMenuTextFont(int x) {
		fonts.setFont(fontarr[x]);
		fontsizes.setFont(fontarr[x]);
		size1.setFont(fontarr[x]);
		size2.setFont(fontarr[x]);
		size3.setFont(fontarr[x]);
		colors.setFont(fontarr[x]);
		color1.setFont(fontarr[x]);
		color2.setFont(fontarr[x]);
		color3.setFont(fontarr[x]);
		backgroundcolors.setFont(fontarr[x]);
		bgcolor1.setFont(fontarr[x]);
		bgcolor2.setFont(fontarr[x]);
		bgcolor3.setFont(fontarr[x]);
		outlinecolors.setFont(fontarr[x]);
		olcolor1.setFont(fontarr[x]);
		olcolor2.setFont(fontarr[x]);
		olcolor3.setFont(fontarr[x]);
		olcolor4.setFont(fontarr[x]);
	}
	
	public void setMenuTextColor(int x) {
		if(x == -1) {
			fonts.setForeground(Color.BLACK);
			font1.setForeground(Color.BLACK);
			font2.setForeground(Color.BLACK);
			font3.setForeground(Color.BLACK);
			fontsizes.setForeground(Color.BLACK);
			size1.setForeground(Color.BLACK);
			size2.setForeground(Color.BLACK);
			size3.setForeground(Color.BLACK);
			colors.setForeground(Color.BLACK);
			color1.setForeground(Color.BLACK);
			color2.setForeground(Color.BLACK);
			color3.setForeground(Color.BLACK);
			backgroundcolors.setForeground(Color.BLACK);
			bgcolor1.setForeground(Color.BLACK);
			bgcolor2.setForeground(Color.BLACK);
			bgcolor3.setForeground(Color.BLACK);
			outlinecolors.setForeground(Color.BLACK);
			olcolor1.setForeground(Color.BLACK);
			olcolor2.setForeground(Color.BLACK);
			olcolor3.setForeground(Color.BLACK);
			olcolor4.setForeground(Color.BLACK);
		}else {
			fonts.setForeground(colorarr[x]);
			font1.setForeground(colorarr[x]);
			font2.setForeground(colorarr[x]);
			font3.setForeground(colorarr[x]);
			fontsizes.setForeground(colorarr[x]);
			size1.setForeground(colorarr[x]);
			size2.setForeground(colorarr[x]);
			size3.setForeground(colorarr[x]);
			colors.setForeground(colorarr[x]);
			color1.setForeground(colorarr[x]);
			color2.setForeground(colorarr[x]);
			color3.setForeground(colorarr[x]);
			backgroundcolors.setForeground(colorarr[x]);
			bgcolor1.setForeground(colorarr[x]);
			bgcolor2.setForeground(colorarr[x]);
			bgcolor3.setForeground(colorarr[x]);
			outlinecolors.setForeground(colorarr[x]);
			olcolor1.setForeground(colorarr[x]);
			olcolor2.setForeground(colorarr[x]);
			olcolor3.setForeground(colorarr[x]);
			olcolor4.setForeground(colorarr[x]);
		}
	}
	
	public void setButtonTextColor(int x) {
		if(x == -1) {
			north.setForeground(Color.BLACK);
			south.setForeground(Color.BLACK);
			east.setForeground(Color.BLACK);
			west.setForeground(Color.BLACK);
			reset.setForeground(Color.BLACK);
		}else {
			north.setForeground(colorarr[x]);
			south.setForeground(colorarr[x]);
			east.setForeground(colorarr[x]);
			west.setForeground(colorarr[x]);
			reset.setForeground(colorarr[x]);
		}
	}
	
	public void setButtonColor(int x) {
		if(x == -1) {
			north.setBackground(null);
			south.setBackground(null);
			east.setBackground(null);
			west.setBackground(null);
			reset.setBackground(null);
		}else {
			north.setBackground(bgcolorarr[x]);
			south.setBackground(bgcolorarr[x]);
			east.setBackground(bgcolorarr[x]);
			west.setBackground(bgcolorarr[x]);
			reset.setBackground(bgcolorarr[x]);
		}
	}
	
	public void setButtonOutlineColor(int x) {
		if(x == -1) {
			north.setBorder(null);
			south.setBorder(null);
			east.setBorder(null);
			west.setBorder(null);
			reset.setBorder(null);
		}else {
			north.setBorder(new LineBorder(olcolorarr[x]));
			south.setBorder(new LineBorder(olcolorarr[x]));
			east.setBorder(new LineBorder(olcolorarr[x]));
			west.setBorder(new LineBorder(olcolorarr[x]));
			reset.setBorder(new LineBorder(olcolorarr[x]));
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == north) {
			frame.remove(panel);
			buttons.setLayout(new GridLayout(1,4));
			menuBar.setLayout(new GridLayout(1,5));
			panel.setLayout(new GridLayout(1,3));
			frame.add(panel,BorderLayout.NORTH);
		}
		if(e.getSource() == south) {
			frame.remove(panel);
			buttons.setLayout(new GridLayout(1,4));
			menuBar.setLayout(new GridLayout(1,5));
			panel.setLayout(new GridLayout(1,3));
			frame.add(panel,BorderLayout.SOUTH);
		}
		if(e.getSource() == east) {
			frame.remove(panel);
			buttons.setLayout(new GridLayout(4,1));
			menuBar.setLayout(new GridLayout(5,1));
			panel.setLayout(new GridLayout(3,1));
			frame.add(panel,BorderLayout.EAST);
		}
		if(e.getSource() == west) {
			frame.remove(panel);
			buttons.setLayout(new GridLayout(4,1));
			menuBar.setLayout(new GridLayout(5,1));
			panel.setLayout(new GridLayout(3,1));
			frame.add(panel,BorderLayout.WEST);
		}
		if(e.getSource() == font1) {
			setMenuTextFont(0);
			setButtonTextFont(0);
			textarea.setFont(fontarr[0]);
		}
		if(e.getSource() == font2) {
			setMenuTextFont(1);
			setButtonTextFont(1);
			textarea.setFont(fontarr[1]);
		}
		if(e.getSource() == font3) {
			setMenuTextFont(2);
			setButtonTextFont(2);
			textarea.setFont(fontarr[2]);
		}
		if(e.getSource() == size1) {
			if(textarea.getFont().getFontName().equals("Times New Roman")) {
				System.out.println("WORKED");
				textarea.setFont(new Font("Times New Roman",Font.PLAIN,12));
			}
			if(textarea.getFont().getFontName().equals("Comic Sans MS")) {
				textarea.setFont(new Font("Comic Sans MS",Font.PLAIN,12));
			}
			if(textarea.getFont().getFontName().equals("Georgia")) {
				textarea.setFont(new Font("Georgia",Font.PLAIN,12));
			}
		}
		if(e.getSource() == size2) {
			if(textarea.getFont().getFontName().equals("Times New Roman")) {
				textarea.setFont(new Font("Times New Roman",Font.PLAIN,24));
			}
			if(textarea.getFont().getFontName().equals("Comic Sans MS")) {
				textarea.setFont(new Font("Comic Sans MS",Font.PLAIN,24));
			}
			if(textarea.getFont().getFontName().equals("Georgia")) {
				textarea.setFont(new Font("Georgia",Font.PLAIN,24));
			}
		}
		if(e.getSource() == size3) {
			if(textarea.getFont().getFontName().equals("Times New Roman")) {
				textarea.setFont(new Font("Times New Roman",Font.PLAIN,36));
			}
			if(textarea.getFont().getFontName().equals("Comic Sans MS")) {
				textarea.setFont(new Font("Comic Sans MS",Font.PLAIN,36));
			}
			if(textarea.getFont().getFontName().equals("Georgia")) {
				textarea.setFont(new Font("Georgia",Font.PLAIN,36));
			}
		}
		if(e.getSource() == color1) {
			setMenuTextColor(0);
			setButtonTextColor(0);
			textarea.setForeground(colorarr[0]);
		}
		if(e.getSource() == color2) {
			setMenuTextColor(1);
			setButtonTextColor(1);
			textarea.setForeground(colorarr[1]);
		}
		if(e.getSource() == color3) {
			setMenuTextColor(2);
			setButtonTextColor(2);
			textarea.setForeground(colorarr[2]);
		}
		if(e.getSource() == bgcolor1) {
			setButtonColor(0);
			textarea.setBackground(bgcolorarr[0]);
		}
		if(e.getSource() == bgcolor2) {
			setButtonColor(1);
			textarea.setBackground(bgcolorarr[1]);
		}
		if(e.getSource() == bgcolor3) {
			setButtonColor(2);
			textarea.setBackground(bgcolorarr[2]);
		}
		if(e.getSource() == olcolor1) {
			setButtonOutlineColor(-1);
		}
		if(e.getSource() == olcolor2) {
			setButtonOutlineColor(0);
		}
		if(e.getSource() == olcolor3) {
			setButtonOutlineColor(1);
		}
		if(e.getSource() == olcolor4) {
			setButtonOutlineColor(2);
		}
		if(e.getSource() == reset) {
			frame.remove(panel);
			buttons.setLayout(new GridLayout(1,4));
			menuBar.setLayout(new GridLayout(1,5));
			panel.setLayout(new GridLayout(1,3));
			frame.add(panel,BorderLayout.NORTH);
			textarea.setText("");
			textarea.setFont(fontarr[0]);
			textarea.setForeground(colorarr[0]);
			textarea.setBackground(bgcolorarr[0]);
			setMenuTextFont(0);
			setMenuTextColor(-1);
			setButtonTextFont(0);
			setButtonTextColor(-1);
			setButtonColor(-1);
			setButtonOutlineColor(-1);
		}
		frame.revalidate();
	}



	public static void main(String[] args)
	{
		MenuThing app=new MenuThing();
	}

}