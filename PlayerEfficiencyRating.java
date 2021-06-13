
import java.util.Scanner;

public class PlayerEfficiencyRating
{
    public static void main( String[] args ) {
        
        Scanner s = new Scanner(System.in);
        
        String playerName;
        double fieldGoalsMade;
        double steals;
        double threePointFieldGoalsMade;
        double freeThrowsMade; 
        double blocks;
        double offensiveRebounds;
        double defensiveRebounds;
        double assists;
        double fouls;
        double freeThrowsMissed;
        double fieldGoalsMissed;
        double turnovers;
        double minutesPlayed;
        double playerEfficiencyRatingPositive;
        double playerEfficiencyRatingNegative;
        double playerEfficiencyRatingCombined;
        
        
    System.out.println("Player Efficiency Rating is an all-in-one measure created by NBA basketball columnist John Hollinger which tries to give a value to");  
    System.out.println("a player's contributions on the court in a single number (the player efficiency rating or PER). It takes into account a player's");
    System.out.println("positive contributions on the court such as field goals made, steals gotten, three point field goals made, free throws made, blocks gotten,");
    System.out.println("offensive rebounds gotten, defensive rebounds gotten, and assists made, multiplies all these positive contributions by a specific value");
    System.out.println("(determined by Hollinger) and subtracts the positive contributions by negative contributions on the court such as fouls committed, free");
    System.out.println("throws missed, field goals missed, and turnovers committed, which are all multiplied by a specific value as well (determined by Hollinger)."); 
    System.out.println("The result of this subtraction of positive contributions by negative contributions is multiplied by (1/number of minutes played), which takes");
    System.out.println("into account the number of minutes the player played while having those contributions on the court. Generally, you want to calculate the PER");
    System.out.println("of a player over a season or their career but you can calculate the PER of a player over a range of games (maybe like 5+ games). You want to");
    System.out.println("to avoid calculating the PER of a player in a single game as a very bad or very good game can give a low PER or high PER that shouldn't");
    System.out.println("apply to that player. By using at least 5 games or more (or a season/career), there's more variation and their contributions will be");
    System.out.println("closer to their own average than their contributions in a single game. After all the contributions are given by the user running the program,");
    System.out.println("the program will calculate the PER and output the player's PER. It will also give advice about that general player's role in the NBA is");
    System.out.println("(determined by their PER), which can help determine how good or bad they are"); 
    System.out.println();
    System.out.println();
    System.out.println();
    
        System.out.println("Enter the name of the player: ");
        playerName = s.nextLine(); 
        
        System.out.println("Enter the number of field goals that " + playerName + " made: ");
        fieldGoalsMade = s.nextDouble();
        
        System.out.println("Enter the number of steals that " + playerName + " got: ");
        steals = s.nextDouble();
        
        System.out.println("Enter the number of three point field goals that " + playerName + " made: ");
        threePointFieldGoalsMade = s.nextDouble();
        
        System.out.println("Enter the number of free throws " + playerName + " made: ");
        freeThrowsMade = s.nextDouble();
        
        System.out.println("Enter the number of blocks that " + playerName + " got: ");
        blocks = s.nextDouble();
        
        System.out.println("Enter the number of offensive rebounds that " + playerName + " got: ");
        offensiveRebounds = s.nextDouble();
        
        System.out.println("Enter the number of defensive rebounds that " + playerName + " got: ");
        defensiveRebounds = s.nextDouble();
        
        System.out.println("Enter the number of assists that " + playerName + " made: ");
        assists = s.nextDouble();
        
        System.out.println("Enter the number of fouls that " + playerName + " committed: ");
        fouls = s.nextDouble();
        
        System.out.println("Enter the number of free throws that " + playerName + " missed: ");
        freeThrowsMissed = s.nextDouble();
        
        System.out.println("Enter the number of field goals that " + playerName + " missed: ");
        fieldGoalsMissed = s.nextDouble();
        
        System.out.println("Enter the number of turnovers that " + playerName + " committed: ");
        turnovers = s.nextDouble();
        
        System.out.println("Enter the number of minutes " + playerName + " played: ");
        minutesPlayed = s.nextDouble();
        
        playerEfficiencyRatingPositive = (fieldGoalsMade * 85.910) + (steals * 53.897) + (threePointFieldGoalsMade * 51.757) + 
        (freeThrowsMade * 46.845) + (blocks * 39.190) + (offensiveRebounds * 39.190) + (assists * 34.677) + (defensiveRebounds * 14.707); 
        
        
        playerEfficiencyRatingNegative = (fouls * 17.174) + (freeThrowsMissed * 20.091) + (fieldGoalsMissed * 39.190) + (turnovers * 53.897); 
        
        
        playerEfficiencyRatingCombined = (playerEfficiencyRatingPositive - playerEfficiencyRatingNegative) * (1 / minutesPlayed);
        
        System.out.println(playerName + " has a player efficiency rating of " + playerEfficiencyRatingCombined); 
        
        if (playerEfficiencyRatingCombined >= 35.0) {
            System.out.println("According to Ryan Hollinger, this player is having an all-time great season!");
        }
        else if (playerEfficiencyRatingCombined < 35.0 && playerEfficiencyRatingCombined >= 30) {
            System.out.println("According to Ryan Hollinger, this player is a runaway MVP candidate. It's highly likely they'll be the MVP of the season.");
        }
        else if (playerEfficiencyRatingCombined < 30.0 && playerEfficiencyRatingCombined >= 27.5) {
            System.out.println("According to Ryan Hollinger, this player is a strong MVP candidate. There's a good chance they'll be the MVP of the season.");
        }
        else if (playerEfficiencyRatingCombined < 27.5 && playerEfficiencyRatingCombined >= 25.0) {
            System.out.println("According to Ryan Hollinger, this player is a weak MVP candidate. There's a slight chance they'll be the MVP of the season.");
        }
        else if (playerEfficiencyRatingCombined < 25.0 && playerEfficiencyRatingCombined >= 22.5) {
            System.out.println("According to Ryan Hollinger, this player is a definite all-star. It's highly likely they'll in the All-Star Game this season.");
        }
        else if (playerEfficiencyRatingCombined < 22.5 && playerEfficiencyRatingCombined >= 20.0) {
            System.out.println("According to Ryan Hollinger, this player is a borderline all-star. There's a decent chance they'll be in the All-Star Game this season.");
        }
        else if (playerEfficiencyRatingCombined < 20.0 && playerEfficiencyRatingCombined >= 18.0) {
            System.out.println("According to Ryan Hollinger, this player is a second offensive option on the team.");
        }
        else if (playerEfficiencyRatingCombined < 18.0 && playerEfficiencyRatingCombined >= 16.5) {
            System.out.println("According to Ryan Hollinger, this player is a third offensive option on the team.");
        }
        else if (playerEfficiencyRatingCombined < 16.5 && playerEfficiencyRatingCombined >= 15.0) {
            System.out.println("According to Ryan Hollinger, this player is a slightly above-average player.");
        }
        else if (playerEfficiencyRatingCombined < 15.0 && playerEfficiencyRatingCombined >= 13.0) {
            System.out.println("According to Ryan Hollinger, this player is a rotation player. They might not exactly be a starter on a team but they can be the 6th-10th player on a rotation.");
        }
        else if (playerEfficiencyRatingCombined < 13.0 && playerEfficiencyRatingCombined >= 11.0) {
            System.out.println("According to Ryan Hollinger, this player is a non-rotation player. They generally won't see time on the court (usually the 11th or above player in a rotation) and might only play in garbage time.");
        }
        else if (playerEfficiencyRatingCombined < 11.0 && playerEfficiencyRatingCombined >= 9.0) {
            System.out.println("According to Ryan Hollinger, this player is a fringe roster player. They're barely on the roster (might be the last or close to last player on a rotation, like 14th/15th in a rotation) and won't see much time on the court (except maybe garbage time).");
        }
        else {
            System.out.println("According to Ryan Hollinger, this player won't stick in the league and will be out of the league at some point."); 
        }
    }
}

