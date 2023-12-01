
package textbasedconsolegame;

public class Weapon {
    
    private String swordName;
    private int swordDamage;
    
    private String axeName;
    private int axeDamage;
    
    private String bowName;
    private int bowDamage;
    
    public void setSwordName(String swordName){
        this.swordName = swordName; 
    }
    public String getSwordName(){
        return swordName;   
    }  
 
    public void setAxeName(String axeName){
        this.axeName = axeName;
    }
    public String getAxeName(){
        return axeName;
    }
    
    public void setBowName(String bowName){
        this.bowName = bowName;
    }
    public String getBowName(){
        return bowName;
    }
    
    public void setSwordDamage(int swordDamage){
        this.swordDamage = swordDamage;
    }
    public int getSwordDamage(){
        return swordDamage;
    }
    
    public void setAxeDamage(int axeDamage){
        this.axeDamage = axeDamage;
    }
    public int getaxeDamage(){
        return axeDamage;
    }
    
    public void setBowDamage(int bowdamage){
        this.bowDamage = bowDamage;
    }
    public int getBowDamage(){
        return bowDamage;
    }
}


