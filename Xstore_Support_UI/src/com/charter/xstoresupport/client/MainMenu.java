package com.charter.xstoresupport.client;

/*package com.charter.xstoresupport.client;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.charter.xstoresupport.bo.Bo;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void mainMenu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	/*public MainMenu() {setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Capture.JPG"));
	setTitle("XstoreSuportUtility");
	date();
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(0, 0, 1370, 755);
	contentPane = new JPanel();
	contentPane.setBackground(new Color(100, 149, 237));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	
	
	Button tillissue = new Button("TILL ISSUE");
	
	tillissue.setBounds(0, 50, 269, 85);
	tillissue.setForeground(Color.WHITE);
	tillissue.setBackground(new Color(128, 128, 128));
	contentPane.add(tillissue);
	
	Button bdissuebtn = new Button("BUSSINESS DATE ISSUE");
	bdissuebtn.setBounds(0, 135, 269, 85);
	bdissuebtn.setForeground(Color.WHITE);
	bdissuebtn.setBackground(new Color(128, 128, 128));
	
	contentPane.add(bdissuebtn);
	
	Button stbank = new Button("STORE BANK ISSUE");
	stbank.setBounds(0, 221, 269, 85);
	stbank.setForeground(Color.WHITE);
	stbank.setBackground(new Color(128, 128, 128));
	contentPane.add(stbank);
	
	Button countbt = new Button("COUNT ISSUE");
	countbt.setBounds(0, 306, 269, 85);
	countbt.setForeground(Color.WHITE);
	countbt.setBackground(new Color(128, 128, 128));
	contentPane.add(countbt);
	
	Button bktadjbt = new Button("BUCKET ADJUSTMENT");
	bktadjbt.setBounds(0, 391, 269, 93);
	bktadjbt.setForeground(Color.WHITE);
	bktadjbt.setBackground(new Color(128, 128, 128));
	contentPane.add(bktadjbt);
	
	Button delasnbutton = new Button("Delete ASN");
	delasnbutton.setForeground(Color.WHITE);
	delasnbutton.setBackground(Color.GRAY);
	delasnbutton.setBounds(0, 476, 269, 80);
	contentPane.add(delasnbutton);
		Bo b=new Bo();
		JLabel nval = new JLabel(b.name);
		nval.setBounds(882, 21, 80, 14);
		contentPane.add(nval);
		
		
		

	}


		public void date() {
			Date d=new Date();
			JLabel lblDate = new JLabel("Date :");
			SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-YYYY");
			lblDate.setText(sdf.format(d));
		}

		
	}
*/
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.logging.Level;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.charter.xstoresupport.Database.VerifyStoreNumber;
import com.charter.xstoresupport.bo.Bo;
import com.xstoresupport.services.GenerateMntFile;
import com.xstoresupport.services.MyLogger;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class MainMenu extends JFrame {
	
	public static JLabel statuslabel;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void mainMenu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
				    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				    frame.setSize(screenSize.width, screenSize.height);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	JLabel lblDate = new JLabel("Date :");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField wrkstnid;
	private JTextField sts;
	

	public void date() {
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-YYYY");
		lblDate.setText(sdf.format(d));
	}


	
	public  MainMenu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Capture.JPG"));
		setTitle("XstoreSuportUtility");
		date();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1370, 755);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		Button tillissue = new Button("TILL ISSUE");
		
		tillissue.setBounds(0, 50, 269, 85);
		tillissue.setForeground(Color.WHITE);
		tillissue.setBackground(new Color(128, 128, 128));
		contentPane.add(tillissue);
		
		Button bdissuebtn = new Button("BUSINESS DATE ISSUE");
		bdissuebtn.setBounds(0, 135, 269, 85);
		bdissuebtn.setForeground(Color.WHITE);
		bdissuebtn.setBackground(new Color(128, 128, 128));
		
		contentPane.add(bdissuebtn);
		
		Button stbank = new Button("STORE BANK ISSUE");
		stbank.setBounds(0, 221, 269, 85);
		stbank.setForeground(Color.WHITE);
		stbank.setBackground(new Color(128, 128, 128));
		contentPane.add(stbank);
		
		Button countbt = new Button("COUNT ISSUE");
		countbt.setBounds(0, 306, 269, 85);
		countbt.setForeground(Color.WHITE);
		countbt.setBackground(new Color(128, 128, 128));
		contentPane.add(countbt);
		
		Button bktadjbt = new Button("BUCKET ADJUSTMENT");
		bktadjbt.setBounds(0, 391, 269, 93);
		bktadjbt.setForeground(Color.WHITE);
		bktadjbt.setBackground(new Color(128, 128, 128));
		contentPane.add(bktadjbt);
		
		Button delasnbutton = new Button("DELETE ASN");
		delasnbutton.setForeground(Color.WHITE);
		delasnbutton.setBackground(Color.GRAY);
		delasnbutton.setBounds(0, 476, 269, 80);
		contentPane.add(delasnbutton);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(0, 562, 634, 85);
		panel_1.setBackground(new Color(204, 153, 0));
		contentPane.add(panel_1);
		
		  statuslabel = new JLabel(" ");
		statuslabel.setText("");
		statuslabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		statuslabel.setHorizontalAlignment(SwingConstants.CENTER);
		statuslabel.setForeground(Color.RED);
		statuslabel.setBackground(Color.RED);
		statuslabel.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_1.add(statuslabel);
		
		
		Panel panel_2 = new Panel();
		panel_2.setBounds(0, 651, 494, 80);
		panel_2.setBackground(new Color(154, 205, 50));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		Label label = new Label("USER NAME :");
		label.setBounds(10, 22, 73, 22);
		panel_2.add(label);
		
		Label label_8 = new Label("");
		label_8.setBounds(82, 22, 63, 22);
		panel_2.add(label_8);
		
		
		//Label.setBounds();
		
		Panel panel_3 = new Panel();
		panel_3.setBounds(656, 649, 706, 67);
		panel_3.setBackground(new Color(0, 0, 255));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		Label label_4 = new Label("PID");
		label_4.setBounds(499, 21, 29, 22);
		panel_3.add(label_4);
		
		Label label_5 = new Label("");
		label_5.setBounds(531, 21, 62, 22);
		panel_3.add(label_5);
		
		
		
		Panel panel_4 = new Panel();
		panel_4.setBounds(492, 648, 166, 68);
		panel_4.setBackground(new Color(0, 0, 0));
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		lblDate.setForeground(Color.WHITE);
		lblDate.setBounds(30, 16, 98, 35);
		panel_4.add(lblDate);
		
		Panel panel_5 = new Panel();
		panel_5.setBounds(0, 0, 1350, 51);
		panel_5.setBackground(new Color(204, 153, 0));
		contentPane.add(panel_5);
		
		Label label_3 = new Label("Retail Sols-Xstore Support Utility");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Dialog", Font.BOLD, 36));
		panel_5.add(label_3);		
		
		Panel panel_6 = new Panel();
		panel_6.setForeground(new Color(255, 255, 255));
		panel_6.setBounds(337, 82, 706, 349);
		contentPane.add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		CardLayout cardlyout=(CardLayout)panel_6.getLayout();
		
	
		Panel tillpanel = new Panel();
		tillpanel.setLayout(null);
		panel_6.add(tillpanel, "till");
		
		//JLabel lblStoreNumber = new JLabel("Store Number");
		//lblStoreNumber.setBounds(213, 86, 93, 28);
		//tillpanel.add(lblStoreNumber);
		
		//textField_2 = new JTextField();
		//textField_2.setBounds(344, 90, 86, 20);
		//tillpanel.add(textField_2);
		//textField_2.setColumns(10);
		
		//JLabel lblTillNo = new JLabel("TIll NO");
		//lblTillNo.setBounds(223, 125, 46, 14);
		//tillpanel.add(lblTillNo);
		
		//textField_3 = new JTextField();
		//textField_3.setBounds(344, 122, 86, 20);
	//	tillpanel.add(textField_3);
		//textField_3.setColumns(10);
		
		//JLabel lblwkstnid = new JLabel("wrkstnid");
		//lblwkstnid.setBounds(213, 86, 93, 28);
		//tillpanel.add(lblwkstnid);
		
		//wrkstnid = new JTextField();
		//wrkstnid.setBounds(344, 90, 86, 20);
		//tillpanel.add(wrkstnid);
		//wrkstnid.setColumns(10);
		
	//	JLabel status = new JLabel("status");
		//status.setBounds(213, 86, 93, 28);
	//	tillpanel.add(status);
		
		//sts = new JTextField();
	//	status.setBounds(344, 90, 86, 20);
		//tillpanel.add(sts);
		//wrkstnid.setColumns(10);
		
		Label lblStoreNumber = new Label("STORE NO");
		lblStoreNumber.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblStoreNumber.setBounds(249, 66, 78, 22);
		tillpanel.add(lblStoreNumber);
		
		JTextField stno = new JTextField();
		stno.setBounds(333, 66, 87, 22);
		stno.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		    	  char caracter = e.getKeyChar();
		        if (stno.getText().length() >= 4 ) {
		            e.consume();
		            }
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {
                    e.consume();
                }
		    }  
		});
		
		tillpanel.add(stno);
		
		Label lblTillNo = new Label("TILL NO");
		lblTillNo.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblTillNo.setBounds(249, 99, 61, 22);
		tillpanel.add(lblTillNo);
		
		JTextField tillno = new JTextField();
		tillno.setBounds(333, 99, 87, 22);
		tillno.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) 
			{
			char keyChar = e.getKeyChar();
		    if (Character.isLowerCase(keyChar)) 
			 {
		    	e.setKeyChar(Character.toUpperCase(keyChar));
			 }
			 if (tillno.getText().length() >= 6 ) 
			 {
			    e.consume();
			  }
			  if (!Character.isLetterOrDigit(keyChar)) 
			  {
			    e.consume();
			   }
			 }

		});
		tillpanel.add(tillno);
		
		Label wrkstnid = new Label("WRSTNID");
		wrkstnid.setFont(new Font("Dialog", Font.PLAIN, 13));
		wrkstnid.setBounds(249, 132, 73, 22);
		
		tillpanel.add(wrkstnid);
		
		JTextField wkstnid = new JTextField();
		wkstnid.setBounds(333, 132, 87, 22);
		wkstnid.addKeyListener(new KeyAdapter() 
		{
		public void keyTyped(KeyEvent e) { 
		char keyChar = e.getKeyChar();
		 if (Character.isLowerCase(keyChar)) 
		 {
			e.setKeyChar(Character.toUpperCase(keyChar));
		  }
		  if (wkstnid.getText().length() >= 3 ) 
		  {
		    e.consume(); 
		   }
		   if (!Character.isLetterOrDigit(keyChar)) 
		   {
	        e.consume();
	       }
	     }  
	    });
		tillpanel.add(wkstnid);
		
		Label status = new Label("STATUS");
		status.setFont(new Font("Dialog", Font.PLAIN, 14));
		status.setBounds(249, 165, 61, 22);
		tillpanel.add(status);
		
		JComboBox<Object> comboBox;
		String[] str = { " ", "UNCOUNTED", "BEGINCOUNT", "ENDCOUNT" };
		comboBox = new JComboBox<Object>(str);
		comboBox.setBounds(333, 165, 87, 20);
		tillpanel.add(comboBox);
		JButton btnProcess = new JButton("Process");
		btnProcess.setBounds(331, 196, 89, 23);
		tillpanel.add(btnProcess);
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyLogger.log(Level.INFO, "Clicked on Process Button");
				String store_number = stno.getText();
			   String  reg_number =tillno.getText();
			String	 till_number= wkstnid.getText();
			  String   status = (String) comboBox.getSelectedItem();
			     //validation for entering the store values
			
					
						if ( store_number.isEmpty() || reg_number.isEmpty() || till_number.isEmpty() || status.equals(str[0])) {
							 //JOptionPane.showMessageDialog(tillpanel,"Please Enter Input Values");
							 
							 statuslabel.setText(" Enter Input Values");
								MyLogger.log(Level.INFO, "ERROR:Enter Input Values");
							
						}else
									try {
										if(VerifyStoreNumber.validteStore(store_number)) {
										 GenerateMntFile gm = new GenerateMntFile();
										  Bo b=new Bo();
										  b.setTsno(stno.getText());
										  stno.setText(" ");
										  b.setTtno(tillno.getText());
										 tillno.setText(" ");
										  b.setTwid(wkstnid.getText());
										  wkstnid.setText(" ");
										  b.setTsts(status);
										  
										  MyLogger.log(Level.INFO, "The values you entered for till issue is store_id:"+b.getTsno()+" "+ "tillno: " +b.getTtno()+" "+ "workstation:" +b.getTwid()+ " status:" +b.getTsts()+"");
										  gm.tillMnt(b);
										
										
}else 
										statuslabel.setText(" Invalid Store Number");
									} catch (SQLException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
						    	
					    	
				  
				
			
			}			
		});
		
		
		
		
		//JButton btnProcess = new JButton("Process");
		//btnProcess.setBounds(327, 182, 89, 23);
		//tillpanel.add(btnProcess);
		
		
		Panel businessdatepanel = new Panel();
		businessdatepanel.setLayout(null);
		panel_6.add(businessdatepanel, "businessdate");
		
		//Label label_1 = new Label("Store Number");
		//businessdatepanel.add(label_1);
		
		//TextField textField_4 = new TextField();
		//businessdatepanel.add(textField_4);
		
		
		Label label_1 = new Label("STORE NO :");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_1.setBounds(249, 66, 78, 22);
		businessdatepanel.add(label_1);
		
		JTextField bsno = new JTextField();
		bsno.setBounds(333, 66, 87, 22);
		businessdatepanel.add(bsno);
		bsno.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		    	  char caracter = e.getKeyChar();
		        if (bsno.getText().length() >= 4 ) {
		            e.consume();
		            }
              if (((caracter < '0') || (caracter > '9'))
                      && (caracter != '\b')) {
                  e.consume();
              }
		    }  
		});
		
		
		//Label label_9 = new Label("Store Number");
		//label_9.setBounds(206, 52, 85, 22);
		//businessdatepanel.add(label_9);
		
		//TextField textField_5 = new TextField();
		//textField_5.setBounds(297, 52, 96, 22);
		//businessdatepanel.add(textField_5);
		
		//Label label_10 = new Label("Wrong Date");
		//label_10.setBounds(206, 96, 85, 22);
		//businessdatepanel.add(label_10);
		
		//TextField textField_6 = new TextField();
		//textField_6.setBounds(297, 96, 96, 22);
		//businessdatepanel.add(textField_6);
		
		Label lblbnsdt = new Label("WRONG    :");
		lblbnsdt.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblbnsdt.setBounds(249, 99, 61, 22);
		businessdatepanel.add(lblbnsdt);
		
		
		
		
		JTextField wngdt = new JTextField();
		wngdt.setBounds(333, 99, 87, 22);
		businessdatepanel.add(wngdt);
		
		//Label label_11 = new Label("Correct Date");
		//label_11.setBounds(206, 139, 85, 22);
		//businessdatepanel.add(label_11);
		
		//TextField textField_7 = new TextField();
		//textField_7.setBounds(297, 139, 96, 22);
		//businessdatepanel.add(textField_7);
		
		Label lblctdt = new Label("CURRENT :");
		lblctdt.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblctdt.setBounds(249, 132, 73, 22);
		
		businessdatepanel.add(lblctdt);
		
		
		JTextField ctdt = new JTextField();
		ctdt.setBounds(333, 132, 87, 22);
		businessdatepanel.add(ctdt);
		
		JButton btnNewButton = new JButton("Process");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
					
					
				String bstn=bsno.getText();
				String wrgdt=wngdt.getText();
				String crtdt=ctdt.getText();
				if(bstn.isEmpty() || wrgdt.isEmpty() || crtdt.isEmpty()) {
					statuslabel.setText("Enter Input Values");
					
				}else {
					try {
						if(VerifyStoreNumber.validteStore(bstn)) {
							
							Bo b=new Bo();
							GenerateMntFile gm=new GenerateMntFile();
							b.setBdtsno(bsno.getText());
							bsno.setText(" ");
							b.setBdtwrgdt(wngdt.getText());
							wngdt.setText(" ");
							b.setBdtrstdt(ctdt.getText());
							ctdt.setText(" ");
							gm.businessDateMnt(b);
						}else {
							statuslabel.setText(" Invalid Store Number");
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		btnNewButton.setBounds(333, 165, 87, 20);
		businessdatepanel.add(btnNewButton);
		
		Panel countpannel = new Panel();
		countpannel.setLayout(null);
		panel_6.add(countpannel, "count");
		
		Label label_2 = new Label("Count Issue");
		countpannel.add(label_2);
		
		//Label label_18 = new Label("Store Number");
		//label_18.setBounds(188, 47, 74, 22);
		//countpannel.add(label_18);
		
	//	TextField textField_15 = new TextField();
	//	textField_15.setBounds(280, 47, 89, 22);
		//countpannel.add(textField_15);
		
		Label csno = new Label("STORE NO :");
		csno.setFont(new Font("Dialog", Font.PLAIN, 12));
		csno.setBounds(249, 66, 78, 22);
		countpannel.add(csno);
		
		JTextField csn = new JTextField();
		csn.setBounds(333, 66, 87, 22);
		countpannel.add(csn);
		csn.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		    	  char caracter = e.getKeyChar();
		        if (csn.getText().length() >= 4 ) {
		            e.consume();
		            }
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {
                    e.consume();
                }
		    }  
		});
		
		//Label label_19 = new Label("Count ID");
		//label_19.setBounds(200, 108, 62, 22);
		//countpannel.add(label_19);
		
		//TextField textField_16 = new TextField();
		//textField_16.setBounds(280, 108, 89, 22);
		//countpannel.add(textField_16);
		
		Label lblbncid = new Label("COUNT ID:");
		lblbncid.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblbncid.setBounds(249, 99, 61, 22);
		countpannel.add(lblbncid);
		
		JTextField txtcid = new JTextField();
		txtcid.setBounds(333, 99, 87, 22);
		countpannel.add(txtcid);
		
		JButton cbtn = new JButton("Process");
		cbtn.setBounds(333, 132, 87, 22);
		countpannel.add(cbtn);
		cbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyLogger.log(Level.INFO, "Cliked on Processs Button");
				String cst = csn.getText();
			   String  countid =txtcid.getText();
			
			     //validation for entering the store values
			    
				if ( cst.isEmpty() || countid.isEmpty() ) {
				 
					// JOptionPane.showMessageDialog(countpannel,"Please Enter Input Values");
					 statuslabel.setText(" Enter Input Values");
					 MyLogger.log(Level.INFO, "ERROR:Enter Input Values");
					 
				}
			    else{
			    	try {
						if(VerifyStoreNumber.validteStore(cst)) {
							
							GenerateMntFile gm = new GenerateMntFile();
							  Bo b=new Bo();
							  b.setCsno(csn.getText());
							  csn.setText(" ");
							  b.setCid(txtcid.getText());
							  txtcid.setText(" ");
							  MyLogger.log(Level.INFO, "The values you entered for count issue is store_id :"+b.getCsno()+"cout_id: "+b.getCid());
							  gm.countMnt(b);
						}else {
							statuslabel.setText(" Invalid Store Number");
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
			    	 
					  
				  } 	
			}			
		});
		
		Panel storebankpannel = new Panel();
		storebankpannel.setLayout(null);
		panel_6.add(storebankpannel, "storebank");
		
		//Label label_6 = new Label("Store Number");
		//label_6.setBounds(190, 38, 81, 22);
		//storebankpannel.add(label_6);
		
		
		//JTextField strbnk = new JTextField();
		//strbnk.setBounds(277, 38, 89, 22);
		
		//storebankpannel.add(strbnk);

		Label label_6 = new Label("STORE NO");
		label_6.setFont(new Font("Dialog", Font.PLAIN, 13));
		label_6.setBounds(249, 66, 78, 22);
		storebankpannel.add(label_6);
		
		JTextField strbnk = new JTextField();	
		strbnk.setBounds(333, 66, 87, 22);
		storebankpannel.add(strbnk);
		strbnk.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		    	  char caracter = e.getKeyChar();
		        if (strbnk.getText().length() >=4 ) 
		        {
		            e.consume();
		            }
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {
                    e.consume();
                }
		    }  
		});

		
		JButton stbnkbtn = new JButton("Process");
		stbnkbtn.setBounds(333, 99, 87, 22);
		
		storebankpannel.add(stbnkbtn);
		

		
		Panel bucketadjpannel = new Panel();
		bucketadjpannel.setLayout(null);
		panel_6.add(bucketadjpannel, "bucketadj");
		
		Label label_7 = new Label("Bucket Adjustment Issue");
		bucketadjpannel.add(label_7);
		
		Label label_14 = new Label("Store Number");
		label_14.setBounds(230, 66, 80, 22);
		bucketadjpannel.add(label_14);
		
		TextField textField_11 = new TextField();
		textField_11.setBounds(333, 66, 87, 22);
		bucketadjpannel.add(textField_11);
		
		Label label_15 = new Label("SKU");
		label_15.setBounds(257, 112, 35, 22);
		bucketadjpannel.add(label_15);
		
		TextField textField_12 = new TextField();
		textField_12.setBounds(333, 112, 87, 22);
		bucketadjpannel.add(textField_12);
		
		Label label_16 = new Label("IMEI");
		label_16.setBounds(257, 146, 35, 22);
		bucketadjpannel.add(label_16);
		
		TextField textField_13 = new TextField();
		textField_13.setBounds(333, 146, 87, 22);
		bucketadjpannel.add(textField_13);
		
		Label label_17 = new Label("Bcket");
		label_17.setBounds(251, 176, 41, 22);
		bucketadjpannel.add(label_17);
		
		TextField textField_14 = new TextField();
		textField_14.setBounds(329, 176, 91, 22);
		bucketadjpannel.add(textField_14);
		
		JButton btnNewButton_3 = new JButton("Process");
		btnNewButton_3.setBounds(317, 236, 89, 23);
		bucketadjpannel.add(btnNewButton_3);
		
		Panel delasn = new Panel();
		delasn.setLayout(null);
		panel_6.add(delasn, "delasn");
		
		//Label label_12 = new Label("Store Number");
		//label_12.setBounds(212, 52, 80, 22);
		//delasn.add(label_12);
		
		//TextField textField_8 = new TextField();
		//textField_8.setBounds(309, 52, 89, 22);
		//delasn.add(textField_8);
		
		//Label label_13 = new Label("ASN Document Number");
		//label_13.setBounds(167, 93, 116, 22);
		//delasn.add(label_13);
		
		//TextField dstno = new TextField();
		//textField_9.setBounds(309, 93, 89, 22);
		//delasn.add(textField_9);
		
		//JButton btnNewButton_1 = new JButton("Process");
		//btnNewButton_1.setBounds(244, 162, 89, 23);
		//delasn.add(btnNewButton_1);
		
		Label dstno = new Label("STORE NO :");
		dstno.setFont(new Font("Dialog", Font.PLAIN, 12));
		dstno.setBounds(249, 66, 78, 22);
		delasn.add(dstno);
		
		JTextField dstn = new JTextField();
		dstn.setBounds(333, 66, 87, 22);
		delasn.add(dstn);
		dstn.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		    	  char caracter = e.getKeyChar();
		        if (dstn.getText().length() >=4 ) 
		        {
		            e.consume();
		            }
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {
                    e.consume();
                }
		    }  
		});

		
		//Label label_19 = new Label("Count ID");
		//label_19.setBounds(200, 108, 62, 22);
		//countpannel.add(label_19);
		
		//TextField textField_16 = new TextField();
		//textField_16.setBounds(280, 108, 89, 22);
		//countpannel.add(textField_16);
		
		Label lbldsid = new Label("ASN ID:");
		lbldsid.setFont(new Font("Dialog", Font.PLAIN, 12));
		lbldsid.setBounds(249, 99, 61, 22);
		delasn.add(lbldsid);
		
		
		JTextField txtdid = new JTextField();
		txtdid.setBounds(333, 99, 87, 22);
		txtdid.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) 
			{
			char keyChar = e.getKeyChar();
		    if (Character.isLowerCase(keyChar)) 
			 {
		    	e.setKeyChar(Character.toUpperCase(keyChar));
			 }
			 if (tillno.getText().length() >= 6 ) 
			 {
			    e.consume();
			  }
			  if (!Character.isLetterOrDigit(keyChar)) 
			  {
			    e.consume();
			   }
			 }

		});
		delasn.add(txtdid);
		
		JButton dasnbtn = new JButton("Process");
		dasnbtn.setBounds(333, 132, 87, 22);
		delasn.add(dasnbtn);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(630, 562, 720, 85);
		contentPane.add(panel);
		dasnbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MyLogger.log(Level.INFO, "Cliked on Processs Button");
				String dasn=dstn.getText();
				String asid=txtdid.getText();
				String errormsg="Enter Input Values";
				//if(validateField(strbnk, errormsg)) {
				
					
					if(dasn.isEmpty() || asid.isEmpty()) {
						//JOptionPane.showMessageDialog(dasnbtn, errormsg);
						statuslabel.setText(" Enter Input Values");
						MyLogger.log(Level.INFO, "ERROR: Enter Input Values");
					}else {
						try {
							if(VerifyStoreNumber.validteStore(dasn)) {
								
								Bo b=new Bo();
								b.setDsno(dstn.getText());
								dstn.setText(" ");
								b.setDasnid(txtdid.getText());
								txtdid.setText(" ");
								GenerateMntFile gm=new GenerateMntFile();
								//MyLogger.log(Level.INFO, "The values entered for delete ASN is store_number:"+b.getDsno()+" ID");
								gm.dAsnMnt(b);
							}else {
								statuslabel.setText(" Invalid Store Number");
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					
				
				}

	
				
				
			
				
		//statuslabel.setVisible(false);
				
				//System.out.println(b.getBnkstnbr());
			
			
		});
		

		
		
		
		tillissue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MyLogger.log(Level.INFO, "Till Issue Button is Selected");
				statuslabel.setText("Selected Till Issue");
				
				cardlyout.show(panel_6, "till");
				
			}
		});
		bdissuebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MyLogger.log(Level.INFO, "Business Date Issue Button is Selected");
				statuslabel.setText(" Selected Business Date Issue");
				cardlyout.show(panel_6, "businessdate");
				
			}
		});
		stbank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				
				 MyLogger.log(Level.INFO, "Store Bank Issue Button is selected ");
				 statuslabel.setText(" Selected Store Bank Issue");
				stbnkbtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						String str=strbnk.getText();
						String errormsg="Enter Input Values";
						//if(validateField(strbnk, errormsg)) 
							if(str.isEmpty()) {
								//JOptionPane.showMessageDialog(storebankpannel, errormsg);
								statuslabel.setText(" Enter Input Values");
								MyLogger.log(Level.INFO, "ERROR :Enter Input Values");
							} else
								try {
									if(VerifyStoreNumber.validteStore(str)) {
										
											Bo b=new Bo();
											b.setBnkstnbr(strbnk.getText());
											strbnk.setText(" ");
											MyLogger.log(Level.INFO, "store_number:"+b.getBnkstnbr()+"");
											GenerateMntFile gm=new GenerateMntFile();
											//statuslabel.setText("mnt generated");
											gm.genMnt(b);
											
										}else {
											//JOptionPane.showMessageDialog(storebankpannel, "Enter Four Digit Number Between 1000 to 7079 ");
											statuslabel.setText(" Invalid Store Number ");
											MyLogger.log(Level.INFO, "ERROR :you entered the store is invalid");
										}
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
									
								
								
							
								
								
							//}



						
					}
						
						//statuslabel.setVisible(false);
						
						//System.out.println(b.getBnkstnbr());
					
					
				});
				
				
				
				cardlyout.show(panel_6, "storebank");
					
			}	
		});
		countbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				MyLogger.log(Level.INFO, "Selected Count Issue Button");
				statuslabel.setText(" Selected Count Issue");
				
				cardlyout.show(panel_6, "count");
				
			}
		});
		bktadjbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
					MyLogger.log(Level.INFO, "Bucket Adjustment Issue Button is Selected");
					statuslabel.setText(" Selected Bucket Adjustment Issue");
				
				cardlyout.show(panel_6, "bucketadj");
				
			}
		});
		delasnbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					MyLogger.log(Level.INFO, "Delet ASN Issue Button is Selected");
					statuslabel.setText(" Selected Delete ASN Issue");
				
				cardlyout.show(panel_6, "delasn");
				
			}
		});
	}
	


	protected boolean validateField(JTextField strbnk, String errormsg) {
		if(strbnk.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, errormsg);
			strbnk.requestFocus();
		}
			
			//return failedMessage(strbnk,errormsg);
			else
		return true;
		return rootPaneCheckingEnabled;
	}



	private boolean failedMessage(JTextField strbnk, String errormsg) {
		JOptionPane.showMessageDialog(null, errormsg);
		strbnk.requestFocus();
		return false;
	}



	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

