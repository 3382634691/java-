package mysqlce;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;



public class xuesheng extends JFrame{
	String add;

	   Map<String,Integer> map=new TreeMap<String,Integer>();
	
	   private static JLabel label = new JLabel();
	   private static JScrollPane list = new JScrollPane();

	   
	   
	   
	   public static void main(String[] args) {
	
		 JFrame jFrame = new JFrame("�򵥵�ѧ��ϵͳ");
	 

	        xuesheng xs= new xuesheng();
	
	       
	        xs.chuangti();
	                    }
	   
	   public String getKey(Map<String, Integer> map, Object value) {
		    String key = "";
		    for (Map.Entry<String, Integer> entry : map.entrySet()) {
		        if (value.equals(entry.getValue())) {
		            key = entry.getKey();
		            continue;
		        }
		    }
		    return key;
		}
	   
	   public void chuangti()
		{
		   String erwei[][] = new String[100][100];
		   String[] acc= {"a","b"};
		   String[][] add= {{"A","A1"},{"B","B!"} };
		   
		   
			String ab = null;
		
		   File file23=new File("a.txt");
		   
		   if(!file23.exists()){
	
		   try {
				file23.createNewFile();
			} 
		   catch (IOException e2) {
				// TODO �Զ����ɵ� catch ��
				e2.printStackTrace();
			}
		   }

     
			try {
 		
 				FileReader fw = new FileReader(file23);
 				BufferedReader bu=new BufferedReader(fw);
 				ab=bu.readLine();
 				
 				System.out.println(ab);
 				String key;
 				String key3;
 				String map2[];
 				String key2[] = null;
 				int val[] = null;
 				map2=ab.split("����");
 				for(String a:map2)
 				{
 					System.out.println(a);
 				}
 				System.out.println(map2[1].indexOf("���"));
 				for(int i=1;i<map2.length;i++) {
 					key3 =map2[i].substring(map2[i].indexOf("ѧ��")+2,map2[i].indexOf("���"));
 			 	    System.out.println("�ָ�"+key3);
 			 	    erwei[i-1][1]=key3;
 			 	  map.put(map2[i].substring(map2[i].indexOf(""), map2[i].indexOf("ѧ��")),Integer.parseInt(map2[i].substring(map2[i].indexOf("ѧ��")+2,map2[i].indexOf("���"))));
 				}
 	    
 				
 				for(int i=1;i<map2.length;i++) {
 					key =map2[i].substring(map2[i].indexOf(""),map2[i].indexOf("ѧ��"));
 			 	    System.out.println("�ָ����"+key);
 			 	    erwei[i-1][0]=key;
 			 	    
 			 	   
 				}
 				
 	    
 			
 		
 				
 				
 				
 				
 				
 				
 
 			bu.close(); 
			} catch (IOException e2) {
				// TODO �Զ����ɵ� catch ��
				e2.printStackTrace();
			}
		   
	
		  
	      
		   
		
			setBounds(0,0,200,150);
			  setLayout(new FlowLayout(1,10,10));    
				Container s=getContentPane();
		
				
				
				 List<String> list=new ArrayList();
				 setVisible(true);
		          setSize(350,500);
		          setLocation(400,200);
		          JButton button1=new JButton();
                  button1.setText("���ѧ��");
		          s.add(button1);
		          String text;
		          Integer text2;
		          
		          button1.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							 JFrame jFrame2 = new JFrame("�򵥵�ѧ��ϵͳ");
						
							 jFrame2.setBounds(0,0,200,150);
							  jFrame2.setLayout(new FlowLayout(1,10,10));    
								
								 List<String> list=new ArrayList();
								 jFrame2.setVisible(true);
						          jFrame2.setSize(200,250);						      
						          jFrame2.setLocation(600,200);
						          JButton button1=new JButton();
				                  button1.setText("���ѧ��");
				                  jFrame2.add(  new JLabel("����"));
				                  JTextField xm=new JTextField("",15);
				              
				                  jFrame2.add(xm);
				                  JTextField xh=new JTextField("",15);
				             
				                  jFrame2.add(xh);

						       jFrame2.add(button1);
						        xm.getText();
						       
				                  button1.addActionListener(new ActionListener(){

									@Override
									public void actionPerformed(ActionEvent e) {
									
			                              map.put(xm.getText(), Integer.parseInt(xh.getText()));
	
			                     
			                      			try {
			                      				 System.out.println("��������");
			                      				FileWriter fw = new FileWriter(file23);
			                      				BufferedWriter bu=new BufferedWriter(fw);
			                      				for(String aa:map.keySet()) {
			                      				bu.write("����"+aa+"ѧ��"+map.get(aa)+"���");
			                     
			                      			
			                      			}
			                      			bu.close(); 
			                      			xm.setText("");
			                      			xh.setText("");
											} 
			                      			
			                      			catch (IOException e2) {
												// TODO �Զ����ɵ� catch ��
												e2.printStackTrace();
											}
			                      			
			                      		
			                      	
			                      		
										
			                      			 
			                      
			                     
			                              
			                              
			                              
			                              
			                              
									}
				                	 
				                	  
				                	  
				                  });
							
							
						}
						
			});

							
							
							

		
				
				
					
					

	
				 JButton button3=new JButton();
				 button3.setText("��ѯѧ��");

				 s.add(button3);
			    String aa;
					 button3.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO �Զ����ɵķ������
							
							JFrame jFrame3 = new JFrame("�򵥵�ѧ��ϵͳ");
							
							 jFrame3.setBounds(0,0,200,150);
							  jFrame3.setLayout(new FlowLayout(1,10,10));    
								 jFrame3.setVisible(true);
								 jFrame3.setVisible(true);
						          jFrame3.setSize(200,250);						      
						          jFrame3.setLocation(600,200);
						          JButton button1=new JButton();
				                  button1.setText("ѧ�Ų�ѯ");
				                  JButton button2=new JButton();
				             
				                  jFrame3.add(new JLabel("����"));
				                  JTextField xm=new JTextField("",15);
				                  JTextField xm2=new JTextField("",15);
				                  jFrame3.add(xm);
				                  
				             
				                  button2.setText("������ѯ");
				            
				                  jFrame3.add(button2);

						       jFrame3.add(button1);
						       
						       
						       button1.addActionListener(new ActionListener(){

									@Override
									public void actionPerformed(ActionEvent e) {
								
										
	
										JOptionPane.showMessageDialog(null,"��ѯ��ѧ����"+map.get(xm.getText())+"","��ѯ",JOptionPane.OK_OPTION);
										
			                      	
											}
						       });
			                      			
			                      		
			                      	
						       button2.addActionListener(new ActionListener(){

									@Override
									public void actionPerformed(ActionEvent e) {
								
										System.out.println(getKey(map,Integer.parseInt(xm.getText())));
										JOptionPane.showMessageDialog(null,"��ѯ��������"+getKey(map,Integer.parseInt(xm.getText()))+"","��ѯ",JOptionPane.OK_OPTION);
										
										    }
									
									
										     
									
										 
										
										
										
										
			                      	
										
						       });
			                      			
						       
						       
						       
						       
						       
						         
						}

						 
					 });
	                      		
					 

						     	
	                    
					 
					 
			
				xuesheng xs=new xuesheng();
				
					 JButton button4=new JButton();
					 button4.setText("ģ������");
					
					 s.add(button4);
				     
						 button4.addActionListener(new ActionListener(){

							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame jFrame3 = new JFrame("��");
								
								 jFrame3.setBounds(0,0,200,150);
								  jFrame3.setLayout(new FlowLayout(1,10,10));    
									 jFrame3.setVisible(true);
									 jFrame3.setVisible(true);
							          jFrame3.setSize(200,250);						      
							          jFrame3.setLocation(600,200);
							          JButton button1=new JButton();
					                  button1.setText("��ѯ");
					                  jFrame3.add(new JLabel("����"));
					                  JTextField xm=new JTextField("",15);
					              
					                  jFrame3.add(xm);
					

							       jFrame3.add(button1);
							
							     
							       button1.addActionListener(new ActionListener(){

										@Override
										public void actionPerformed(ActionEvent e) {
											
											try {
												 String acc;
												FileReader fw = new FileReader(file23);
								 				BufferedReader bu=new BufferedReader(fw);
								 				acc=bu.readLine();
											
												      String content1 =acc;
												     
												 String name;
												      String pattern1 = ".*"+xm.getText()+".*";
												 
												      boolean isMatch1 = Pattern.matches(pattern1, content1);
												      if(isMatch1)
												      {
												    	
												    	  name= acc.substring(acc.indexOf(xm.getText()),acc.indexOf(xm.getText())+acc.indexOf("���"));
												    	  
												    
												
				                               JOptionPane.showMessageDialog(null,"Ϊ��ƥ�䵽��\n"+name+"","��ѯ",JOptionPane.OK_OPTION);
															
												      }
												      else
												      {
												    	  JOptionPane.showMessageDialog(null,"��ƥ����","��ѯ",JOptionPane.OK_OPTION);
															
												      }
												
							 			
							 			
												      
												      
											}
												      catch (IOException e2) {
															// TODO �Զ����ɵ� catch ��
															e2.printStackTrace();
														}
											
											
											
										   
				                      	
												}
										
										
							       });
				                      			
				                      		
				                      	
							       
							       
							       
								
							}
							 
						 });

						 JTable table=new JTable(erwei,acc);
						   JScrollPane sco=new JScrollPane(table);
						   s.add(table);
					
		}
		}












