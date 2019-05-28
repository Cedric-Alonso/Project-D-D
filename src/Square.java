import java.util.ArrayList;

public class Square {
    Method method = new Method();
    public Square(int id, int playerId, Players players){
        int ennemy,object, numberId=0;
        Character player = players.getPlayers().get(playerId);
        switch (id){
            case 0:{
                numberId++;
                ennemy= 0;
                object = 0;
            }
            case 1:{
                numberId++;
                ennemy= 0;
                object = method.getRandom(0,player.getLevel());
            }
            case 2:{
                numberId++;
                ennemy= method.getRandom(0,player.getLevel());
                object = 0;
            }
        }
    }
}
