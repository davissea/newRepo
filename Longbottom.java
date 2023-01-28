public class Longbottom implements MagicWand{

    private int housePoints = 0;

    public void expectoPatronum(){
        System.out.println("Nothing happens.");
    }
    public void wingardiumLeviosa(){
        System.out.println("Feather wiggles a little.");
        System.out.println( "\"More practice is needed, lose 5 points.\"");
        changeHousePoints(-5);

    }
    public void protego(){
        System.out.println("An unusually strong forcefield appears");
        System.out.println("\"Excellent job! Longbottom earns 10 points\"");
        changeHousePoints(10);
    }
    public void expelliarmus(){
        System.out.println("Nothing happens.");
        System.out.println( "\"More practice is needed, lose 5 points.\"");
        changeHousePoints(-5);
    }
    private void changeHousePoints(int num){
        housePoints += num;
    }
}
