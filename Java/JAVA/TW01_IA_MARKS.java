/*
1) Write a Java program to accept IA marks obtained by five students in three subjects. The program should accept marks obtained by each student and display the total marks and the average marks. The average marks is computed using a method as the average of best two marks obtained.
*/

import java.util.Scanner;
public class TW01_IA_MARKS {
    public static void main(String[] args){
        int[][] marks=new int[5][3];
        int[] total = {0,0,0,0,0};
        int[] avg = new int[5];
        Scanner in = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.println("Enter the marks of student "+(i+1));
            for(int j=0; j<3; j++){
                marks[i][j]=in.nextInt();
                total[i]=total[i]+marks[i][j];
            }
            
        }
        for(int i=0;i<5;i++) 
            avg[i] = computeAvg(marks[i][0], marks[i][1],marks[i][2]);

        System.out.println("Student results:");
        for(int i=0;i<5;i++){
            System.out.println("For student " +(i+1));
            System.out.println("Total marks:" +total[i]);
            System.out.println("Avreage marks:" +avg[i]);
        }

        
    }
    static int computeAvg(int m1,int m2,int m3){
        int min = m1;
        if(m2<min)
            min = m2;
        if(m3<min)
            min = m3;
        int total = (m1+m2+m3-min);
        return(int)Math.ceil(total/2.0);

    }
}