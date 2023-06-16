/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validate.overloaded;

/**
 *
 * @author 91708
 */
public class ValidateOverloaded {

  static   boolean Validate(int age){
        if(age>=3 && age<=15)
            return true;
        else
            return false ;
    }
    public static void main(String[] args) {
        // TODO code application logic here
   System.out.println(Validate(78));
    
    }
    
}
