import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Cards>Deck;
    Random rand= new Random();
    public Deck(){



        for(int i=1;i<14;i++){
            Cards cardi= new Cards(i,"clubs",0,0);

            }

        for(int i=1;i<14;i++){

                Cards cardi= new Cards(i,"diamonds",0,0);
            }

        for(int i=1;i<14;i++){
                Cards cardi= new Cards(i,"spades",0,0);
            }

        for(int i=1;i<14;i++){
                Cards cardi= new Cards(i,"hearts",0,0);
            }


        }



    public void shuffle(){
        int random=(rand.nextInt(Deck.size()-1)+1);
        ArrayList<Cards>empty=new ArrayList<>(52);
        for(int i=0;i<=52;i++){
            empty.add(Deck.remove(random));

        }
        Deck=empty;

    }
    public void addTop(Cards toAdd){
        Deck.remove(toAdd);
        Deck.add(0,toAdd);

    }
    public void addMid(Cards toAdd){
        int rander=(rand.nextInt(Deck.size()-1)+1);
        Deck.remove(toAdd);
        Deck.add(rander,toAdd);

    }
    public void addBot(Cards toAdd){
        Deck.remove(toAdd);
        Deck.add(51,toAdd);

    }
    public Cards removeTop(){
        Deck.remove(0);
        return Deck.get(Deck.size());

    }
   public Cards removeMid(){
       int randoCard=(rand.nextInt(Deck.size()-1)+1);
       Deck.remove(randoCard);
       return Deck.get(Deck.size());

    }
    public Cards removeBot(){
        Deck.remove(Deck.size());
        return Deck.get(Deck.size());

    }
    public Cards peekTop(){
        return Deck.get(0);

    }

    public Cards peekMid(){
        int randoCard=(rand.nextInt(Deck.size()-1)+1);
        return Deck.get(randoCard);

    }
    public Cards peekBot(){
      return Deck.get(Deck.size());

    }
    public void display(Graphics h){
        h.drawImage(card);
    }




}
