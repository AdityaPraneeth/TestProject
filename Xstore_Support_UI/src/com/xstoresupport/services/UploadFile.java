package com.xstoresupport.services;

import com.charter.xstoresupport.client.MainMenu;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;

import javax.swing.JOptionPane;


public class UploadFile extends MainMenu  {
	  public static void upload() {
		  statuslabel.setText(" MNT File is Generated");
	       String sourceFolder = null;
	       String targetFolder = null;
	       File sFile = new File("C:\\XstoreIssues\\MNT_FILES");
	       // Find files with specified extension
	       File[] sourceFiles = sFile.listFiles(new FilenameFilter() {
	          
	         @Override
	         public boolean accept(File dir, String name) {
	           if(name.endsWith(".mnt")) {// change this to your extension
	             return true;
	           }else{
	             return false;
	           }
	         }
	       });
	        //String nfsurl="";
	      /*  String host="142.136.193.161";
	        String user="v853050adm";
	        String pass="Bh@rrath06";
	      
	       String uploadpath="/app/instance/data/posis/prod/xcenter/filetransfer/auto/org1/";
	       String nfsurl=String.format(user,pass,host,uploadpath);
	       System.out.println("upload URL:"+nfsurl);
	       for(File fSource:sourceFiles) {
	        	 try {
	 	        	URL url=new URL(nfsurl);
	 	        	URLConnection conn=url.openConnection();
	 	        	OutputStream outstream=conn.getOutputStream();
	 	        	FileInputStream instream=new FileInputStream(fSource);
	 	        	byte[] buffer=new byte[1025];
	 	        	int bytesRead=-1;
	 	        	while((bytesRead=instream.read(buffer))!=-1) {
	 	        		outstream.write(buffer, 0, bytesRead);
	 	        		
	 	        	}
	 	        	instream.close();
	 	        	outstream.close();
	 	        	System.out.println("File Uploded");
	 	        	
	 	        	
	 	        	
	 	        }catch(IOException ex) {
	 	        	ex.printStackTrace();
	 	        }
	        	
	        }*/
	       
	       // let us copy each file to the target folder
	      for(File fSource:sourceFiles) {
	        File fTarget = new File(new File("C:\\nfslocation"), fSource.getName());
	         //copyFileUsingStream(fSource,fTarget);
	         File logFile=new File(new File("C:\\XstoreIssuesLog"), fSource.getName());
	        // MyLogger.log(Level.INFO, "File Name: "+fSource.getName()+"");
	        // moveFiles(fSource,logFile);
	        //JOptionPane.showMessageDialog(null, "mnt is successfully uploaded and moved to logfile");
	       // statuslabel.setText("success");
	         //fSource.delete(); // Uncomment this line if you want source file deleted
	       }  
	     } 
	     private static void moveFiles(File source, File dest) {
	         InputStream is = null;
	         OutputStream os = null;
	         try {
	             is = new FileInputStream(source);
	             os = new FileOutputStream(dest);
	             byte[] buffer = new byte[1024];
	             int length;
	             while ((length = is.read(buffer)) > 0) {
	                 os.write(buffer, 0, length);
	             }
	         }catch(Exception ex) {
	           System.out.println("Unable to copy file:"+ex.getMessage());
	         }  
	         finally {
	           try {
	             is.close();
	             os.close();
	           }catch(Exception ex) {}
	         }
	     }

		/**
	      * Copies a file using the File streams
	      * @param source
	      * @param dest
	      */
	     private static void copyFileUsingStream(File source, File dest)  {
	         InputStream is = null;
	         OutputStream os = null;
	         try {
	             is = new FileInputStream(source);
	             os = new FileOutputStream(dest);
	             byte[] buffer = new byte[1024];
	             int length;
	             while ((length = is.read(buffer)) > 0) {
	                 os.write(buffer, 0, length);
	             }
	         }catch(Exception ex) {
	           System.out.println("Unable to copy file:"+ex.getMessage());
	         }  
	         finally {
	           try {
	             is.close();
	             os.close();
	           }catch(Exception ex) {}
	         }
	     }
}
