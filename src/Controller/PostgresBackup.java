/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;  
import java.util.Date;
import java.util.List;  
import javax.swing.JOptionPane;
      

/**
 *
 * @author rodri
 */
public class PostgresBackup {
    public static void realizaBackup() throws IOException, InterruptedException{      
           final List<String> comandos = new ArrayList<String>();      

           comandos.add("C:\\Program Files\\PostgreSQL\\12\\bin\\pg_dump.exe");    // esse é meu caminho  
           //comandos.add("-i");   //usar se for caminho de rede;   
           comandos.add("-h");      
           comandos.add("localhost");     //ou  comandos.add("192.168.0.1"); 
           comandos.add("-p");      
           comandos.add("5432");      
           comandos.add("-U");      
           comandos.add("postgres");      
           comandos.add("-F");      
           comandos.add("c");      
           comandos.add("-b");      
           comandos.add("-v");      
           comandos.add("-f");      
           comandos.add("C:\\backup\\"+"Backup_"+getDateTime()+".backup");   // eu utilizei meu C:\ e D:\ para os testes e gravei o backup com sucesso.    
           //comandos.add("C:\\backup\\bkp.backup");   // eu utilizei meu C:\ e D:\ para os testes e gravei o backup com sucesso.  
           comandos.add("rc_milk");      
           ProcessBuilder pb = new ProcessBuilder(comandos);      
             
           pb.environment().put("PGPASSWORD", "root");      //Somente coloque sua senha         
             
           try {      
               final Process process = pb.start();      
         
               final BufferedReader r = new BufferedReader(      
                   new InputStreamReader(process.getErrorStream()));      
               String line = r.readLine();      
               while (line != null) {      
               System.err.println(line);      
               line = r.readLine();      
               }      
               r.close();      
         
               process.waitFor();    
               process.destroy(); 
               JOptionPane.showMessageDialog(null,"backup realizado com sucesso.");  
         
           } catch (IOException e) {      
               e.printStackTrace();      
           } catch (InterruptedException ie) {      
               ie.printStackTrace();      
           }         
               
       }
    public static void realizaRestore() throws IOException, InterruptedException{      
           final List<String> comandos = new ArrayList<String>();      
             
           comandos.add("C:\\Program Files\\PostgreSQL\\12\\bin\\pg_restore.exe"); //testado no windows xp

           //comandos.add("-i");      
           comandos.add("-h");      
           comandos.add("localhost");    //ou   comandos.add("192.168.0.1"); 
           comandos.add("-p");      
           comandos.add("5432");      
           comandos.add("-U");      
           comandos.add("postgres");      
           comandos.add("-d");      
           comandos.add("rc_milk");     
           comandos.add("-v");      
             
           comandos.add("C:\\backup\\");   // eu utilizei meu C:\ e D:\ para os testes e gravei o backup com sucesso.  

           ProcessBuilder pb = new ProcessBuilder(comandos);      
             
           pb.environment().put("PGPASSWORD", "root");     //Somente coloque sua senha         
             
           try {      
               final Process process = pb.start();      
         
               final BufferedReader r = new BufferedReader(      
                   new InputStreamReader(process.getErrorStream()));      
               String line = r.readLine();      
               while (line != null) {      
               System.err.println(line);      
               line = r.readLine();      
               }      
               r.close();      
         
               process.waitFor();    
               process.destroy(); 
               JOptionPane.showMessageDialog(null,"Restore realizado com sucesso.");  
         
           } catch (IOException e) {      
               e.printStackTrace();      
           } catch (InterruptedException ie) {      
               ie.printStackTrace();      
           }         
               
       }
        private static String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy HHmm");
        Date date = new Date();
        return dateFormat.format(date);
    } 
    
}
