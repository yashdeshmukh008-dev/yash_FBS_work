
public class ExcThrow1 {
    public static void main(String[] args) {
        AddmissionForm af1 = new AddmissionForm(17,"yash",55,50000,10000);
        try{
            af1.validateForm();
        }catch(EmptyNameException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(UnderageException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(InvalidPercentageException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(NotFitForAddmissionException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(FeesNotPaidException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(InsuffiecientFeesException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
class AddmissionForm{
    String name;
    int age;
    double percentage;
    double courseFees;
    double feesPaid;

    public AddmissionForm(int age,String name,double percentage,double courseFees, double feesPaid){
        this.age = age;
        this.name = name;
        this.percentage = percentage;
        this.courseFees = courseFees;
        this.feesPaid = feesPaid;
       // this.minfeesPer = minfeesPer;
    }
    public void validateForm() throws EmptyNameException,UnderageException,InvalidPercentageException,NotFitForAddmissionException,FeesNotPaidException,InsuffiecientFeesException{
        if(this.name == " " || this.name == ""){
            throw new EmptyNameException("you entered name is not valid");
        }
        else if(this.age<17){
            throw new UnderageException("your age is not valid for admission");
        }
        else if(this.percentage<0 || percentage > 100){
            throw new InvalidPercentageException("your percentage is not valid");
        }
        else if(this.percentage < 35){
            throw new NotFitForAddmissionException("you are not fit for addmission");
        }
        else if(this.feesPaid == 0){
            throw new FeesNotPaidException("fees is not paid by you");
        }
        else if(this.feesPaid <= (courseFees * 30)/100){
             throw new InsuffiecientFeesException("you have not paid sufficient fees");
        }
        else{
            System.out.println("admission Successfull..");
        }
    }

}

class UnderageException extends Exception{
    public UnderageException(String message){

        super(message);
    }
}
class EmptyNameException extends Exception{
    public EmptyNameException(String message){

        super(message);
    }
}
class InvalidPercentageException extends Exception{
    public InvalidPercentageException(String message){

        super(message);
    }
}
class NotFitForAddmissionException extends Exception{
    public NotFitForAddmissionException(String message){

        super(message);
    }
}
class FeesNotPaidException extends Exception{
    public FeesNotPaidException(String message){

        super(message);
    }
}
class InsuffiecientFeesException extends Exception{
    public InsuffiecientFeesException(String message){

        super(message);
    }
}
