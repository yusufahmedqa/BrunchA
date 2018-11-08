public class Emp {


    int eid;
    int salary;
   static  String ceo;
   static {
       System.out.println("5");
   }
   static {

       ceo="Ashik";
       System.out.println("static1");
   }
   static {
       System.out.println("2nd static");
   }


    public Emp(){

        eid=1;
        salary=9000;
    }
    static{


        System.out.println("static 3");
    }



    public void show(){
        System.out.println(eid+ " : "+ salary +"  :  " + ceo );

    }




}


