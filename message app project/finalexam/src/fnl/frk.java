package fnl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

class Cat {
    private int id;
    private String bruh;
    Random rand =new Random();
    private String [][] quote= new String[2][2];
    public Cat(String name) {
        id = Idgiver.generateId();
        this.bruh=name;
        center.Register(Cat.this,getname(),getId() );
        quote [0][0]="bugun hava cok guzel";
        quote [0][1]="sen beni taniyor musun";
        quote [1][0]="ronaldo en iyisi";
        quote [1][1]="turkiyenin baskenti ankaradir";
         center cent=new center();
        cent.getquote(randquote());
    }
    public String randquote (){
        int i = rand.nextInt(2);
        int j= rand.nextInt(2);
        return quote[i][j];
       }
public String getname(){
        
        return bruh;
    }
    public int getId() {
        return id;
    }
}
//////////////////////////////////////////
class Cup {
    private int id;
    private String bruh;
    Random rand =new Random();
    private String [][] quote= new String[2][2];
    public Cup(String name) {
        id = Idgiver.generateId();
        this.bruh=name;
        center.Register(Cup.this,getname(),getId());
        quote [0][0]="bugun hava cok guzel";
        quote [0][1]="sen beni taniyor musun";
        quote [1][0]="ronaldo en iyisi";
        quote [1][1]="turkiyenin baskenti ankaradir";
         center cent=new center();
        cent.getquote(randquote());
    }
    public String randquote (){
        int i = rand.nextInt(2);
        int j= rand.nextInt(2);
        return quote[i][j];
       }
    public String getname(){
        
        return bruh;
    }
    public int getId() {
        return id;
    }
}
///////////////////////////////////////////////////////
 class Car {
    private int id;
    private String bruh;
    Random rand =new Random();
    private String [][] quote= new String[2][2];
    public Car(String name) {
        id = Idgiver.generateId();
        this.bruh=name;
        center.Register(Car.this,getname(),getId());
        this.quote [0][0]="bugun hava cok guzel";
        this.quote [0][1]="sen beni taniyor musun";
        this.quote [1][0]="ronaldo en iyisi";
        this.quote [1][1]="turkiyenin baskenti ankaradir";
          center cent=new center();
        cent.getquote(randquote());
    }
     public String randquote (){
        int i = rand.nextInt(2);
        int j= rand.nextInt(2);
        return quote[i][j];
       }
    public String getname(){
        
        return bruh;
    }
    public int getId() {
        return id;
    }
}
//////////////////////////////////////////////////////
class Cloud {
      private int id;
      private String bruh;
      Random rand =new Random();
      private String [][] quote= new String[2][2];
    public Cloud(String name) {
         id = Idgiver.generateId();
         this.bruh=name;
        center.Register(Cloud.this,getname(),getId());
        quote [0][0]="bugun hava cok guzel";
        quote [0][1]="sen beni taniyor musun";
        quote [1][0]="ronaldo en iyisi";
        quote [1][1]="turkiyenin baskenti ankaradir"; 
        center cent=new center();
        cent.getquote(randquote());
    }
    public  String randquote (){
        int i = rand.nextInt(2);
        int j= rand.nextInt(2);
        return quote[i][j];
       }
    public String getname(){
        
        return bruh;
    }
    
