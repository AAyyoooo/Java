/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mysum.cmd;

/**
 *
 * @author 91708
 */
public class MysumCmd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double s=0;
        for(String x:args )
        {
            s=s+ Double.parseDouble(x);
        }
        System.out.println(s);
        
    }
    
}
