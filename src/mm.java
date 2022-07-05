public class mm extends animal {


        public static void main(String[] args){
//create an array of Animal class with size 3
//initialise all 3 elements of this Animal class
      //      with //Dog, Cat and Tiger class object.
//call the all methods (eat,walk,makeNoise) from
       //             all
//the 3 objects.



            animal a1= new dog();
            a1.eat();
            a1.makeNoise();
            a1.walk();
            System.out.println("=============");

            animal a2= new cat();
            a2.eat();
            a2.makeNoise();
            a2.walk();
            System.out.println("=============");
            animal a3 =new tiger();
            a3.eat();
            a3.makeNoise();
            a3.walk();
            System.out.println("=============");



        }
    }


