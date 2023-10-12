class Demo {
    void marry() {
        System.out.println("Deepika");
    }
}

class Client {
    public static void main(String[] args) {

        Demo obj = new Demo() {

                      void marry() {
                        System.out.println("11kattt");
                
                     }

                      Demo fun() {

                         Demo obj2 = new Demo();
                         obj2.marry();
                        System.out.println("funn");
                        return obj2; 

                    }
        
            }.fun();

        obj.marry();
    }
}
