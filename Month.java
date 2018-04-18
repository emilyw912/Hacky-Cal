
public class Month{
  
  //fields
  private int month;
  private int numDays;
  private int startDay;
  final private int[] totalNumDays = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
  final private int[] totalStartDays = new int[] {2,5,5,1,3,6,1,4,7,2,5,7};
  
  //returns fields
  private int getMonth() { return month; }
  private int getNumDays() { return numDays; }
  private int getStartDay() { return startDay; }
  
  //constructor
  public Month(int month){
    this.month = month;
    numDays = totalNumDays[month - 1];
    startDay = totalStartDays[month - 1];
   
  }
  
  public static void main(String[] args){
    
    Month m = new Month(2);
    System.out.println(m.getNumDays());
    System.out.println(m.getStartDay());
    
    //System.out.println(totalNumDays[2]);
  }
  
}
