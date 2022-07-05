public class Main {

    public static void main(String[] args){
        bird b1 = new parrot();
//with this b1 reference call the fly method of
        b1.fly();
//and after downcasting this b1 reference to the
       // Parrot class object, call the sing method also
        parrot p1=(parrot)b1;
        p1.sing();
    }

}
