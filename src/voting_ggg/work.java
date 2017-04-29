/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting_ggg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
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
  public String ab(){
         int count=0;
    Scanner file2= new Scanner("PS.txt");
  HashMap<Integer , String> map2 = new HashMap<Integer , String > ();
         while (file2.hasNext()){
          String word = file2.next();
          if (map2.containsValue(word)){
           count++;
          map2.put( count, word);
          }
          else{
          map2.put(1 , word);
          }
      }
      file2.close();
      int a;
      int b=0;
      String c = null;
    
     for (Map.Entry<Integer , String> entry : map2.entrySet()){
      // System.out.println(entry);
      a=entry.getKey();
      if (a> b){
      b=a;
//      c=entry.getKey();
     c =entry.getValue();
      //c = entry.toString();
      }}
      return c;
  }
}
