
package Classes;


public class WarehouseKeeper extends Person {
    
    //fields:
    
    private int personnel_code;
    private String password;
    
    //constructors:
    
    WarehouseKeeper(){};
    WarehouseKeeper(int personnel_code, String password){
        
        this.personnel_code = personnel_code;
        this.password = password;
    }
    
    //Mutator(setter) Methods :
    
    public void setPersonnelCode(int personnel_code){
        
        if(personnel_code > 0)
            this.personnel_code = personnel_code;
    }
   
    public void setPassword(String password){
        
        this.password = password;
    } 
    
    //Accessor(getter) Methods:
    
    public int getPersonnelCode(){
        
        return personnel_code;
    }
    
    public String getPassword(){
        
        return password;
    }
           
    
}