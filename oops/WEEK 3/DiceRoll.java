// 4. Write a java program : rolling a pair of dices 10 times [ each attempt should be delayed
// by 10000 ms ] and count number Successful attempts.
// successful attempt : If the pair of Dice results in same values.

import java.util.Random; 
public class DiceRoll 
{ 
    public static void main(String args[]) 
    { 
        Random random = new Random(); 
        int freq1=0, freq2=0, freq3=0, freq4=0, freq5=0, freq6=0; 
        for(int roll=1; roll<10000; roll++) 
        { 
            int dice1 = 1+random.nextInt(6);  
            int dice2 = 1+random.nextInt(6); 
            if(dice1 == dice2) 
            { 
                switch(dice1) 
                { 
                    case 1: ++freq1; 
                    break; 
                    
                    case 2: ++freq2; 
                    break; 

                    case 3: ++freq3; 
                    break; 

                    case 4: ++freq4; 
                    break; 

                    case 5: ++freq5; 
                    break; 

                    case 6: ++freq6; 
                    break; 
                } 
            } 
        } 
        System.out.println("face\tFrequency:"); 
        System.out.println("1\t"+freq1+"\n2\t"+freq2+"\n3\t"+freq3+"\n4\t"+freq4+"\n5\t"+freq5+"\n6\t"+freq6); 
    } 
}