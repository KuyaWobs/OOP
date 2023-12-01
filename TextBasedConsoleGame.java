
package textbasedconsolegame;
import java.util.*;

public class TextBasedConsoleGame implements PlayerAction, EnemyAction{
    static TextBasedConsoleGame gamePlay = new TextBasedConsoleGame();
    static Enemy enemy = new Enemy();
    static Scanner scn = new Scanner(System.in);
    static Weapon weapons = new Weapon();
    static Player player = new Player();
    static String name;
    
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Enter a name: ");
        name = scn.nextLine();

        System.out.println("Press 1 or 2 to select your game mode."
                + "\n1 - Story Mode"
                + "\n2 - Survival Mode");

        String gameMode = scn.nextLine();

        if (gameMode.equals("1")) {
            System.out.println("Press P to start playing, " + name);
            String storyMode = scn.next().toUpperCase();
            if (storyMode.equals("P")) {
                Thread.sleep(1000);
                System.out.println("Story Mode activated....");
                StoryMode();
                
            }
        } else if (gameMode.equals("2")) {
            System.out.println("Press P to start playing, " + name);
            String survivalMode = scn.next().toUpperCase();
            if (survivalMode.equals("P")) {
                Thread.sleep(1000);
                System.out.println("Survival Mode activated....");
                SurvivalMode();
                
            }
        }
    }
   
    
    public static void Stats(){
        Stats stats = new Stats();
        stats.setBaseDamage(7);
        
    }
    
    public static void Player(){
        player.setPlayerName(name);
        player.setHealth(100);
        player.setStamina(100); 
        player.setBaseDamage(7);
    }
    
    public static void enemyWolf(){
        enemy.setEnemyName("Wolf");
        enemy.setEnemyHealth(50);
        enemy.setBaseDamage(10);
    }
    
    public static void enemyVidar(){
        enemy.setEnemyName("Vidar");
        enemy.setEnemyHealth(100);
        enemy.setBaseDamage(23);
    }
    
    public static void enemyZhenDong(){
        enemy.setEnemyName("Zhen Dong");
        enemy.setEnemyHealth(150);
        enemy.setBaseDamage(30);
    }
    
     public static void StoryMode(){
        System.out.println("Welcome to Mystery ");
        System.out.println("\n" + name + ", you will have a mission, you must find who kill Mr.Dozen.");

        System.out.println("Mr.Dozen is found dead in his room, The room have no window and the door was lock."
            + "\nHis wife calls the only for people who had the key to Mr.Dozen room for questioning."
            + "\nThe four poeple is Sophia the maid, John the buttler, Sarah the governess, and Jack the chief.");
        boolean loop = true;

        while (loop) {
            System.out.println("Choose who do you want to ask?"
                    + "\n[S] for Sophia"
                    + "\n[J] for John"
                    + "\n[L] for Larah"
                    + "\n[Z] for Zack");
            String choice = scn.next();

            if (choice.equalsIgnoreCase("S")) {
                System.out.println("Sophia's Statement: I came to wake up Mr. Dozen at 7 am... And when I saw him dead, I screamed!");
            } else if (choice.equalsIgnoreCase("J")) {
                System.out.println("John's Statement: When I heard someone scream, I immediately ran to the room... Turned on the light and saw that Mr. Dozen had a knife in his neck.");
            } else if (choice.equalsIgnoreCase("L")) {
                System.out.println("Larah's Statement: I rushed up to the room along with John, and when we turned on the light, there was blood everywhere, No wonder Sophia screamed.");
            } else if (choice.equalsIgnoreCase("Z")) {
                System.out.println("Zack's Statement: I was prepping breakfast from 6 am to 8 am.... I didn't see anything");
            }

            System.out.println("Do you want to ask another person? [Y]for Yes / [N] for No");
            String continueAsking = scn.next();

            if (continueAsking.equalsIgnoreCase("N")) {
                loop = false;

                System.out.println("Who do you think is the killer?"
                        + "\n[S] for Sophia"
                        + "\n[J] for John"
                        + "\n[L] for Larah"
                        + "\n[Z] for Zack");
                String killer = scn.next();

                if (killer.equalsIgnoreCase("S")) {
                    System.out.println("If the room has no window and John had to turn on the light, Sophia could not have seen the dead body unless she already knew he was there.");
                    System.out.println("Congratulations! You found the killer!");
                } else {
                    System.out.println("Sorry, you failed. Try Again.");
            }
        }
    }
}


    public static void SurvivalMode(){
        
        System.out.println("Welcome Adventurer!");
        
        System.out.println("Choose a weapon"
                + "\n1 - Sword(Enma)"
                + "\n2 - Axe(Leviathan)"
                + "\n3 - Bow(Talon)");
        String weaponChoice = scn.next();
        
        Player();
        
        if (weaponChoice.equals("1")) {
            weapons.setSwordName("Enma");
            weapons.setSwordDamage(20);
            System.out.println("You have now the " + weapons.getSwordName());
            player.setBaseDamage(player.getBaseDamage() + weapons.getSwordDamage());
            System.out.println("*********************************************************");
        } else if (weaponChoice.equals("2")) {
            weapons.setAxeName("Leviathan");
            weapons.setAxeDamage(17);
            System.out.println("You have now the " + weapons.getAxeName());
            player.setBaseDamage(player.getBaseDamage() + weapons.getaxeDamage());
            System.out.println("*********************************************************");
        } else if (weaponChoice.equals("3")) {
            weapons.setBowName("Talon");
            weapons.setBowDamage(15);
            System.out.println("You have now the " + weapons.getBowName());
            player.setBaseDamage(player.getBaseDamage() + weapons.getBowDamage());
            System.out.println("*********************************************************");
    }     
        
            System.out.println("Player's Name: " + player.getPlayername());
            System.out.println("Health: " + player.getHealth());
            System.out.println("Stamina: " + player.getStamina());
            System.out.println("Damage: " + player.getBaseDamage());
            System.out.println("*********************************************************");
            System.out.println("You walked into a forest going to another town"
                + "\nand suddenly you met a Scary wolf.");
            enemyWolf();
            System.out.println("First Enemy: " + enemy.getEnemyName());
            System.out.println("Enemy Health: " + enemy.getEnemyHealth());
            System.out.println("Enemy Damage: " + enemy.getBaseDamage());
            
        do{
            gamePlay.attack();

    } while (player.getHealth() > 0);
        System.out.println("End of the Game");
        scn.close();
    }
    
    
    public static void eAttack(){
         if (enemy.getBaseDamage() < player.getCurrentHealth()) {
            player.setCurrentHealth(player.getCurrentHealth() - enemy.getBaseDamage());
        } else {
            player.setCurrentHealth(0);
    }
}
    
    public static void Slash(){
        int damageDealt = player.getBaseDamage();
        if (damageDealt > 0 && enemy.getCurrentEnemyHealth() > 0) {
        enemy.setEnemyHealth(enemy.getCurrentEnemyHealth() - damageDealt);
        System.out.println("Dealt " + damageDealt + " damage to the enemy!");
        } else {
        System.out.println("Failed to deal damage to the enemy!");
        }
}
    
    public static void Shield(){
        
        double damageReductionPercentage = 0.3;
        double reducedDamage = enemy.getBaseDamage() * (1 - damageReductionPercentage);
        reducedDamage = Math.max(1, reducedDamage);
        player.setCurrentHealth(player.getCurrentHealth() - (int) reducedDamage);
        System.out.println("Reduced Damage: " + (int) reducedDamage);
        
    }
    
    public static void Healing(){
       if (player.getCurrentHealth() < player.getHealth() - 20) {
        player.setCurrentHealth(player.getCurrentHealth() + 20);
    } else {
        player.setCurrentHealth(player.getHealth());
    }
}
    
    public static void Resting(){
       if (player.getCurrentStamina() < player.getStamina() - 20) {
        player.setCurrentStamina(player.getCurrentStamina() + 20);
    } else {
        player.setCurrentStamina(player.getStamina());
    }
}

    @Override
