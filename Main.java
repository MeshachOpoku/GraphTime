import java.util.AbstractList;
import java.util.Iterator;

class hello <t, u>
{
   t oq;
   u op;

   //constructor creation
   hello(t oq, u op)
   {
       this.oq=oq;
       this.op=op;

   }
   //
    //
   public  void print (){
       System.out.print("Contain the first  passed variable" + op + "\n and the passed " + oq);}

}
//generic code
 class MyGene <T>{
T x;
MyGene(T X){this.x=x;}
}
//Gen



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String name = "scss";
        int jin = 0;
        hello<String, Integer> refer = new hello<String, Integer>(name, jin);
        refer.print();


        //CREATING GENERIC METHODS


    }
}