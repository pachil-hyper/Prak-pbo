import java.util.jar.Attributes.Name;

public class Person {
    
    String Name;
    String Phone;
    String Address;
    int NPM;

    public void main(){
        System.out.println(Name + " sedang bermain" );
    }

    public void tidur(){
        System.out.println(Name + " sedang tidur");
    }

    public void info(){
        System.out.println(Name + NPM + " Merek hp nya " + Phone + " Tinggalnya di " + Address);
    }

    }