package gits;

import java.util.HashMap;
import java.util.Map;

public class Weighted_Strings {

  public static HashMap<String, Integer> nilai = new HashMap<>();

  public static void main(String[] args) {

    nilai.put("a",1);
    nilai.put("b",2);
    nilai.put("c",3);
    nilai.put("d",4);
    nilai.put("e",5);
    nilai.put("f",6);
    nilai.put("g",7);
    nilai.put("h",8);
    nilai.put("i",9);
    nilai.put("j",10);
    nilai.put("k",11);
    nilai.put("l",12);
    nilai.put("m",13);
    nilai.put("n",14);
    nilai.put("o",15);
    nilai.put("p",16);
    nilai.put("q",17);
    nilai.put("r",18);
    nilai.put("s",19);
    nilai.put("t",20);
    nilai.put("u",21);
    nilai.put("v",22);
    nilai.put("w",23);
    nilai.put("x",24);
    nilai.put("y",25);
    nilai.put("z",26);

    String inputString = "abbcccd";
    int[] queries = {1, 3, 9, 8} ;
    
    String bobot = "No";
    String beffKarakter = "";
    String karakter = "";
    String hasil = "";
    
    int[] arrNKarakter = new int[inputString.length()] ;
    int tot = 0;
    
    for (int x = 0; x < inputString.length() ; x++){

      if (inputString.substring(x, x+1).equals(beffKarakter)){
        tot = tot + nilai.get(inputString.substring(x, x+1));
        karakter = karakter + inputString.substring(x, x+1);
        System.out.println(karakter +" = "+ tot);
      } else{
        tot = nilai.get(inputString.substring(x, x+1));
        karakter = inputString.substring(x, x+1);
        System.out.println(karakter +" = "+ tot);
      }
      arrNKarakter[x]=tot;
      
      beffKarakter = inputString.substring(x, x+1);
    }
    System.out.println("==================================");
    for (int x=0 ; x<queries.length ; x++){
      for (int c=0; c<arrNKarakter.length ; c++){
        if (queries[x] == arrNKarakter[c]){
          bobot = "Yes";
          break;
        }else{
          bobot = "No";
        }
      }
      hasil = bobot;
      System.out.println(queries[x] +" "+ hasil);
    }
  }
}