    public int getId() {
        return id;
    }
}
//////////////////////////////////////////////////////////////
 class Idgiver {
    private static int nextId = 1;

    public static int generateId() {
        return nextId++;
    }
}
///////////////////////////////////////////////////////
class center {
    static int b=1;
    public static ArrayList<Object>users = new ArrayList<Object>();
    public static ArrayList<Integer>idlist = new ArrayList<Integer>();
    public static ArrayList<String> filenames = new ArrayList<String>();
    ////////////////////////////////////////////////////////////////////
    public static void Register(Object a,String name,int id){
       filenames.add(name);
        users.add(a);
    idlist.add(id);
    int size =users.size();
    if (size == b) {
            String info = name+ " Sucessfully registered, id:"+id;
            String filedest = name+".txt";
            try {
                FileWriter WF = new FileWriter(filedest,true);
                WF.write(info+"\n");
                logger(info);
                WF.flush();
                WF.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            b++;
        }
    }
    ////////////////////////////////////////////////
    static String asd;
     public static String getquote(String quote){
        asd=quote;
        return quote;
     }
     /////////////////////////////////////////////////
    public static void sendmsg(String msg){
    int i=0;
    String [] parts = msg.split(":");
    int srcid = Integer.parseInt(parts[0]);
    String [] partsOfparts = parts[1].split(",");
    i=0;
    int [] desid = new int [partsOfparts.length];
     while(i<partsOfparts.length){
     if(!(parts[1].equals("all"))){
    desid[i]= Integer.parseInt(partsOfparts[i]);
     }
     i++;
     }
     String content =parts[2];
     i=0;
     //////////////////////////////////////////////
     if(parts[1].equals("all")){
            while(i<idlist.size()){
                if(srcid==idlist.get(i)){
            
                }
                else{
                try{
                FileWriter WF = new FileWriter(filenames.get(i)+".txt",true);
                if(content.endsWith("quote")){
                    String replacer2 = "Got msg from "+ srcid+":"+"Recieved msg to"+ idlist.get(i)+":"+"Msg is="+asd;
                    WF.write(replacer2+"\n");
                logger(replacer2+"\n");
                }
                else{
                String replacer1 = "Got msg from "+ srcid+":"+"Recieved msg to"+ idlist.get(i)+":"+"Msg is="+content;
                WF.write(replacer1+"\n");
                logger(replacer1+"\n");
                }
                WF.flush();
                WF.close();
             }
            catch(IOException w){
            w.printStackTrace();
                    }
                }
                i++;
            }
        }
        //////////////////////////////////////////////////////////////////////
     i=0;
     int j=0;
     //////////////////////////////////////////////////////////////////
    while(j<desid.length){
        i=0;
        while(i<idlist.size()){
        if(desid[j]==idlist.get(i)){
                try{
                FileWriter WF = new FileWriter(filenames.get(i)+".txt",true);
                 if(content.endsWith("quote")){
                    String replacer4 = "Got msg from "+ srcid+":"+"Recieved msg to"+ idlist.get(i)+":"+"Msg is="+asd;
                    WF.write(replacer4+"\n");
                 logger(replacer4+"\n");
                }
                else{
                String replacer3 ="Got msg from "+srcid+":"+"Recieved msg to"+desid[j]+":"+"Msg is="+content;
                 WF.write(replacer3+"\n");
                 logger(replacer3+"\n");
                }
                WF.flush();
                WF.close();
             }
            catch(IOException w){
            w.printStackTrace();
                    }
                }
                i++;
            }
            j++;
        }
    }
    /////////////////////////////////////////////////////////
    public static void logger(String msges){
        try{
                FileWriter WF = new FileWriter("log.txt",true);
                 WF.write(msges+"\n");
                WF.flush();
                WF.close();
             }
            catch(IOException w){
            w.printStackTrace();
                    }
                }
 }
///////////////////////////////////////////////////////////
public class frk {
    public static void main(String[] args) {
        Cat cat1 = new Cat("cat1");
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Cup cup1 = new Cup("cup1");
        Cup cup2 = new Cup("cup2");
        Cup cup3 = new Cup("cup3");
        Cloud cloud1 = new Cloud("cloud1");
        
       center.sendmsg("3:all:merhaba ben furkan quote");
       center.sendmsg("3:1,5:harkasa salam ");
    }
}

/*                                                 EXPLANATİON RAPORT
 * in my main l created my objects and gave them a single name after that l opened classes for my each object inside of the classes 
 * l declared int id for assigning ids and get them to my objects also l declared string bruh for geting object names(l used them for naming txt files)
 * than l created a random and a 2 dimensional array for quote selecting,than l opened a constructor for all objects and 
 * l gave tham and id with function called generateid in idgiver class. l assigned my names to bruh for getting names to center class and l also checked it 
 * so l have get name  methods in classes to do it and and also l have a getid method fıor geting id to center class and than lm taking all this object informations to
 * my center classes register method (l called that method in constructor) and l assigned different quotes in 2d array and outside of constructor 
 * l created a method it giving a random number to i and j indexes and l assigned tham to 2d array by this way l picked a random quote and l created an object to center class
 * than l assigned this object to my selected quote than with a function call l took it inside of center class. Also l created a idgiver class 
 * its assigning unique ids for every object with a method and than l created my center class for register,send message and getingquote methods inside of my center class
 * l created object,string,integer arraylists for storing the objects. their ids and their names and same elements of this arraylists contains same objects informations so it usefull
 * for me for exmple:(idlist[0],users[0],filenames[0] this information belongs same object) in register method i put my informations to arraylists and than  with this informations 
 * l let them know the object who registered l sent a message to them and l selected my file destination with name information after that l print them in destination file with 
 * filewriter and l created a get quote method that assgingns my random selected quote to a string and than l created sendmsg method that sends message to objects
 * l took my message from main to inside of my sendmsg method and l split it from ":" marks than l put them in a string array called parts, l transform my parts[0]
 * to integer with parseint and its my source id after that l split my parts[1] from ","marks and l out them in a string array called partofparts(for seperating to recievers)
 * and if the reciever part in my message which is my part[1] is not "all" l used parse int and convert the partofparts element to integer and l assigend them into a int array
 *  called destid but if its "all" writen there it will not converting to integer it will stary as a text and than l created a string called content and it took the conmtent 
 * of parts[2] and l seperate my writing part to 2 piece first is if message include "all" second is not include so if the reciever part is "all" l checked for my srcid 
 * and first element of idlist(i) are they same or not when they are equal it printing nothing bc l dont want to sender see its own message then l increased i and 
 * wrote message to destination files and l checked for is the end of content(message) quote or not if its quote i put my replacers content part to 
 * asd(which is contains my randomquotes), if it not contains quote in else part its already printing it destination file and 
 * l did the same things for if reciever part not contains "all" at the end l created my logger  method that saves every events to inside a txt file called log.txt
 * l called logger method after all filewriters and l collected every event to inside of my log.txt class.
 * Ahmet Furkan Yorulmaz
 */