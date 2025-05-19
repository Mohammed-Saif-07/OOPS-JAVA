package bank;


class Account{
    public String name;  
    protected String email;
    private String password; 
    
    public String getPassword(){  //
        return this.password;     //    -->getter
    }                             //

    public void setPassword(String pass){    //
        this.password = pass;                //   --> setter             
    }                                        //   
}

public class Bank{
        public static void main(String[] args) { // main class is public so it can be accessible
        Account account1 = new Account();
        account1.name = "saff";
        account1.email = "saif@gmail.com";
        account1.setPassword("absd"); // Setting the password using the setPassword method
        System.out.println(account1.getPassword()); // Getting the password using the getPassword method
    }
} 

// public = this information can be accesed by anyonne in the whole class
// dusre package me bhi access kr sakte hai

// agar ham kuch bhi nhi lagate to vo default hota hai
// default ko hamre package ke alava koi aur nhi access kr sakta

// protected = hamare package me koi bhi access kr sakte hai but dosre package  
// me sirf sub-classes hi access kr sakte hai

// private ko class ke bahar koi access nhi kr sakta
// only be accessed by using getters and settrs