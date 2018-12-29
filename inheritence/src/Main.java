import java.awt.*;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args){
        Dimensions dimensions=new Dimensions(20,20,5);
        Case theCase=new Case("220B","Dell","240",dimensions);
        Monitor theMonitor = new Monitor("27 inch Beast","Acer",27,new Resolution(2540,1440));
        Motherboard theMotherBoard=new Motherboard("Bj-200","Asus",4,6,"version 2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherBoard);

        thePC.powerUp();

    }
}
