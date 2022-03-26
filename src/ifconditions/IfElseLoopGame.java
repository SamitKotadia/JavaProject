package ifconditions;

public class IfElseLoopGame {
    public static void main(String[] args) {
    IfElseLoopGame ifElseLoopGame = new IfElseLoopGame();
    ifElseLoopGame .myScore(6502);
    }
    public void myScore(int score){
        System.out.println("Well come to Call of Duty Game");
        System.out.println("Your COD Score is "+score);
        if (score<=1000){
            System.out.println("Your COD level is Rookie");
        }else if (score>=1001 && score<=2000){
            System.out.println("Your COD Level is Veteran");
        } else if (score>=2001 && score<=3000){
            System.out.println("Your COD Level is Elite");
        } else if (score>=3001 && score<=4500){
            System.out.println("Your COD Level is Pro");
        } else if (score>=4501 && score<=6500){
            System.out.println("Your COD Level is Master");
        } else if (score>=6501){
            System.out.println("Your COD Level is Legendary");
        }
    }
}
