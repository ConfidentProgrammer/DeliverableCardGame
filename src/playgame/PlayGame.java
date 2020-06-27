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
public class PlayGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Game g = new Game();
           Player p = new Player();
           
           g.setPlayer(p);
           g.getPlayer().setUserName("Deep");
           System.out.println("The Player is: "+g.getPlayer().getUserName());
           g.setCards();
     }
    
}
