/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amal magdi
 */
public class userBean {
    
    private String email;
    private String firstname;
    private String lastname;
    private String password;
    private String jab;
    private String address;
    private String birthday;
    private int creditBalance;
    
    public void setEmail(String data){
        email=data;
    }
    public void setFirstname(String data){
        firstname=data;
    }
    
    public void setLastname(String data){
        lastname=data;
    }
    
    
    public void setJob(String data){
        jab=data;
    }
    public void setBirthday(String data){
        birthday=data;
    }
    
    public void setAddress(String data){
        address=data;
    }
    
    public void setCreditBalance(int data){
        creditBalance=data;
    }
    
     public void setPassword(String data){
        password=data;
    }
    
    public String getEmail(){
        return email;
}

    public String getFirstname(){
        return firstname;
}
    
    public String getLastname(){
        return lastname;
}
    
    public int getCreditBalance(){
        return creditBalance;
}
    
    public String getJab(){
        return jab;
}
    public String getAddress(){
        return address;
}
    
    public String getBirthday(){
        return birthday;
}
    public String getPassword(){
        return password;
}
}