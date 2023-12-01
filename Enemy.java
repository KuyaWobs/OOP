
package textbasedconsolegame;

public class Enemy extends Player{
        
    private String enemyName;
    private int enemyHealth;
    private int currentEnemyHealth;
 
    public void setEnemyName(String enemyName){
        this.enemyName = enemyName;
    }
    public String getEnemyName(){
        return enemyName;
    }
    
    public void setEnemyHealth(int enemyHealth){
        this.enemyHealth = enemyHealth;
    }
    public int getEnemyHealth(){
        return enemyHealth;
    }
    
    public void setCurrentEnemyHealth(int currentEnemyHealth){
        this.currentEnemyHealth = currentEnemyHealth;
    }
    public int getCurrentEnemyHealth(){
        return currentEnemyHealth;
    }

    int getDamage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
