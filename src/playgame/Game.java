/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playgame;

/**
 *
 * @author deepp
 */
public class Game implements SettingCards
{
  
    //data members
    Player p;
   String[] suit = {"Diamonds","Hearts","Clubs","Spades"}; 
   int[] cardDeck = new int[10]; 
  // String[][] resultCard = new String[13][4];
   
       @Override
      public void setCards(){
          //setting suit
          System.out.println("Let's Generate 10 Random Cards ");
         for(int i =0 ; i<10 ;++i){

                 cardDeck[i] = (int)(Math.random()*13+1);
                System.out.println(cardDeck[i] + " of "+suit[(int)(Math.random()*3)]);
             
         } 
          
      }
      public void setPlayer(Player p){
         this.p = p; 
      }
      public Player getPlayer(){
         return this.p; 
      }
}
