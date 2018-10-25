/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Yizhe Liu
 */
public class PersonDirectory {
    
    ArrayList<Person> personList;
    
    public PersonDirectory(){
        personList = new ArrayList();
        
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
   

    public Person addPerson() {
        Person p = new Person();
        personList.add(p);
        return p;
    }
    
    public void loadPersonDirectory(){
      try {
            BufferedReader reader = new BufferedReader(new FileReader("Data_csv/Persons.csv"));//换成你的文件名   
            String line = null; 
            while((line=reader.readLine())!=null){
                //String Item = line;
               String Item[] = line.split(",");
               Person p = this.addPerson();
               p.setFirstName(Item[0]);
               p.setLastName(Item[1]);

               System.out.println(p.getFirstName() + " is added to the PersonDirectory");
            }
        } catch (Exception e) {    
            e.printStackTrace();    
        }  
    }
    
    public Person searchPersonByUserName(String userName){
        Person person = new Person();
        for(Person p: personList){
            for(UserAccount ua: p.getPersonAccountList()){
                if(ua.getUserName().equals(userName))
                    person = p;
            }
        }
        
        return person;
    }
    
    
}
