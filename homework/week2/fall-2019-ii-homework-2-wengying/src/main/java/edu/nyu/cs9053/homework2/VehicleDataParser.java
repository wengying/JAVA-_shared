package edu.nyu.cs9053.homework2;

/**
 * User: Wengying Wen
 */

public class VehicleDataParser {

    /**
     * Given a 4 byte response, {@code mode01Pid00Response}, parse according to the {@literal SAE J1979} documentation.
     * For example, if {@code mode01Pid00Response} was {@literal 0xBE1FA813} the return value would be equal to:
     * {@literal new int[] { 0x01, 0x03, 0x04, 0x05, 0x06, 0x07, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x13, 0x15, 0x1C, 0x1F, 0x20}}
     * @param mode01Pid00Response four byte response
     * @return an array of supported PID values given the input, {@code mode01Pid00Response}
     * @see {@literal https://en.wikipedia.org/wiki/OBD-II_PIDs#Service_01_PID_00}
     */
	 
    public static int[] supportedPids(int mode01Pid00Response) {
		
		int actualInput;                                          //the actual unsigned input 
		int[] toBinary = new int[32];                             //creat an array to store input in binary
		int supportedNumber = 0;                                  //to store how many PID is supported
		
		int[] pidNumber = new int[32];                            //creat an array of PID numbers
		for (int i =0;i<32;i++){
			pidNumber[i]=i+1;                                         
		}
		
		int pointer = 32;                                         //creat a pointer and initialize it to point at the last bit
		if (mode01Pid00Response < 0){
			toBinary[0]=1;
			actualInput=-(mode01Pid00Response+1);                 //find out the actual unsigned input when the first bit is 1
			while(pointer>0){
				toBinary[--pointer] = (int)actualInput % 2;      
				actualInput /= 2;
			}
		for (int i =0;i<32;i++){
			toBinary[i]=1-toBinary[i];                            //convert the input to binary form when the first bit is 1
		}
		}
		else{
			toBinary[0]=0;
			actualInput=mode01Pid00Response;
			while(pointer>0){
				toBinary[--pointer] = (int)actualInput % 2;       //convert the input to binary form when the first bit is 0
				actualInput /= 2;
			}
		}
		
		for (int i =0;i<32;i++){                     
			if (toBinary[i]==1){
				supportedNumber++;                                //count up how many PID values are supported
			}
		}
		
		int[] supportedID = new int[supportedNumber];             //creat an array of returned supported ID
		int position =0;                                          //creat a pointer of the array supported ID
		
		for (int i =0;i<32;i++){
			if (toBinary[i]==1){
				supportedID[position]=pidNumber[i];
				position++;
			}
		}
		
		return supportedID;
	}


    /**
     * Given a {@code pid} between [0x1,0x20] return true iff {@code mode01Pid00Response} supports it.
     * @param pid value between [0x1,0x20] to check for support within {@code mode01Pid00Response}
     * @param mode01Pid00Response four byte response
     * @return true iff {@code mode01Pid00Response} supports {@code pid}.
     * @throws IllegalArgumentException if {@code pid} is less than 0x1 or greater than 0x20
     */
	 
    public static boolean isSupported(int pid, int mode01Pid00Response) {
			
		boolean isSupported = false;                            	   //initialize the returned value
		
		if(pid >0x20 || pid <0x01) {                               	   //throw IllegalArgumentException if the input PID number is less than 0x1 or greater than 0x20
			throw new IllegalArgumentException();
			}
			
		else{
			int[] supportedPids = supportedPids(mode01Pid00Response);  //find out the supported ID of the given input
			int numberSupported = supportedPids.length;
			for(int i = 0; i < numberSupported; i++){                  //find out whether the given PID is supported
				if ( pid == supportedPids[i]){
					isSupported = true;
				}
			}
		}
		
			return isSupported;
	}
	
}