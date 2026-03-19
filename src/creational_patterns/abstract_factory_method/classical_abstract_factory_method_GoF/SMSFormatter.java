package creational_patterns.abstract_factory_method.classical_abstract_factory_method_GoF;

public class SMSFormatter implements Formatter{
    public String format(String msg){
        return "SMS FORMAT: " + msg;
    }
}
