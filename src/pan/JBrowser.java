package pan;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.CardLayout;

//import javax.management.timer.Timer;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

import doryan.windowsnotificationapi.fr.Notification;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.ScrollPane;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;

import javax.swing.JLabel;

import java.util.TimerTask;
import java.util.Timer;
import java.util.Vector;
import java.awt.TrayIcon.MessageType;
import java.awt.event.*;
import javax.swing.*;

public class JBrowser {

	private JFrame frame;
	static int current = 1;
	static int x = 10;
	static int y = 60;
	static int currentpage = 1;
	static int talkrecord = 0;
	static int numrecord = 0;
	
	static String lovesus = "yes";
	static String outofin = "outdoor";
	static String introextro = "introvert";
	static int hourperevent = 0;
	static int eventpermonth = 14;
	static String likeevent = "";
	static String importantsustainable = "";
	
	
	private JTextField InputBox;
	private JTextField pagerecord;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JBrowser window = new JBrowser();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JBrowser() {
		initialize();
	}
	
	String []conversation = new String[1000];
	int []data = new int[1000];
	/**
	 * Initialize the contents of the frame.
	 */
	static boolean open = false;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField VerifyBot;
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 794, 606);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "panel");
		panel.setLayout(null);
		
		JTextPane Ask_1 = new JTextPane();
		Ask_1.setBackground(new Color(51, 255, 0));
		Ask_1.setEditable(false);
		Ask_1.setVisible(false);
		Ask_1.setBounds(247, 188, 408, 35);
		panel.add(Ask_1);
		
		
		JTextPane Ask2 = new JTextPane();
		Ask2.setText("sbc");
		Ask2.setForeground(Color.BLACK);
		Ask2.setBackground(new Color(153, 255, 0));
		Ask2.setBounds(472, 47, 191, 57);
		Ask2.setEditable(false);
		Ask2.setVisible(false);
		panel.add(Ask2);
		
		JTextPane Ask3 = new JTextPane();
		Ask3.setBackground(new Color(102, 255, 0));
		Ask3.setBounds(472, 114, 191, 57);
		Ask3.setEditable(false);
		Ask3.setVisible(false);
		panel.add(Ask3);
		
		JTextPane Ask4 = new JTextPane();
		Ask4.setBackground(new Color(102, 255, 0));
		Ask4.setBounds(472, 211, 191, 57);
		Ask4.setEditable(false);
		Ask4.setVisible(false);
		panel.add(Ask4);
		
		JTextPane Ask5 = new JTextPane();
		Ask5.setBackground(new Color(51, 255, 51));
		Ask5.setBounds(495, 278, 174, 57);
		Ask5.setEditable(false);
		Ask5.setVisible(false);
		panel.add(Ask5);
		
		JTextPane Ans1 = new JTextPane();
		Ans1.setBackground(new Color(0, 255, 51));
		Ans1.setBounds(258, 278, 180, 57);
		Ans1.setEditable(false);
		Ans1.setVisible(false);
		panel.add(Ans1);
		
		JTextPane Ans2 = new JTextPane();
		Ans2.setBackground(new Color(0, 255, 51));
		Ans2.setBounds(258, 144, 174, 57);
		Ans2.setEditable(false);
		Ans2.setVisible(false);
		panel.add(Ans2);
		
		JTextPane Ans3 = new JTextPane();
		Ans3.setBackground(new Color(51, 255, 153));
		Ans3.setBounds(258, 77, 174, 57);
		Ans3.setEditable(false);
		Ans3.setVisible(false);
		panel.add(Ans3);
		
		JTextPane Ans4 = new JTextPane();
		Ans4.setBackground(new Color(0, 255, 0));
		Ans4.setBounds(258, 211, 174, 57);
		Ans4.setEditable(false);
		Ans4.setVisible(false);
		panel.add(Ans4);
		
		JTextPane Ans5 = new JTextPane();
		Ans5.setBounds(258, 278, 82, 57);
		Ans5.setEditable(false);
		Ans5.setVisible(false);
		panel.add(Ans5);
		
		JButton GPT1 = new JButton("B");
		GPT1.setVisible(false);
		GPT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GPT1.setBounds(139, 77, 85, 57);
		panel.add(GPT1);
		
		JButton GPT2 = new JButton("B");
		GPT2.setVisible(false);
		GPT2.setBounds(139, 144, 85, 57);
		panel.add(GPT2);
		
		JButton GPT3 = new JButton("B");
		GPT3.setVisible(false);
		GPT3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GPT3.setVisible(false);
		GPT3.setBounds(139, 211, 85, 57);
		panel.add(GPT3);
		
		JButton GPT4 = new JButton("B");
		GPT4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GPT4.setVisible(false);
		GPT4.setBounds(139, 278, 85, 57);
		panel.add(GPT4);
		
		JButton GPT5 = new JButton("B");
		GPT5.setVisible(false);
		GPT5.setBounds(139, 342, 85, 57);
		panel.add(GPT5);
		
		JButton Chat1 = new JButton("You");
		Chat1.setVisible(false);
		Chat1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Chat1.setBounds(675, 47, 85, 57);
		panel.add(Chat1);
		
		JButton Chat2 = new JButton("You");
		Chat2.setVisible(false);
		Chat2.setBounds(675, 114, 85, 57);
		panel.add(Chat2);
		
		JButton Chat3 = new JButton("You");
		Chat3.setVisible(false);
		Chat3.setBounds(675, 181, 85, 57);
		panel.add(Chat3);
		
		JButton Chat4 = new JButton("You");
		Chat4.setVisible(false);
		Chat4.setBounds(675, 248, 85, 57);
		panel.add(Chat4);
		
		JButton btnYou = new JButton("You");
		btnYou.setVisible(false);
		btnYou.setBounds(675, 316, 85, 57);
		panel.add(btnYou);

		JButton btnNewButton = new JButton("Chat");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuffer m = new StringBuffer(InputBox.getText());
				if(!InputBox.getText().equals(""))
				{
					int length = m.length();
					if(length > 50) {
						 for(int i = 1; i <= length / 50; i++) {
							m.insert(i * 50, "\n");
						}
					}
				if(y + 20 + length / 50 * 20 < 380)
				{
					 conversation[talkrecord]= m.toString();
					 talkrecord++;
					 data[numrecord] = currentpage;
					 numrecord++;
					if(670 - length * 8.5 > 200)
					{
						if(current % 5 == 1)
						{
							Ask_1.setBounds((int)(670-length*8.5), y, (int)(length*8.5), 20 + length/50 * 20);
							Chat1.setBounds(675, y, 60, 20 + length/50 * 20);
							Chat1.setVisible(true);
						}
						if(current % 5 == 2)
						{
							Ask2.setBounds((int)(670-length*8.5), y, (int)(length*8.5), 20 + length/50 * 20);
							Chat2.setBounds(675, y, 60, 20 + length/50 * 20);
							Chat2.setVisible(true);
						}
						if(current % 5 == 3)
						{
							Ask3.setBounds((int)(670-length*8.5), y, (int)(length*8.5), 20 + length/50 * 20);
							Chat3.setBounds(675, y, 60, 20 + length/50 * 20);
							Chat3.setVisible(true);
						}
						if(current % 5 == 4)
						{
							Ask4.setBounds((int)(670-length*8.5), y, (int)(length*8.5), 20 + length/50 * 20);
							Chat4.setBounds(675, y, 60, 20 + length/50 * 20);
							Chat4.setVisible(true);
						}
						if(current % 5 == 0)
						{
							Ask5.setBounds((int)(670-length*8.5), y, (int)(length*8.5), 20 + length/50 * 20);
							btnYou.setBounds(675, y, 60, 20 + length/50 * 20);
							btnYou.setVisible(true);
						}
						int ms = y;
						
						data[numrecord] = (int)(670 - length * 8.5);
						numrecord++;
						data[numrecord] = ms;
						numrecord++;
						data[numrecord] = (int)(length * 8.5);
						numrecord++;
						data[numrecord] = 20 + (int)(length/50 * 20);
						numrecord++;
					//	JOptionPane.showMessageDialog(null, totalrecord);
					}
					else {
						if(current % 5 == 1)
						{
							Ask_1.setBounds(200, y, 550, 20 + length/50 * 20);
							Chat1.setBounds(675, y, 60, 20 + length/50 * 20);
							Chat1.setVisible(true);
						}
						if(current % 5 == 2)	
						{
							Ask2.setBounds(200, y, 550, 20 + length/50 * 20);
							Chat2.setBounds(675, y, 60, 20 + length/50 * 20);
							Chat2.setVisible(true);
						}
						if(current % 5 == 3)
						{
							Ask3.setBounds(200, y, 550, 20 + length/50 * 20);
							Chat3.setBounds(675, y, 60, 20 + length/50 * 20);
							Chat3.setVisible(true);
						}
						if(current % 5 == 4)
						{
							Ask4.setBounds(200, y, 550, 20 + length/50 * 20);
							Chat4.setBounds(675, y, 60, 20 + length/50 * 20);
							Chat4.setVisible(true);
						}
						if(current % 5 == 0)
						{
							Ask5.setBounds(200, y, 550, 20 + length/50 * 20);
							btnYou.setBounds(675, y, 60, 20 + length/50 * 20);
							btnYou.setVisible(true);
						}
						
						int ms = y;
						
						data[numrecord] = currentpage;
						numrecord++;
						data[numrecord] = 200;
						numrecord++;
						data[numrecord] = ms;
						numrecord++;
						data[numrecord] = 550;
						numrecord++;
						data[numrecord] = 20 + (int)(length/50 * 20);
						numrecord++;
				//		JOptionPane.showMessageDialog(null, totalrecord);
					}
					y = y + (20 + length / 50 * 20) + 10;
					
				if(current % 5 == 1)
				{
					Ask_1.setVisible(true);
					Ask_1.setText(m.toString());
				}
				if(current % 5 == 2)
				{
					Ask2.setVisible(true);
					Ask2.setText(m.toString());
				}
				if(current % 5 == 3)
				{
					Ask3.setVisible(true);
					Ask3.setText(m.toString());
				}
				if(current % 5 == 4)
				{
					Ask4.setVisible(true);
					Ask4.setText(m.toString());
				}
				if(current % 5 == 0)
				{
					Ask5.setVisible(true);
					Ask5.setText(m.toString());
				}
				InputBox.setText("");
				
				StringBuffer response = new StringBuffer("I am So Sorry. But As an AI Language Model. I cannot tell you about that.");
				int len = response.length();				
				if(len > 50) {
					 for(int i = 1; i <= len / 50; i++) {
						response.insert(i * 50, "\n");
					}
				}
				conversation[talkrecord] = response.toString();
				talkrecord++;
				data[numrecord] = currentpage;
				numrecord++;

				if(len * 8.5 < 440){
					if(current % 5 == 1) {
						Ans1.setBounds(200, y, (int)(len*8.5), 20 + len/50 * 20);
						GPT1.setBounds(140, y, 50, 20 + length/50 * 20);
						GPT1.setVisible(true);
					}
					if(current % 5 == 2)
					{
						Ans2.setBounds(200, y, (int)(len*8.5), 20 + len/50 * 20);
						GPT2.setBounds(140, y, 50, 20 + length/50 * 20);	
						GPT2.setVisible(true);
					}
					if(current % 5 == 3)
					{
						Ans3.setBounds(200, y, (int)(len*8.5), 20 + len/50 * 20);
						GPT3.setBounds(140, y, 50, 20 + length/50 * 20);
						GPT3.setVisible(true);
					}
					if(current % 5 == 4)
					{
						Ans4.setBounds(200, y, (int)(len*8.5), 20 + len/50 * 20);
						GPT4.setBounds(140, y, 50, 20 + length/50 * 20);
						GPT4.setVisible(true);
					}
					if(current % 5 == 0) {
						Ans5.setBounds(200, y, (int)(len*8.5), 20 + len/50 * 20);
						GPT5.setBounds(140, y, 50, 20 + length/50 * 20);
						GPT5.setVisible(true);
					}
					
					int ms = y;
					data[numrecord]  = 200;
					numrecord++;
					data[numrecord] = ms;
					numrecord++;
					data[numrecord] = (int)(len * 8.5);
					numrecord++;
					data[numrecord] = 20 + (int)(len/50 * 20);
					numrecord++;
					//JOptionPane.showMessageDialog(null, totalrecord);
				}
				else {
					if(current % 5 == 1) {
						Ans1.setBounds(200, y, 440, 20 + len/50 * 20);
						GPT1.setBounds(140, y, 50, 20 + length/50 * 20);
						GPT1.setVisible(true);
					}
					if(current % 5 == 2) {
						Ans2.setBounds(200, y, 440, 20 + len/50 * 20);
						GPT2.setBounds(140, y, 50, 20 + length/50 * 20);	
						GPT2.setVisible(true);
					}
					if(current % 5 == 3) {
						Ans3.setBounds(200, y, 440, 20 + len/50 * 20);
						GPT3.setBounds(140, y, 50, 20 + length/50 * 20);	
						GPT3.setVisible(true);
					}
					if(current % 5 == 4) {
						Ans4.setBounds(200, y, 440, 20 + len/50 * 20);
						GPT4.setBounds(140, y, 50, 20 + length/50 * 20);
						GPT4.setVisible(true);
					}
					if(current % 5 == 0) {
						Ans5.setBounds(200, y, 440, 20 + len/50 * 20);
						GPT5.setBounds(140, y, 50, 20 + length/50 * 20);
						GPT5.setVisible(true);
					}
					
					int ms = y;
					
					data[numrecord] = 200;
					numrecord++;
					data[numrecord] = ms;
					numrecord++;
					data[numrecord] = 440;
					numrecord++;
					data[numrecord] =  20 + (int)(len/50 * 20);
					numrecord++;
					//JOptionPane.showMessageDialog(null, totalrecord);
				}
			
				y = y + (20 + len / 50 * 20) + 10;
				
				if(current % 5 == 1)
				{
					Ans1.setVisible(true);
					Ans1.setText(response.toString());
				}
				if(current % 5 == 2)
				{
					Ans2.setVisible(true);
					Ans2.setText(response.toString());
				}
				if(current % 5 == 3)
				{
					Ans3.setVisible(true);
					Ans3.setText(response.toString());
				}
				if(current % 5 == 4)
				{
					Ans4.setVisible(true);
					Ans4.setText(response.toString());
				}
				if(current % 5 == 0)
				{
					Ans5.setVisible(true);
					Ans5.setText(response.toString());
				}
				current++;
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Area full! Generate into a new page!");
				current = 1;
				currentpage++;
				
				y = 60;
				Ask_1.setVisible(false);
				Ask2.setVisible(false);
				Ask3.setVisible(false);
				Ask4.setVisible(false);
				Ask5.setVisible(false);
				Ans1.setVisible(false);
				Ans2.setVisible(false);
				Ans3.setVisible(false);
				Ans4.setVisible(false);
				Ans5.setVisible(false);
				GPT1.setVisible(false);
				GPT2.setVisible(false);
				GPT3.setVisible(false);
				GPT4.setVisible(false);
				GPT5.setVisible(false);
				Chat1.setVisible(false);
				Chat2.setVisible(false);
				Chat3.setVisible(false);
				Chat4.setVisible(false);
				btnYou.setVisible(false);
				pagerecord.setText(Integer.toString(currentpage));
			}
			
			}
			}
		});
		btnNewButton.setBounds(654, 497, 106, 57);
		panel.add(btnNewButton);
		
		InputBox = new JTextField();
		InputBox.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					StringBuffer m = new StringBuffer(InputBox.getText());
					if(!InputBox.getText().equals(""))
					{
						int length = m.length();
						if(length > 50) {
							 for(int i = 1; i <= length / 50; i++) {
								m.insert(i * 50, "\n");
							}
						}
					if(y + 20 + length / 50 * 20 < 380)
					{
						 conversation[talkrecord]= m.toString();
						 talkrecord++;
						 data[numrecord] = currentpage;
						 numrecord++;
						if(670 - length * 8.5 > 200)
						{
							if(current % 5 == 1)
							{
								Ask_1.setBounds((int)(670-length*8.5), y, (int)(length*8.5), 20 + length/50 * 20);
								Chat1.setBounds(675, y, 60, 20 + length/50 * 20);
								Chat1.setVisible(true);
							}
							if(current % 5 == 2)
							{
								Ask2.setBounds((int)(670-length*8.5), y, (int)(length*8.5), 20 + length/50 * 20);
								Chat2.setBounds(675, y, 60, 20 + length/50 * 20);
								Chat2.setVisible(true);
							}
							if(current % 5 == 3)
							{
								Ask3.setBounds((int)(670-length*8.5), y, (int)(length*8.5), 20 + length/50 * 20);
								Chat3.setBounds(675, y, 60, 20 + length/50 * 20);
								Chat3.setVisible(true);
							}
							if(current % 5 == 4)
							{
								Ask4.setBounds((int)(670-length*8.5), y, (int)(length*8.5), 20 + length/50 * 20);
								Chat4.setBounds(675, y, 60, 20 + length/50 * 20);
								Chat4.setVisible(true);
							}
							if(current % 5 == 0)
							{
								Ask5.setBounds((int)(670-length*8.5), y, (int)(length*8.5), 20 + length/50 * 20);
								btnYou.setBounds(675, y, 60, 20 + length/50 * 20);
								btnYou.setVisible(true);
							}
							int ms = y;
							
							data[numrecord] = (int)(670 - length * 8.5);
							numrecord++;
							data[numrecord] = ms;
							numrecord++;
							data[numrecord] = (int)(length * 8.5);
							numrecord++;
							data[numrecord] = 20 + (int)(length/50 * 20);
							numrecord++;
						//	JOptionPane.showMessageDialog(null, totalrecord);
						}
						else {
							if(current % 5 == 1)
							{
								Ask_1.setBounds(200, y, 550, 20 + length/50 * 20);
								Chat1.setBounds(675, y, 60, 20 + length/50 * 20);
								Chat1.setVisible(true);
							}
							if(current % 5 == 2)	
							{
								Ask2.setBounds(200, y, 550, 20 + length/50 * 20);
								Chat2.setBounds(675, y, 60, 20 + length/50 * 20);
								Chat2.setVisible(true);
							}
							if(current % 5 == 3)
							{
								Ask3.setBounds(200, y, 550, 20 + length/50 * 20);
								Chat3.setBounds(675, y, 60, 20 + length/50 * 20);
								Chat3.setVisible(true);
							}
							if(current % 5 == 4)
							{
								Ask4.setBounds(200, y, 550, 20 + length/50 * 20);
								Chat4.setBounds(675, y, 60, 20 + length/50 * 20);
								Chat4.setVisible(true);
							}
							if(current % 5 == 0)
							{
								Ask5.setBounds(200, y, 550, 20 + length/50 * 20);
								btnYou.setBounds(675, y, 60, 20 + length/50 * 20);
								btnYou.setVisible(true);
							}
							
							int ms = y;
							
							data[numrecord] = currentpage;
							numrecord++;
							data[numrecord] = 200;
							numrecord++;
							data[numrecord] = ms;
							numrecord++;
							data[numrecord] = 550;
							numrecord++;
							data[numrecord] = 20 + (int)(length/50 * 20);
							numrecord++;
					//		JOptionPane.showMessageDialog(null, totalrecord);
						}
						y = y + (20 + length / 50 * 20) + 10;
						
					if(current % 5 == 1)
					{
						Ask_1.setVisible(true);
						Ask_1.setText(m.toString());
					}
					if(current % 5 == 2)
					{
						Ask2.setVisible(true);
						Ask2.setText(m.toString());
					}
					if(current % 5 == 3)
					{
						Ask3.setVisible(true);
						Ask3.setText(m.toString());
					}
					if(current % 5 == 4)
					{
						Ask4.setVisible(true);
						Ask4.setText(m.toString());
					}
					if(current % 5 == 0)
					{
						Ask5.setVisible(true);
						Ask5.setText(m.toString());
					}
					InputBox.setText("");
					
					StringBuffer response = new StringBuffer("I am So Sorry. But As an AI Language Model. I cannot tell you about that.");
					int len = response.length();				
					if(len > 50) {
						 for(int i = 1; i <= len / 50; i++) {
							response.insert(i * 50, "\n");
						}
					}
					conversation[talkrecord] = response.toString();
					talkrecord++;
					data[numrecord] = currentpage;
					numrecord++;

					if(len * 8.5 < 440){
						if(current % 5 == 1) {
							Ans1.setBounds(200, y, (int)(len*8.5), 20 + len/50 * 20);
							GPT1.setBounds(140, y, 50, 20 + length/50 * 20);
							GPT1.setVisible(true);
						}
						if(current % 5 == 2)
						{
							Ans2.setBounds(200, y, (int)(len*8.5), 20 + len/50 * 20);
							GPT2.setBounds(140, y, 50, 20 + length/50 * 20);	
							GPT2.setVisible(true);
						}
						if(current % 5 == 3)
						{
							Ans3.setBounds(200, y, (int)(len*8.5), 20 + len/50 * 20);
							GPT3.setBounds(140, y, 50, 20 + length/50 * 20);
							GPT3.setVisible(true);
						}
						if(current % 5 == 4)
						{
							Ans4.setBounds(200, y, (int)(len*8.5), 20 + len/50 * 20);
							GPT4.setBounds(140, y, 50, 20 + length/50 * 20);
							GPT4.setVisible(true);
						}
						if(current % 5 == 0) {
							Ans5.setBounds(200, y, (int)(len*8.5), 20 + len/50 * 20);
							GPT5.setBounds(140, y, 50, 20 + length/50 * 20);
							GPT5.setVisible(true);
						}
						
						int ms = y;
						data[numrecord]  = 200;
						numrecord++;
						data[numrecord] = ms;
						numrecord++;
						data[numrecord] = (int)(len * 8.5);
						numrecord++;
						data[numrecord] = 20 + (int)(len/50 * 20);
						numrecord++;
						//JOptionPane.showMessageDialog(null, totalrecord);
					}
					else {
						if(current % 5 == 1) {
							Ans1.setBounds(200, y, 440, 20 + len/50 * 20);
							GPT1.setBounds(140, y, 50, 20 + length/50 * 20);
							GPT1.setVisible(true);
						}
						if(current % 5 == 2) {
							Ans2.setBounds(200, y, 440, 20 + len/50 * 20);
							GPT2.setBounds(140, y, 50, 20 + length/50 * 20);	
							GPT2.setVisible(true);
						}
						if(current % 5 == 3) {
							Ans3.setBounds(200, y, 440, 20 + len/50 * 20);
							GPT3.setBounds(140, y, 50, 20 + length/50 * 20);	
							GPT3.setVisible(true);
						}
						if(current % 5 == 4) {
							Ans4.setBounds(200, y, 440, 20 + len/50 * 20);
							GPT4.setBounds(140, y, 50, 20 + length/50 * 20);
							GPT4.setVisible(true);
						}
						if(current % 5 == 0) {
							Ans5.setBounds(200, y, 440, 20 + len/50 * 20);
							GPT5.setBounds(140, y, 50, 20 + length/50 * 20);
							GPT5.setVisible(true);
						}
						
						int ms = y;
						
						data[numrecord] = 200;
						numrecord++;
						data[numrecord] = ms;
						numrecord++;
						data[numrecord] = 440;
						numrecord++;
						data[numrecord] =  20 + (int)(len/50 * 20);
						numrecord++;
						//JOptionPane.showMessageDialog(null, totalrecord);
					}
				
					y = y + (20 + len / 50 * 20) + 10;
					
					if(current % 5 == 1)
					{
						Ans1.setVisible(true);
						Ans1.setText(response.toString());
					}
					if(current % 5 == 2)
					{
						Ans2.setVisible(true);
						Ans2.setText(response.toString());
					}
					if(current % 5 == 3)
					{
						Ans3.setVisible(true);
						Ans3.setText(response.toString());
					}
					if(current % 5 == 4)
					{
						Ans4.setVisible(true);
						Ans4.setText(response.toString());
					}
					if(current % 5 == 0)
					{
						Ans5.setVisible(true);
						Ans5.setText(response.toString());
					}
					current++;
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Area full! Generate into a new page!");
					current = 1;
					currentpage++;
					
					y = 60;
					Ask_1.setVisible(false);
					Ask2.setVisible(false);
					Ask3.setVisible(false);
					Ask4.setVisible(false);
					Ask5.setVisible(false);
					Ans1.setVisible(false);
					Ans2.setVisible(false);
					Ans3.setVisible(false);
					Ans4.setVisible(false);
					Ans5.setVisible(false);
					GPT1.setVisible(false);
					GPT2.setVisible(false);
					GPT3.setVisible(false);
					GPT4.setVisible(false);
					GPT5.setVisible(false);
					Chat1.setVisible(false);
					Chat2.setVisible(false);
					Chat3.setVisible(false);
					Chat4.setVisible(false);
					btnYou.setVisible(false);
					pagerecord.setText(Integer.toString(currentpage));
				}
				
				}
				}
			}
		});
		InputBox.setBounds(128, 508, 513, 35);
		panel.add(InputBox);
		InputBox.setColumns(10);
	
		
		JButton Clear = new JButton("Clear");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				y = 60;
				current = 1;
				currentpage = 1;
				pagerecord.setText(Integer.toString(currentpage));
				for(int j = 0; j <= talkrecord; j++) {
					conversation[talkrecord] = "";
				}
				for(int k = 0; k <= numrecord; k++) {
					data[numrecord] = -1;
					
				}
				talkrecord = 0;
				numrecord = 0;
				
				Ask_1.setVisible(false);
				Ask2.setVisible(false);
				Ask3.setVisible(false);
				Ask4.setVisible(false);
				Ask5.setVisible(false);
				Ans1.setVisible(false);
				Ans2.setVisible(false);
				Ans3.setVisible(false);
				Ans4.setVisible(false);
				Ans5.setVisible(false);
			}
		});
		Clear.setBounds(10, 171, 106, 40);
		panel.add(Clear);
		
		pagerecord = new JTextField();
		pagerecord.setEditable(false);
		pagerecord.setText("1");
		pagerecord.setBounds(227, 16, 191, 27);
		panel.add(pagerecord);
		pagerecord.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Previous Page");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				Ask_1.setVisible(false);
				Ask2.setVisible(false);
				Ask3.setVisible(false);
				Ask4.setVisible(false);
				Ask5.setVisible(false);
				Ans1.setVisible(false);
				Ans2.setVisible(false);
				Ans3.setVisible(false);
				Ans4.setVisible(false);
				Ans5.setVisible(false);
				Chat1.setVisible(false);
				Chat2.setVisible(false);
				Chat3.setVisible(false);
				Chat4.setVisible(false);
				btnYou.setVisible(false);
				GPT1.setVisible(false);
				GPT2.setVisible(false);
				GPT3.setVisible(false);
				GPT4.setVisible(false);
				GPT5.setVisible(false);
				
				if(currentpage >= 2) {
					currentpage--;
					pagerecord.setText(String.valueOf(currentpage));
				}
				int count = 0;
				for(int i = 0; i+5 <= numrecord; i+=5) {
					if(data[i] == currentpage) {
						count++;
						if(count == 1) {
							Ask_1.setVisible(true);
							Ask_1.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Chat1.setVisible(true);;
							Chat1.setBounds(675, data[i+2], 60, data[i+4]);
							Ask_1.setText(conversation[i/5]);
						}
						else if(count == 2) {
							Ans1.setVisible(true);
							Ans1.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							GPT1.setVisible(true);
							GPT1.setBounds(140, data[i+2], 50, data[i+4]);
							Ans1.setText(conversation[i/5]);
						}
						else if(count == 3) {
							Ask2.setVisible(true);
							Ask2.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Chat2.setVisible(true);;
							Chat2.setBounds(675, data[i+2], 60, data[i+4]);
							Ask2.setText(conversation[i/5]);
						}
						else if(count == 4) {
							Ans2.setVisible(true);
							Ans2.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							GPT2.setVisible(true);
							GPT2.setBounds(140, data[i+2], 50, data[i+4]);
							Ans2.setText(conversation[i/5]);
						}
						else if(count == 5) {
							Ask3.setVisible(true);
							Ask3.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Chat3.setVisible(true);;
							Chat3.setBounds(675, data[i+2], 60, data[i+4]);
							Ask3.setText(conversation[i/5]);
						}
						else if(count == 6) {
							Ans3.setVisible(true);
							Ans3.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							GPT3.setVisible(true);;
							GPT3.setBounds(140, data[i+2], 50, data[i+4]);
							Ans3.setText(conversation[i/5]);
						}
						else if(count == 7) {
							Ask4.setVisible(true);
							Ask4.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Chat4.setVisible(true);
							Chat4.setBounds(675, data[i+2], 60, data[i+4]);
							Ask4.setText(conversation[i/5]);
						}
						else if(count == 8) {
							Ans4.setVisible(true);
							Ans4.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							GPT4.setBounds(140, data[i+2], 50, data[i+4]);
							GPT4.setVisible(true);;
							Ans4.setText(conversation[i/5]);
						}
						else if(count == 9) {
							Ask5.setVisible(true);
							Ask5.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							btnYou.setBounds(675, data[i+2], 60, data[i+4]);
							btnYou.setVisible(true);
							Ask5.setText(conversation[i/5]);
						}
						else if(count == 10) {
					//		Ans5.setBounds(myRec[i].boundx, myRec[i].boundy, myRec[i].width, myRec[i].height);
						}

					}
				}
			}
		});
		btnNewButton_1.setBounds(10, 78, 106, 35);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Next Page");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentpage++;
				pagerecord.setText(String.valueOf(currentpage));
				
				Ask_1.setVisible(false);
				Ask2.setVisible(false);
				Ask3.setVisible(false);
				Ask4.setVisible(false);
				Ask5.setVisible(false);
				Ans1.setVisible(false);
				Ans2.setVisible(false);
				Ans3.setVisible(false);
				Ans4.setVisible(false);
				Ans5.setVisible(false);
				GPT1.setVisible(false);
				GPT2.setVisible(false);
				GPT3.setVisible(false);
				GPT4.setVisible(false);
				GPT5.setVisible(false);
				Chat1.setVisible(false);
				Chat2.setVisible(false);
				Chat3.setVisible(false);
				Chat4.setVisible(false);
				btnYou.setVisible(false);
				
				
				int count = 0;
				for(int i = 0; i+5 <= numrecord; i+=5) {
					if(data[i] == currentpage) {
						count++;
						if(count == 1) {
							Ask_1.setVisible(true);
							Ask_1.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ask_1.setText(conversation[i/5]);
						}
						else if(count == 2) {
							Ans1.setVisible(true);
							Ans1.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ans1.setText(conversation[i/5]);
						}
						else if(count == 3) {
							Ask2.setVisible(true);
							Ask2.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ask2.setText(conversation[i/5]);
						}
						else if(count == 4) {
							Ans2.setVisible(true);
							Ans2.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ans2.setText(conversation[i/5]);
						}
						else if(count == 5) {
							Ask3.setVisible(true);
							Ask3.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ask3.setText(conversation[i/5]);
						}
						else if(count == 6) {
							Ans3.setVisible(true);
							Ans3.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ans3.setText(conversation[i/5]);
						}
						else if(count == 7) {
							Ask4.setVisible(true);
							Ask4.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ask4.setText(conversation[i/5]);
						}
						else if(count == 8) {
							Ans4.setVisible(true);
							Ans4.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ans4.setText(conversation[i/5]);
						}
						else if(count == 9) {
							Ask5.setVisible(true);
							Ask5.setBounds(data[i+1], data[i+2], data[i+3], data[i+4]);
							Ask5.setText(conversation[i/5]);
						}
						else if(count == 10) {
					//		Ans5.setBounds(myRec[i].boundx, myRec[i].boundy, myRec[i].width, myRec[i].height);
						}

					}
				}
				
				
			}
		});
		
		
		btnNewButton_1_1.setBounds(10, 123, 106, 38);
		panel.add(btnNewButton_1_1);
		
		JLabel pagerec = new JLabel("Currently at: ");
		pagerec.setBounds(139, 6, 127, 46);
		panel.add(pagerec);
		
		JButton btnNewButton_2 = new JButton("Open Notice");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Notification Open Successfully!");
				open = true;
				 TimerTask tasknew = new TimerTask() {
					 public void run() {
						if(open == true)
						{
							 try {
									Notification.sendNotification("NitexStudio", "Please remember to save water!", MessageType.NONE);
								} catch (MalformedURLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								} catch (AWTException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
						}
					 }
				 };
			      Timer timer = new Timer();

			      // scheduling the task at fixed rate delay
			      timer.scheduleAtFixedRate(tasknew,6000,12000); 
				
			     
			}
			
		
		});
		btnNewButton_2.setBounds(10, 295, 106, 40);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Close Notice");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Notification has been closed!");
				open = false;
			}
		});
		btnNewButton_2_1.setBounds(10, 352, 106, 47);
		panel.add(btnNewButton_2_1);
		
		JButton btnNewButton_3 = new JButton("Personality");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 CardLayout c = (CardLayout) frame.getContentPane().getLayout();
				 c.show(frame.getContentPane(), "panel_1");
			}
		});
		btnNewButton_3.setBounds(10, 227, 106, 47);
		panel.add(btnNewButton_3);
		
		JTextArea txtrSustainAi = new JTextArea();
		txtrSustainAi.setEditable(false);
		txtrSustainAi.setBackground(Color.ORANGE);
		txtrSustainAi.setText("THE SUSTAIN AI");
		txtrSustainAi.setBounds(0, 0, 127, 569);
		panel.add(txtrSustainAi);
		
		JLabel lblNewLabel_1 = new JLabel("SUSTAIN AI");
		lblNewLabel_1.setBounds(10, 23, 45, 13);
		panel.add(lblNewLabel_1);
			
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "panel_1");
		panel_1.setLayout(null);
		
		VerifyBot = new JTextField();
		VerifyBot.setColumns(10);
		VerifyBot.setBounds(194, 421, 505, 19);
		panel_1.add(VerifyBot);
	
		JComboBox susBox = new JComboBox();
		susBox.setModel(new DefaultComboBoxModel(new String[] {"yes", "no", "does not prefer to say"}));
		susBox.setBounds(194, 42, 505, 21);
		panel_1.add(susBox);
		
		JComboBox outdoor = new JComboBox();
		outdoor.setModel(new DefaultComboBoxModel(new String[] {"Outdoor", "indoor", "no preference"}));
		outdoor.setBounds(194, 92, 505, 21);
		panel_1.add(outdoor);
		
		JComboBox introBox = new JComboBox();
		introBox.setModel(new DefaultComboBoxModel(new String[] {"Introvert", "Extrovert"}));
		introBox.setBounds(194, 154, 505, 21);
		panel_1.add(introBox);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(194, 308, 505, 20);
		panel_1.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(194, 363, 505, 20);
		panel_1.add(spinner_1);
		
		
		JButton btnNewButton_4 = new JButton("Save");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 if(!VerifyBot.getText().equals("1"))
			 {
				 JOptionPane.showMessageDialog(null, "Security Question Wrong! You are a bot!");
				 CardLayout c = (CardLayout) frame.getContentPane().getLayout();
				 c.show(frame.getContentPane(), "panel");
			 }
			 else {
				JOptionPane.showMessageDialog(null, "Update successfully!");
				lovesus = (String) susBox.getSelectedItem();
				outofin = (String) outdoor.getSelectedItem();
				introextro = (String) introBox.getSelectedItem();
				hourperevent = (int) spinner.getValue();
				eventpermonth = (int) spinner_1.getValue();
				//likeevent = "";
				importantsustainable = "";
				 CardLayout c = (CardLayout) frame.getContentPane().getLayout();
				 c.show(frame.getContentPane(), "panel");
			 }
			}
		});
		btnNewButton_4.setBounds(278, 498, 176, 46);
		panel_1.add(btnNewButton_4);
		
		
		JLabel lblNewLabel = new JLabel("1. Do you like Sustainability?");
		lblNewLabel.setBounds(22, 46, 147, 13);
		panel_1.add(lblNewLabel);
		
		JLabel lblDoYou = new JLabel("2. Do you enjoy outdoor or indoor?");
		lblDoYou.setBounds(20, 96, 197, 13);
		panel_1.add(lblDoYou);
	
		
		JLabel lblAreYou = new JLabel("3. Are you an Introvert or extrovert?");
		lblAreYou.setBounds(0, 158, 197, 13);
		panel_1.add(lblAreYou);
		
		JLabel lblDescribeAn = new JLabel("4. Describe an event you like");
		lblDescribeAn.setBounds(20, 207, 197, 13);
		panel_1.add(lblDescribeAn);
		
		textField = new JTextField();
		textField.setBounds(194, 204, 505, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblDescribeAn_1 = new JLabel("5. Describe an important sustainability issue");
		lblDescribeAn_1.setBounds(0, 253, 197, 13);
		panel_1.add(lblDescribeAn_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(194, 250, 505, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDescribeAn_1_1 = new JLabel("Hours willing to spend per activity");
		lblDescribeAn_1_1.setBounds(22, 311, 197, 13);
		panel_1.add(lblDescribeAn_1_1);
		
		JLabel lblDescribeAn_1_1_1 = new JLabel("Number of activities per month");
		lblDescribeAn_1_1_1.setBounds(22, 366, 197, 13);
		panel_1.add(lblDescribeAn_1_1_1);
		
		JLabel lblavoidBotWhat = new JLabel("(Avoid Bot) What is sin(90 deg)?");
		lblavoidBotWhat.setBounds(22, 424, 197, 13);
		panel_1.add(lblavoidBotWhat);
		
		
}
}