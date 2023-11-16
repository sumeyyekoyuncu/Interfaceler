
public class yazilim_muhendisi implements Imuhendis{
    private boolean askerlik;
    private boolean adlisicil;
    public yazilim_muhendisi(boolean askerlik,boolean adlisicil){
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
        return "ortalamam:"+ derece ;
    }

    @Override
    public void adlisicilsorgula() {
        if(adlisicil){
            System.out.println("adli sicil kaydim bulunuyor...");
        }
        else{
            System.out.println("aadli sicil kaydim bulunmamakta...");
        }
    }

    @Override
    public void istecrubesi(String[] array) {
        System.out.println("is tecrubelerim:");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    
}
