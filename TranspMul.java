class Bicycle{
    void displayFeatures(){
        System.out.println("Features: pedals, manual power");
    }
}

class Motorbike extends Bicycle{
   void displayFeatures(){
       super.displayFeatures(); 
       System.out.println("Added feature by motorbike: Engine");
  }
}

class ElectricBike extends Motorbike{
   void displayFeatures(){
     super.displayFeatures();
System.out.println( "New Feature by ElectricBike: Electric motor and battery");
    }
}
class Transpmul{
    public static void main(String ards[]){
        ElectricBike myEbike = new ElectricBike();
        myEbike.displayFeatures(); 
    }
}