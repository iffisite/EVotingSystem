/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting_ggg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Manahil S
 */
public class Voting_ggg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // boxxxx cv=new boxxxx();
        //cv.setVisible(true);
        login_voting lv=new login_voting();
        lv.setVisible(true);
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
      return map2+"";
  }
}
