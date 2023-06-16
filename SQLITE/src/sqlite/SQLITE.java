/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sqlite;
import java.sql.*;
/**
 *
 * @author 91708
 */
public class SQLITE {

 
public static void main(String args[])throws Exception
{
Class.forName("org.sqlite.JDBC");
Connection con=DriverManager.getConnection("jdbc:sqlite:C://SQLlite//univ.bd");
Statement stm=con.createStatement();
ResultSet rs=stm.executeQuery("select * from dept");

int dno;
String dname;

while(rs.next())
{
dno=rs.getInt("deptno");
dname=rs.getString("dname");

System.out.println(dno+" "+dname);
}
}}