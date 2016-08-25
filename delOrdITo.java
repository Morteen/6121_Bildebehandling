/*Oppgave 1-c fra 2011
*Dele et ord i to ved annen hver bokastav
*/
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;

public class delOrdITo {

  public static void main(String[] args) {
   String innOrd,utOrd1,utOrd2;
    innOrd= "srerirlrerbrårt";
   utOrd1="";
   utOrd2="";
   for(int i=0;i<innOrd.length();i++){
   	 innOrd.charAt(i);
   	 if(i==0||i%2==0){
   	 	utOrd1+=innOrd.charAt(i);
   	 }else{
   	 	utOrd2+=innOrd.charAt(i);
   	 }
   }
   out.println(utOrd1);
   out.println(utOrd2);
  }//main
  /* Dette ere bare en test komentar*/

}//class
