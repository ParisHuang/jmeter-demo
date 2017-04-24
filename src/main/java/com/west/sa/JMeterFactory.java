package com.west.sa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;	

public class JMeterFactory {
	
	public void ExecuteExistingJmx(String jmxFile,int usersNum,int durationNum) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HHmmss");
		String time = sdf.format(new Date());
		String logfile = "log/" + time + "/log";
		String outputpath = "output/" + time;
		
//		logfile = "C:\\Jmeter\\log\\report_"+ time +".jtl";
//		outputpath = "C:\\Jmeter\\reports\\report_" + time;
		
        String jmx_file = "src/test/resources/jmx_file/" +jmxFile;
        
        try {
        	//Process p = Runtime.getRuntime().exec(new String[]{"cmd","/c","jmeter","-n","-t",jmx_file,"-l",logfile,"-e","-o",outputpath,"-Jusers="+usersNum,"-Jduration="+durationNum});
        	
        	String args = "java -jar apache-jmeter/bin/ApacheJMeter.jar -n -t " + jmx_file + " -l " + logfile + " -e -o " + outputpath + " -Jusers="+usersNum+" -Jduration="+durationNum;
        	System.out.println(args);
        	
        	//Process p = Runtime.getRuntime().exec(new String[]{"java","-jar","JMeter/bin/ApacheJMeter.jar","-n","-t",jmx_file,"-l",logfile,"-e","-o",outputpath,"-Jusers="+usersNum,"-Jduration="+durationNum});
        	Process p = Runtime.getRuntime().exec(args);
        	
        	System.out.println("=============test================");
        	BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream(), "GBK"));  
            String line = null;  
            while ((line = input.readLine()) != null) {  
                System.out.println(line);  
            }  
            int exitVal = p.waitFor();  
            System.out.println("Exited with error code " + exitVal);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	
}
