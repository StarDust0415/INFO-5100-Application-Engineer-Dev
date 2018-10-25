/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Yizhe Liu
 */
public class ConfigureABusiness {
    
    public static Business Initialize(String n){
    
        Business b = new Business(n);

        PersonDirectory pd = b.getPd();
        UserAccountDirectory uad = b.getUad();
        
        pd.loadPersonDirectory();
        
// 为 每个 person 读取 userAccount
        for(Person p: b.getPd().getPersonList()){
            p.loadUserAccount();
            System.out.println("1");
            System.out.println(p.getPersonAccountList().get(0).getPassword());
        }
// 把 person 中 的 personUserAccount 加入 UserAccountDirectory       
        for(Person p: b.getPd().getPersonList()){
            for(UserAccount ua: p.getPersonAccountList()){
                uad.getUserAccountList().add(ua);
                System.out.println(ua.getFirstName());
            }
        }
        
// 把 Account

        return b;
    }
    
}
