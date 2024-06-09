/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gits;

/**
 *
 * @author sapto
 */
public class Balance_Bracket {
  public static void main(String[] args) {
    String inputString = "(( [{}) )]{";
    int nKurung = 0;
    int nSiku = 0;
    int nkurawal = 0;
    boolean valid = true;

    for (int x=0 ; x<inputString.length() ; x++){
      switch (inputString.substring(x, x+1)) {
        case "(":
          nKurung++;
          break;
        case "[":
          nSiku++;
          break;
        case "{":
          nkurawal++;
          break;
        case ")":
          nKurung--;
          break;
        case "]":
          nSiku--;
          break;
        case "}":
          nkurawal--;
          break;
        case " ":
          break;
        default:
          valid = false;
          System.out.println("tidak bisa menggunakan bracket "+ inputString.substring(x, x+1));
          break;
      }
    }

    if (valid){
      if (nKurung ==0 && nkurawal ==0 && nSiku ==0)
        System.out.println("YES");
      else
        System.out.println("NO");
    }
    
  }
}
