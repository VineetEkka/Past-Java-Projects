
public class Kennel {
    private Pet[] pets;

    public Kennel(Pet a,Pet b, Pet c,Pet d, Pet e, Pet f){
        pets= new Pet[]{a,b,c,d,e,f};
    }

    public void Speakall(){
        for (int i = 0; i <pets.length; i++) {
            System.out.println(pets[i].getName() +" speaks "+pets[i].speak());
        }

    }



}
