
public class QuizP3 {
    
    String Name;
    String Phone;
    String Address;


QuizP3(String paramNama, String paramPhone, String paramAddress) {
        this.Name = paramNama;
        this.Phone = paramPhone;
        this.Address = paramAddress;
    } 
    
    public void main(){
        System.out.println(Name + " sedang bermain" );
    }

    public void tidur(){
        System.out.println(Name + " sedang tidur");
    }

    public void info(){
        System.out.println(Name + " Merek hp nya " + Phone + " Tinggalnya di " + Address);
    }

    }