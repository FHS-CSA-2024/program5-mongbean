//import stuff here?

//Your code here
public class Program5{
    public static void main(String args[]){
        String names[] = new String[] {"Royale", "Koopa King", "Pipe Frame", "Badwagon"};
        int miles[] = new int[] {286, 412, 361, 161};
        int gallons[] = new int[] {9, 40, 18, 11};
        for (int i=0; i<4; i++){
            System.out.println(names[i]+ " averaged " + (double)((int)((double)miles[i]*10/gallons[i]+0.5))/10 + "m/g.");
        }
        
    }
}
//Paste console output below:
/*
Royale averaged 31.77777777777778m/g.
Koopa King averaged 10.3m/g.
Pipe Frame averaged 20.055555555555557m/g.
Badwagon averaged 14.636363636363637m/g.


*/
