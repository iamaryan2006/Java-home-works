
package finding.current.time;

public class FindingCurrentTime {

    public static void main(String[] args) {
        long total_mili_second = System.currentTimeMillis();
       long total_second = total_mili_second/1000;
       long currentSecond = total_second%60;
       long total_minute = total_second/60;
       long currentminute = total_minute%60;
       long totalhour = total_minute/60;
       long currenthour = totalhour%24;
       //for kabul afg
       currentminute+=30;
       if (currentminute>=60){
           currentminute-=60;
           currenthour++;
       
       }
       currenthour+=4;
       if(currenthour>=24){
           currenthour-=24;
       }
 
        System.out.println(currenthour+":"+currentminute+":"+currentSecond);
    }
    
}
