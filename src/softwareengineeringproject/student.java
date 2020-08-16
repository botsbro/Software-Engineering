/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareengineeringproject;

/**
 *
 * @author 23657952
 */
public class student {
    
    private String name;
    private String skill;
    private team team;
    
    student(String n, String s, team t){ //overriding constructor takes a string for name, another for skill, and an team object for team
        this.name = n;
        this.skill = s;
        this.team = t;
        
    }
    student(String n, String s){ //constructor takes a string for name, another for skill
        this.name = n;
        this.skill = s;
        
    }
    
    public void setTeam(team t){
        this.team = t;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public team getTeam(){
        return this.team;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getSkill(){
        return this.skill;
    }
    
    
}