public void attack() {
    System.out.println("**************************************************");
    System.out.println("Choose skills:"
            + "\n1 - Slash"
            + "\n2 - Defense"
            + "\n3 - Heal"
            + "\n4 - Rest");
    do {
        String skills = scn.next();

        if (skills.equals("1")) {
            System.out.println("You perform a slashing attack!");
            Slash();
            gamePlay.EnemyAttack();
        } else if (skills.equals("2")) {
            System.out.println("You raise your shield in defense!");
            gamePlay.defense();
            gamePlay.EnemyAttack();
        } else if (skills.equals("3")) {
            System.out.println("You use a healing item!");
            gamePlay.heal();
            gamePlay.EnemyAttack();
        } else if (skills.equals("4")) {
            System.out.println("You take a moment to rest and regain stamina!");
            gamePlay.rest();
            gamePlay.EnemyAttack();
        }

        System.out.println("Player's Name: " + player.getPlayername());
        System.out.println("Health: " + player.getCurrentHealth());
        System.out.println("Stamina: " + player.getCurrentStamina());
        System.out.println("Damage: " + player.getBaseDamage());
        System.out.println("*********************************************************");
        System.out.println("You walked into a forest going to another town"
                + "\nand suddenly you met a Scary wolf.");
        enemyWolf();
        System.out.println("First Enemy: " + enemy.getEnemyName());
        System.out.println("Enemy Health: " + enemy.getCurrentEnemyHealth());   
        System.out.println("Enemy Damage: " + enemy.getBaseDamage());

    }while(player.getCurrentHealth() > 0 && enemy.getCurrentEnemyHealth() > 0);
    
}

    @Override
    public void defense() {
        Shield();
	}

    @Override
    public void heal() {
        Healing();
	}

    @Override
    public void rest() {
        Resting();
	} 

    @Override
    public void EnemyAttack() {
      eAttack();
    }

}




	