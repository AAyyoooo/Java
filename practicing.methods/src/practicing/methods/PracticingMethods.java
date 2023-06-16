/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicing.methods;

/**
 *
 * @author 91708
 */
public class PracticingMethods {

    void Changes(int x[],int index,int value){
        x[index]=value;
    }
    public static void main(String[] args) {
       int A[]={1,2,4,5,600,7};
       PracticingMethods m=new PracticingMethods();
       m.Changes(A,2,34);
       for(int x:A)
       { System.out.print(x+",");
    
    }
    
}}
