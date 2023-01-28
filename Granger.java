public class Granger implements MagicWand{
    private int housePoints = 0;

    public Granger(int year){
        schoolYear = year;
    }

    public void expectoPatronum(){
        System.out.println("A whisp of fog like smoke erupts from the wand.");
        System.out.println( "\"More practice is needed, lose 5 points.\"");
        changeHousePoints(-5);
    }
    public void wingardiumLeviosa(){
        System.out.println("\"It's Leviosa, Not Leviosaaa!\"");
        System.out.println("A feather gracefully levitates in the air.");
        System.out.println("\"Granger earns 10 points\"");
        changeHousePoints(10);
    }
    public void protego(){
        System.out.println("An invisible forcefield appears");
        System.out.println("\"Granger earns 5 points\"");
        changeHousePoints(5);
    }
    public void expelliarmus(){
        System.out.println("Your partner's wand flies out of their hang, into yours.");
        System.out.println( "\"Great job Granger! Earn 5 points.\"");
        changeHousePoints(5);
    }
    private void changeHousePoints(int num){
        housePoints += num;
    }
}
