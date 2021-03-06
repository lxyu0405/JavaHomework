/*
 * MultiClientsChattingRoom_Client.java
 *
 * Created on __DATE__, __TIME__
 */

package _AHomework;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author  __USER__
 */
public class ClientFrame extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Creates new form MultiClientsChattingRoom_Client */
	public ClientFrame() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jSeparator1 = new javax.swing.JSeparator();
		jLabel2 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea2 = new javax.swing.JTextArea();
		jButton1 = new javax.swing.JButton();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Chatting_lxyu");
		setBounds(new java.awt.Rectangle(0, 0, 10, 0));
		setResizable(false);

		jLabel1.setText("Name :");

		jTextField1.setText("enter your name");
		jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jLabel2.setText("Enter :");

		jTextArea2.setColumns(20);
		jTextArea2.setRows(5);
		jScrollPane2.setViewportView(jTextArea2);

		jButton1.setText("Send");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jTextArea1.setColumns(20);
		jTextArea1.setEditable(false);
		jTextArea1.setRows(5);
		jTextArea1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jScrollPane3.setViewportView(jTextArea1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jSeparator1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														565, Short.MAX_VALUE)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(6, 6, 6)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										47,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jTextField1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										158,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel2)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jScrollPane2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										438,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										jButton1))
																				.addComponent(
																						jScrollPane3,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						545,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		12,
																		Short.MAX_VALUE)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														39,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jSeparator1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										10,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane3,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										188,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(7, 7, 7)
																.addComponent(
																		jLabel2,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		84,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																				.addComponent(
																						jScrollPane2,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						0,
																						0,
																						Short.MAX_VALUE)
																				.addComponent(
																						jButton1,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						64,
																						Short.MAX_VALUE))
																.addGap(14, 14,
																		14)))
								.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		System.out.println("perform action...");
		String msg = jTextField1.getText() + " : " + jTextArea2.getText();
		System.out.println(msg);
		jTextArea2.setText("");
		try {
			toServer.writeUTF(msg);
			toServer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void connect(){
		try {
			System.out.println("Start connecting to the server...");
			socket = new Socket("localhost",8000);
			fromServer = new DataInputStream(socket.getInputStream());
			toServer = new DataOutputStream(socket.getOutputStream());
			isConnect = true;
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Establish a connection successfully...");
	}
	
	
	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		
	}

	//inner class
	public static class readMsgThread implements Runnable{
		@Override
		public void run() {
			while(isConnect){
				System.out.println("Reading reply...");
				try {
					jTextArea1.append(fromServer.readUTF()+"\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		ClientFrame client = new ClientFrame();
		client.setVisible(true);
		client.setLocationRelativeTo(null);
		client.connect();
		new Thread(new readMsgThread()).start();
		client.addWindowListener(new WindowAdapter(){  
	        public void windowClosing(WindowEvent e) {  
	            try {
	            	isConnect = false;
	            	toServer.close();
					fromServer.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
	        	System.exit(0);  
        }});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JSeparator jSeparator1;
	private static javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextArea jTextArea2;
	private javax.swing.JTextField jTextField1;
	private Socket socket;
	private static DataInputStream fromServer;
	private static DataOutputStream toServer;
	private static boolean isConnect;
	// End of variables declaration//GEN-END:variables

}