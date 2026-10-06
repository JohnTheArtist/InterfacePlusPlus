//if a class implements an interface then the class must provide the definition of
//the abstract method of the interface

public class Regular extends Abstract_Class implements Interface_A, Interface_B{

    @Override
    public void AbstractMethod_E(){
        System.out.println("Regular class is defining abstract method E");
    }

    @Override
    public void method_D1(){
        System.out.println("Regular class is defining method D1 because it inherits interface D");
    }
    @Override
    public void method_C1(){
        System.out.println("Regular class is defining method C1 because it inherits interface C");
    }

    @Override
    public void abstract_method_AC(){
       System.out.println("Regular class is defining abstract method AC");
   }


    @Override
    public void method_1(){
        System.out.println("Regular class is printing method_2A");
    }

    @Override
    public void method_2(){
        System.out.println("Regular class is printing method_2B");
    }


    @Override
    public void method_1_A(){
        System.out.println("Regular class in implementing method_1_A");
    }

    @Override
    public void method_2_A(){
        System.out.println("Regular class in implementing method_2_A");
    }

//    @Override
//    public void display_information(){
//        System.out.println("Regular class is overriding display_information method");
//    }

}
