class Demo {


    Demo(){

        System.out.println("demo()");
    }
    Demo(Demo fun){

        System.out.println("demo(this)");
        return ;
        
    }
}

class Client {
    public static void main(String[] args) {


        Demo obj1 = new Demo();
        Demo obj = new Demo(obj1);
    }
}
