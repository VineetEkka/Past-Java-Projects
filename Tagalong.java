
public class Tagalong extends Cookie {

    public String filling;
    public boolean ChocCovered;

    public Tagalong(){
        super();
        filling= "";
        ChocCovered=false;
    }
    public Tagalong(String f,String fil,boolean c){
        super(f);
        filling=fil;
        ChocCovered=c;
        
    }

}
