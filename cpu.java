public class cpu{
       
       class processor{
             int cores;
             String manufacturer;
             processor(int noC,String manu){
                   cores=noC;
                   manufacturer=manu;
                   }
             void display(){
                   System.out.println("\nprocessor info\n");
                   System.out.println("no:of cores:"+cores);
                   System.out.println("manufacture:"+manufacturer);
                   }
        }
        
        static class Ram{
              int mem;
              String manufacturer;
              Ram(int memmory,String sheersh){
                   mem=memmory;
                   manufacturer=sheersh;
                   }
              void display(){
                   System.out.println("\nRam info\n");
                   System.out.println("memmory:"+mem);
                   System.out.println("manufacturer:"+manufacturer);
                   }
              }
public static void main(String args[]){
        cpu.Ram obj1=new cpu.Ram(8,"intel");
        cpu obj2=new cpu();
        cpu.processor obj3=obj2.new processor(8,"samsung");
        obj1.display();
        obj3.display();
        } 
}               


                   










                                               
                