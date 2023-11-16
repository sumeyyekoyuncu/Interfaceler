
public class makine_muhendisi implements Imuhendis{
   private boolean askerlik;
   private boolean adlisicil;
   public makine_muhendisi(boolean askerlik,boolean adlisicil){
       this.askerlik=askerlik;
       this.adlisicil=adlisicil;
   }
    @Override
    public void askerlikdurumusorgula() {
        if(askerlik){
            System.out.println("askerligimi yaptim...");
        }
        else{
            System.out.println("askerligimi henuz yapmadim...");
        }
    }

    @Override
    public String mezuniyetortalaması(double derece) {
        return "ortalamam:"+derece;
    }

    @Override
    public void adlisicilsorgula() {
        if(adlisicil){
            System.out.println("adli sicil kaydı bulunmakta...");
        }
        else{
            System.out.println("adli sicil kaydi bulunmamaktadir...");
        }
    }

    @Override
    public void istecrubesi(String[] array) {
        if(array.length==0){
            System.out.println("is tecrubem bulunmamaktadir...");
        }
        else{
        System.out.println("makine muhendisi olarak is tecrubelerim:");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        }
    }
    public void referansgetir(String[] array){
        if(array.length==0){
            System.out.println("herhangi bir referansim bulunmamaktadir");
        }
        else{
            System.out.println("referanslarim:");
            for(int i=0;i<array.length;i++){
                System.out.println(array[i]);
            }
        }
    }
    
}
