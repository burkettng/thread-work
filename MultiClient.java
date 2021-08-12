/* 
 * This will be our client class that creates and get the array to be 
 * summed up. 
 * 
 * @author Nicholas Burkett 
 * @version V1
 * @date 08/10/21
 */

 //Need to import the proper fields. 
 import java.util.Scanner; //Import Scanner 
 import java.util.ArrayList; //Import ArrayList 

 //Here is the client class that will run everything. 
 public class MultiClient extends Thread{

     ArrayList<Integer> arrList = new ArrayList<Integer>(); 
     //Main class for the program. 
     public static void main(String[] args){

         MultiClient newClient = new MultiClient();
         newClient.getArray();
         
         for(int iterator : newClient.arrList){
             System.out.print(iterator + " ");
         }
     }

     //Creating the get array method that will allow an array to be filled for summation. 
     public ArrayList<Integer> getArray(){

         Scanner newScan = new Scanner(System.in); //Create a Scanner obj. 
         boolean helperFlag = true; //Create a flag for looping. 

         while(helperFlag){

             System.out.println("Please choose a number to add to the array: "); //Prompt user for input.
             char nextChar = newScan.next().charAt(0); //Grab the user input. 
             if((nextChar - 113) == 0){
                 //Land here if user has input a 'q' to quit
                 System.out.println("Thank you for adding elements!");
                 helperFlag = false; 
             }
             else if((nextChar > 47) && (nextChar < 58)){

                 //Add the number to the array. 
                 int helperVar = Character.getNumericValue(nextChar); //Get the numeric value of the character. 
                 arrList.add(helperVar); //Add new int to the array. 
             }
             else{

                 System.out.println("You must enter a valid input betweeon 0-9.");
             }
         }
         return arrList;
     }

     //Here is the actual math that we will need to bread down into threads.
     public int sumArray(ArrayList<Integer> arr){
         return 0;
         //fuck me.
     }

 }