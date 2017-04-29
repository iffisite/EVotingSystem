/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting_ggg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author irfan
 */
public class work {
   
    // File file = new File("NA.txt");    
   // File file2 = new File("PS.txt");
     Scanner file= new Scanner("NA.txt");
  HashMap<String , Integer> map = new HashMap<String , Integer > ();
    
   public static void main(String[] args)
   {
       
  
    
}
 public void vc(String a) throws IOException
    {
         BufferedWriter bw = new BufferedWriter(new FileWriter("NA.txt", true));
         bw.write(a);
         bw.newLine();
         bw.close();
 
   }
  public void vc2(String a) throws IOException
    {
         BufferedWriter bw = new BufferedWriter(new FileWriter("PS.txt", true));
         bw.write(a);
         bw.newLine();
         bw.close();
       
}
  public void check(){
  
       while (file.hasNext()){
          String word = file.next();
          if (map.containsKey(word)){
          int count = map.get(word) + 1;
          map.put(word , count);
          }
          else{
          map.put(word , 1);
          }
      }
      file.close();
     for (Map.Entry<String , Integer> entry : map.entrySet()){
       System.out.println(entry);}
  }
  public String ab() throws FileNotFoundException, IOException{
         int count=0;
         BufferedReader file2= new BufferedReader(new FileReader("PS.txt"));
  HashMap<String , Integer> map2 = new HashMap<String , Integer > ();
         String word = file2.readLine();
            while (word != null){
          
                
                 if (map2.containsKey(word)){
          count = map2.get(word) + 1;
          map2.put(word , count);
          }
          else{
          map2.put(word , 1);
          }
          word = file2.readLine();
      }
      file2.close();
      int a;
      int b=0;
      String c = null;
    
     for (Map.Entry<String , Integer> entry : map2.entrySet()){
      // System.out.println(entry);
      a=entry.getValue();
    
      if (a> b){
      b=a;
//      c=entry.getKey();
      c =  entry.getKey();
    
      //c = entry.toString();
      }}
      return c+"";
  }
  public String ac() throws FileNotFoundException, IOException{
         int count=0;
         BufferedReader file= new BufferedReader(new FileReader("NA.txt"));
  HashMap<String , Integer> map = new HashMap<String , Integer > ();
         String word = file.readLine();
            while (word != null){
          
                
                 if (map.containsKey(word)){
          count = map.get(word) + 1;
          map.put(word , count);
          }
          else{
          map.put(word , 1);
          }
          word = file.readLine();
      }
      file.close();
      int a;
      int b=0;
      String c = null;
    
     for (Map.Entry<String , Integer> entry : map.entrySet()){
      // System.out.println(entry);
      a=entry.getValue();
    
      if (a> b){
      b=a;
//      c=entry.getKey();
      c =  entry.getKey();
    
      //c = entry.toString();
      }}
      return c+"";
  }
}
