
public class Interfaceler {

    public static void main(String[] args) {
      // Imuhendis muhendis1=new Imuhendis(); interfacelerden obje olusturulamaz.
   /* yazilim_muhendisi muhendis1=new yazilim_muhendisi(false,false);
      muhendis1.askerlikdurumusorgula();
      muhendis1.adlisicilsorgula();
      System.out.println(muhendis1.mezuniyetortalaması(3.07));
      String[] tecrube={"sirket1","sirket2","sirket3"};
      muhendis1.istecrubesi(tecrube); */
        
      makine_muhendisi muhendis2=new makine_muhendisi(true, false); 
     /*eger yukarıyı Imuhendis muhendis2 =new makine_muhendisi(true, false); seklinde olustursaydim referansgetir();
      fonksiyonumu kullanamayacaktim.*/
      muhendis2.askerlikdurumusorgula();
      muhendis2.adlisicilsorgula();
      System.out.println(muhendis2.mezuniyetortalaması(2.56));
      String[] tecrube={}; //"sirketx","sirkety","sirketz"
      muhendis2.istecrubesi(tecrube);
      String[] referans={"mudurx","mudury"};
      muhendis2.referansgetir(referans);
    }
}
