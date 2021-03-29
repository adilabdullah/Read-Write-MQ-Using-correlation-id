/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbreadwritemq;

import com.java.model.Accounts;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class DbConnection {
      static ResultSet rs;
    static Connection con;
    static Statement st;
    
    
   
    
    
    public static List<Accounts> getAccount(String acct_no)
    {
        List<Accounts> li=new ArrayList<Accounts>(); 
     try{
      String sql="SELECT * FROM banking.accounts where account_no='"+acct_no+"'";
      st=DbConnection.Conn().createStatement();
      rs=st.executeQuery(sql);
      if(rs.next()){
      li.add(new Accounts(rs.getInt("sno"),rs.getString("account_no"),rs.getString("account_title"),
              rs.getDouble("min_limit"),rs.getDouble("max_limit"),rs.getInt("tran_limit"),rs.getDouble("balance"),
              rs.getString("account_type"),rs.getString("statuss"),rs.getDouble("max_tran_limit"),rs.getString("opening_date")));
      
      }
      return li;
     }
     catch(Exception ex)
      {
    //  ex.printStackTrace();
      return null;
      
      }
     
    }
    
    public static void main(String[] args)
    {
     System.out.println(DbConnection.Conn());
    System.out.println(getAccount("00311006119831"));
    }
    
     
    public static Connection Conn()
      {
     try{
          Class.forName("com.mysql.jdbc.Driver");
      con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","root");
    st=con.createStatement();
    return con;
     }
     catch(Exception ex)
     {
     ex.printStackTrace();
     return null;
     }
      }
}
