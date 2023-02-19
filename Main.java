import java.util.*;
public class Main {
    public static void main(String[] args) {
        //INTERFACE CREATION
        System.out.print("Read info:" +
                " \ngraph time collect data on   starting time of your day to work" +
                " \nand ending time meaning the time you reach your work place.\n" +
                "Amd Graphically represent them " );
        System.out.println("\nHello world!" +"-----------------------------------------------------------------------------------------");
        System.out.print("....Coming....");
        for(int y=0,u=10;y<10;y++,u=u+10)
        {  if ((u%20)==(0))
        { System.out.print(u+"%" +""+"");}

        }

        System.out.println("\nHello! Enter number of days to check it graphtime.");
         // ACEEPT NUM
        Scanner nawotwe=new Scanner(System.in);
       int days=nawotwe.nextInt();
       Scanner day=new Scanner(System.in);
       String []start=new String [10000];
        String []end=new String [9000];
        System.out.println("Dont type   :  or semicolon when entering time");//may change
        for(int i=0,o=1;i<days;i++,o++)
        {
            System.out.println("Enter start time\n"+"DAY"+o+":");
            start[i]=day.nextLine();
            System.out.println("Ending  time");
            end[i]=day.nextLine();
        }

        for(int ka=0,yka=1;ka<days&&start[ka].indexOf(1)!=0;ka++,yka++)
        {
        System.out.println("Day:"+yka+"Start time:"+start[ka].charAt(0)+":"+start[ka].charAt(1)+start[ka].charAt(2)+"\n End time:"+end[ka]);

        }
    }
}