package com.xstoresupport.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;

import com.charter.xstoresupport.bo.Bo;
public class GenerateMntFile {
	public static DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	public static Date dateobj = new Date();
	public static String date = new String(df.format(dateobj));
	
	public static void genMnt(Bo b) {
		

		String dir="C:\\XstoreIssues\\MNT_FILES";
		try {
			PrintWriter pw = new PrintWriter(new File(
			dir + "\\" + b.getBnkstnbr() + " _Storebank.mnt"));
			StringBuilder br=new StringBuilder();
			
			br.append("<Header download_id='Bank_Reset."+b.getBnkstnbr()+""+"."+date+"' target_org_node='STORE:"+b.getBnkstnbr()+"' deployment_name='StoreBank."+b.getBnkstnbr()+"."+date+"' download_time='IMMEDIATE' apply_immediately='true' /> ");
			br.append("\n");
			br.append("RUN_SQL|UPDATE DTV.TSN_SESSION_TNDR SET ACTUAL_MEDIA_AMT='0' WHERE TNDR_ID='USD_CURRENCY' AND SESSION_ID='0'");
			br.append("\n");
			br.append("RUN_SQL|COMMIT");
			pw.write(br.toString());
			pw.close();
			//statuslabel.setText(" MNT File is Generated");
			MyLogger.log(Level.INFO, "MNT File is Generated for Store Bank Issue Successfully");
			UploadFile.upload();
			
		}
			catch(Exception e) {
				
			}
		}
	public static void tillMnt(Bo b) {
		
		
		String dir="C:\\XstoreIssues\\MNT_FILES";
		try {
			PrintWriter pw = new PrintWriter(new File(
					dir + "\\" + b.getTsno() + " _TillIssue"+ ".mnt"));
			StringBuilder sb=new StringBuilder();
			sb.append("<Header download_id='Till."+b.getTsno()+""+"."+date+"' target_org_node='STORE:"+b.getTsno()+"' deployment_name='Till."+b.getTsno()+"."+date+"' download_time='IMMEDIATE' apply_immediately='true' /> ");
			sb.append("\n");
			sb.append("RUN_SQL|UPDATE TSN_SESSION_WKSTN SET ATTACHED_FLAG = '0'"+" WHERE WKSTN_ID='"+b.getTwid()+"'"+" AND ATTACHED_FLAG='1'");
			sb.append("\n");
			sb.append("RUN_SQL|UPDATE TSN_TNDR_REPOSITORY_STATUS SET ISSUED_FLAG='0'"+", ACTIVE_SESSION_ID=''"+" WHERE TNDR_REPOSITORY_ID='"+b.getTtno()+"'");
			sb.append("\n");
			sb.append("RUN_SQL|DELETE TSN_SESSION WHERE STATCODE='"+b.getTsts()+"'"+" AND TNDR_REPOSITORY_ID='"+b.getTtno()+"'");
			sb.append("\n");
			sb.append("RUN_SQL|COMMIT");
			
			pw.write(sb.toString());
			pw.close();
			//statuslabel.setText(" MNT File is Generated");
			MyLogger.log(Level.INFO, "MNT File is Generated for Till Issue Successfully");
			UploadFile.upload();
			} catch (Exception e2) {
				
		  }
		
		
	}
	public static void countMnt(Bo b) {

		String dir="C:\\XstoreIssues\\MNT_FILES";
		try {
			PrintWriter pw = new PrintWriter(new File(
			dir + "\\" + b.getCsno()  + " _Count"+ ".mnt"));
			StringBuilder br=new StringBuilder();
			br.append("<Header download_id='Count."+b.getCsno()+""+"."+date+"' target_org_node='STORE:"+b.getCsno()+"' deployment_name='Count."+b.getCsno()+"."+date+"' download_time='IMMEDIATE' apply_immediately='true' /> ");
			br.append("RUN_SQL|DELETE FROM DTV.INV_COUNT WHERE RTL_LOC_ID='"+b.getCsno()+"' AND INV_COUNT_ID ='"+b.getCid()+"'\n");
			br.append("RUN_SQL|DELETE FROM DTV.INV_COUNT_P WHERE RTL_LOC_ID='"+b.getCsno()+"' AND INV_COUNT_ID ='"+b.getCid()+"'\n");
			br.append("RUN_SQL|DELETE FROM DTV.INV_COUNT_BUCKET WHERE RTL_LOC_ID='"+b.getCsno()+"' AND INV_COUNT_ID='"+b.getCid()+"'\n");
			br.append("RUN_SQL|DELETE FROM DTV.INV_COUNT_BUCKET_P WHERE RTL_LOC_ID='"+b.getCsno()+"' AND INV_COUNT_ID='"+b.getCid()+"'\n");
			br.append("RUN_SQL|DELETE FROM DTV.INV_COUNT_SHEET WHERE RTL_LOC_ID='"+b.getCsno()+"' AND INV_COUNT_ID='"+b.getCid()+"'\n");
			br.append("RUN_SQL|DELETE FROM DTV.INV_COUNT_SHEET_P WHERE RTL_LOC_ID='"+b.getCsno()+"' AND INV_COUNT_ID='"+b.getCid()+"'\n");
			br.append("RUN_SQL|DELETE FROM DTV.INV_COUNT_SHEET_LINEITM WHERE RTL_LOC_ID='"+b.getCsno()+"' AND INV_COUNT_ID ='"+b.getCid()+ "'\n");
			br.append("RUN_SQL|DELETE FROM DTV.INV_COUNT_SHEET_LINEITM_P WHERE RTL_LOC_ID='"+b.getCsno()+"' AND INV_COUNT_ID ='"+b.getCid()+ "'\n");
			br.append("RUN_SQL|DELETE FROM DTV.INV_COUNT_SNAPSHOT WHERE RTL_LOC_ID='"+b.getCsno()+"' AND INV_COUNT_ID='"+b.getCid()+ "'\n");
			br.append("RUN_SQL|DELETE FROM DTV.INV_COUNT_SNAPSHOT_P WHERE RTL_LOC_ID='"+b.getCsno()+"' AND INV_COUNT_ID='"+b.getCid()+ "'\n");
			br.append("RUN_SQL|COMMIT");
			pw.write(br.toString());
			pw.close();
			//statuslabel.setText(" MNT File is Generated");
			MyLogger.log(Level.INFO, "MNT File is Generated for Count Issue Issue Successfully");
			UploadFile.upload();
			
		}
			catch(Exception e) {
				
			}
	
	}
	public static void dAsnMnt(Bo b) {

		String dir="C:\\XstoreIssues\\MNT_FILES";
		try {
			PrintWriter pw = new PrintWriter(new File(
			dir + "\\" + b.getDsno()  + " _Delete_Asn"+ ".mnt"));
			StringBuilder br=new StringBuilder();
			br.append("<Header download_id='Delete_ASN."+b.getDsno()+""+"."+date+"' target_org_node='STORE:"+b.getDsno()+"' deployment_name='Count."+b.getDsno()+"."+date+"' download_time='IMMEDIATE' apply_immediately='true' /> ");
			br.append("\n");
			br.append("RUN_SQL|DELETE FROM DTV.INV_INVCTL_DOCUMENT WHERE INVCTL_DOCUMENT_ID ='"+b.getDasnid()+"' AND RTL_LOC_ID='"+b.getDsno()+"' AND DOCUMENT_SUBTYPCODE='ASN'");
			br.append("\n");
			br.append("RUN_SQL|DELETE FROM DTV.INV_CARTON WHERE INVCTL_DOCUMENT_ID ='"+b.getDasnid()+"' AND RTL_LOC_ID='"+b.getDsno()+"'");
			br.append("\n");
			br.append("RUN_SQL|DELETE FROM DTV.INV_INVCTL_DOCUMENT_LINEITM WHERE INVCTL_DOCUMENT_ID ='"+b.getDasnid()+"' AND RTL_LOC_ID='"+b.getDsno()+"'");
			br.append("\n");
			br.append("RUN_SQL|DELETE FROM DTV.INV_INVCTL_TRANS WHERE INVCTL_DOCUMENT_ID ='"+b.getDasnid()+"' AND RTL_LOC_ID='"+b.getDsno()+"'");
			br.append("\n");
			br.append("RUN_SQL|DELETE FROM DTV.INV_INVCTL_TRANS_DETAIL WHERE INVCTL_DOCUMENT_ID ='"+b.getDasnid()+"' AND RTL_LOC_ID='"+b.getDsno()+"'");
			br.append("\n");
			br.append("RUN_SQL|DELETE FROM DTV.INV_INVCTL_DOC_LINESERIAL WHERE INVCTL_DOCUMENT_ID ='"+b.getDasnid()+"' AND RTL_LOC_ID='"+b.getDsno()+"'");
			br.append("\n");
			br.append("RUN_SQL|DELETE FROM DTV.INV_INVENTORY_LOC_MOD WHERE DOCUMENT_ID ='"+b.getDasnid()+"' AND RTL_LOC_ID='"+b.getDsno()+"'");
			br.append("\n");
			br.append("RUN_SQL|COMMIT");
			pw.write(br.toString());
			pw.close();
			//statuslabel.setText(" MNT File is Generated");
			MyLogger.log(Level.INFO, "MNT File is Generated for delete ASN Issue Successfully");
			UploadFile.upload();
			
		}
			catch(Exception e) {
				
			}
	
	}
	public static void businessDateMnt(Bo b) {
		
		String dir="C:\\XstoreIssues\\MNT_FILES";
		try {
			PrintWriter pw = new PrintWriter(new File(
			dir + "\\" + b.getBdtsno()  + " _BusinessDate"+ ".mnt"));
			StringBuilder ds=new StringBuilder();
		
	DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	Date dateobj = new Date();
	String date = new String(df.format(dateobj));
	
	//Query for updating the wrong date 
	
	ds.append("<Header download_id='resetdate."+b.getBdtsno()+""+"."+date+"' target_org_node='STORE:"+b.getBdtsno()+"' deployment_name='Till."+b.getBdtsno()+"."+date+"' download_time='IMMEDIATE' apply_immediately='true' /> ");
	ds.append("\n");
	
	ds.append("RUN_SQL|UPDATE DTV.loc_state_journal set DATE_VALUE="+b.getBdtrstdt()+" where DATE_VALUE="+b.getBdtwrgdt()+"  and RTL_LOC_ID="+b.getBdtsno()+" and STATUS_TYPCODE='BUSINESS_DATE' and STATE_JOURNAL_ID in ('0000000187')");
	ds.append("\n");
	
	ds.append("RUN_SQL|update Dtv.inv_count set END_DATE="+b.getBdtrstdt()+" where END_DATE="+b.getBdtwrgdt()+" and RTL_LOC_ID="+b.getBdtsno());
	ds.append("\n");
	
	ds.append("RUN_SQL|update DTV.INV_COUNT_SNAPSHOT set snapshot_date ="+b.getBdtrstdt()+" where snapshot_date ="+b.getBdtwrgdt()+" and  RTL_LOC_ID="+b.getBdtsno());
	ds.append("\n");
	
	ds.append("RUN_SQL|update dtv.inv_invctl_document set last_activity_date="+b.getBdtrstdt()+" where last_activity_date="+b.getBdtwrgdt()+" and  RTL_LOC_ID="+b.getBdtsno());
	ds.append("\n");
	
	ds.append("RUN_SQL|update dtv.INV_SHIPMENT set ACTUAL_DELIVERY_DATE="+b.getBdtrstdt()+" where ACTUAL_DELIVERY_DATE="+b.getBdtwrgdt()+" and RTL_LOC_ID="+b.getBdtsno());
	ds.append("\n");
	
	ds.append("RUN_SQL|UPDATE DTV.TRN_TRANS SET BUSINESS_DATE="+b.getBdtrstdt()+" WHERE BUSINESS_DATE="+b.getBdtwrgdt()+" AND RTL_LOC_ID="+b.getBdtsno());
	ds.append("\n");
	
	ds.append("RUN_SQL|UPDATE DTV.SEC_ACTIVITY_LOG SET BUSINESS_DATE="+b.getBdtrstdt()+" WHERE BUSINESS_DATE="+b.getBdtwrgdt()+" AND RTL_LOC_ID="+b.getBdtsno());
	ds.append("\n");
	
	ds.append("RUN_SQL|UPDATE DTV.INV_INVENTORY_JOURNAL SET BUSINESS_DATE="+b.getBdtrstdt()+" WHERE BUSINESS_DATE="+b.getBdtwrgdt()+" AND RTL_LOC_ID="+b.getBdtsno());
	ds.append("\n");
	
	ds.append("RUN_SQL|UPDATE DTV.INV_INVCTL_TRANS_DETAIL SET BUSINESS_DATE="+b.getBdtrstdt()+" WHERE BUSINESS_DATE="+b.getBdtwrgdt()+" AND RTL_LOC_ID="+b.getBdtsno());
	ds.append("\n");

	ds.append("RUN_SQL|UPDATE DTV.INV_INVCTL_TRANS SET BUSINESS_DATE="+b.getBdtrstdt()+" WHERE  BUSINESS_DATE="+b.getBdtwrgdt()+"  AND RTL_LOC_ID="+b.getBdtsno());
	ds.append("\n");

	ds.append("RUN_SQL|UPDATE DTV.INV_INVCTL_DOCUMENT_LINEITM SET LINEITM_BUSINESS_DATE="+b.getBdtrstdt()+" WHERE LINEITM_BUSINESS_DATE="+b.getBdtwrgdt()+" AND RTL_LOC_ID="+b.getBdtsno());
	ds.append("\n");

	ds.append("RUN_SQL|UPDATE DTV.CTL_DEVICE_REGISTRATION SET BUSINESS_DATE="+b.getBdtrstdt()+" WHERE BUSINESS_DATE="+b.getBdtwrgdt()+"  AND  RTL_LOC_ID="+b.getBdtsno());
	ds.append("\n");
	
	ds.append("RUN_SQL|UPDATE DTV.CTL_EVENT_LOG SET BUSINESS_DATE="+b.getBdtrstdt()+" where  RTL_LOC_ID="+b.getBdtsno()+ "BUSINESS_DATE="+b.getBdtwrgdt());
	ds.append("\n");
	
	ds.append("RUN_SQL|COMMIT" );
	UploadFile.upload();
	//ds.append("\n");
	
	pw.write(ds.toString());
	pw.close();
	//statuslabel.setText(" MNT File is Generated");
	MyLogger.log(Level.INFO, "MNT File is Generated for Business Date Issue Successfully");
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}