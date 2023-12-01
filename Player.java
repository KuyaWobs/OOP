
package textbasedconsolegame;

public class Player extends Stats {
    
    private String playerName;
    private int health;
    private int currentHealth;
    private int stamina;
    private int currentStamina;
    private int baseDamage;
    private int currentDamage;
    
   
    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }
    public String getPlayername(){
        return playerName;
    }
    
    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth(){
        return health;
    }
    
    public void setCurrentHealth(int currentHealth){
        this.currentHealth = currentHealth;
    }
    public int getCurrentHealth(){
        return currentHealth;
    }
    
    public void setStamina(int stamina){
        this.stamina = stamina;
        }
    public int getStamina(){
        return stamina;
    }
    
    public void setCurrentStamina(int currentStamina){
        this.currentStamina = currentStamina;
    }
    public int getCurrentStamina(){
        return currentStamina;
    }
    
    public void setCurrentDamage(int currentDamage){
        this.currentDamage = currentDamage;
    }
    public int getCurrentDamage(){
        return currentDamage;
    }

    void setDamage(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
