/*
2) A joint family consisting of 10 households lives in the same compound. Due to mounting electricity bills, the head (Mr. X) of the joint family decides to analyze the consumption pattern (in terms of the billed amount) of each household for a year. Mr. X needs access to the following information for his analysis. Write a function to find: 
1) The total expenditure on electricity consumption by each household in a year. 
2) The maximum and minimum electricity consumption of each household in a year. 
3) The amount by which each household exceeded the average consumption (+/-) of all households in the month of June. 
4) The maximum, minimum and average electricity consumption of all households in a year. 

Demonstrate how you would use a two dimensional matrix to help Mr. X.
*/

import java.util.Scanner;

class TW02_Household {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("How many households? ");
    int householdCount = sc.nextInt();

    float[][] data = new float[householdCount][];
    for (int i = 0; i < data.length; i++) {
      System.out.println("Enter the data for Household " + (i + 1));
      float[] householdData = new float[12 * 2];
      for (int j = 0; j < 12; j++) {
        System.out.print("Enter the electricity consumption and bill for month " + (j + 1) + ": ");
        float electricityConsumption = sc.nextFloat();
        float bill = sc.nextFloat();

        householdData[j * 2] = electricityConsumption;
        householdData[j * 2 + 1] = bill;
      }
      
      data[i] = householdData;
    }

    float[] totalExpenditure = getTotalExpenditure(data);
    System.out.println("---Total Expenditure---");
    for (int i = 0; i < totalExpenditure.length; i++) {
      System.out.println("  For household " + (i + 1) + ": " + totalExpenditure[i]);
    }

    float[][] maxAndMinElectricityConsumption = getMaxAndMinElectricityConsumption(data);
    for (int i = 0; i < maxAndMinElectricityConsumption.length; i++) {
      System.out.println("  For household " + (i + 1));
      
      System.out.println("Max. electricity consumption: " + maxAndMinElectricityConsumption[i][0]);
      System.out.println("Min. electricity consumption: " + maxAndMinElectricityConsumption[i][1]);
    }

    float[] avgDiffOfElectricityConsumptionInJune = getAvgDiffOfElectricityConsumptionInJune(data);
    System.out.println("---Average Difference of Electricity Consumption in June---");
    for (int i = 0; i < avgDiffOfElectricityConsumptionInJune.length; i++) {
      System.out.println("  For household " + (i + 1) + ": " + avgDiffOfElectricityConsumptionInJune[i]);
    }

    float[][] maxMinAndAvgElectricityConsumption = getMaxMinAndAvgElectricityConsumption(data);
    for (int i = 0; i < maxMinAndAvgElectricityConsumption.length; i++) {
      System.out.println("  For household " + (i + 1));

      System.out.println("Max. electricity consumption: " + maxMinAndAvgElectricityConsumption[i][0]);
      System.out.println("Min. electricity consumption: " + maxMinAndAvgElectricityConsumption[i][1]);
      System.out.println("Avg. electricity consumption: " + maxMinAndAvgElectricityConsumption[i][2]);
    }
}

  public static float[] getTotalExpenditure(float[][] data) {
    float[] generatedData = new float[data.length];
    for (int i = 0; i < data.length; i++) {
      float annualBill = 0;
      for (int j = 1; j < data[i].length; j += 2)
        annualBill += data[i][j];
      generatedData[i] = annualBill;
    }

    return generatedData;
  }

  public static float[][] getMaxAndMinElectricityConsumption(float[][] data) {
   
    float[][] generatedData = new float[data.length][];

    for (int i = 0; i < data.length; i++) {
      float max = 0, min = 0;  
      for (int j = 0; j < data[i].length; j += 2) {
        if (j == 0)
          max = min = data[i][j];
        else if (max < data[i][j])
          max = data[i][j];
        else if (min > data[i][j])
          min = data[i][j];
      }
      generatedData[i] = new float[] { max, min };
    }

    return generatedData;
  }

  public static float[] getAvgDiffOfElectricityConsumptionInJune(float[][] data) {
    float avgElectricityConsumptionInJune = 0;
    for (int i = 0; i < data.length; i++) {
      avgElectricityConsumptionInJune += data[i][5 * 2] / data[i].length * 2;
    }

    float[] generatedData = new float[data.length];
  
    for (int i = 0; i < data.length; i++) {
      generatedData[i] = data[i][5 * 2] - avgElectricityConsumptionInJune;
    }

    return generatedData;
  }

  public static float[][] getMaxMinAndAvgElectricityConsumption(float[][] data) {
    float[] avgData = new float[data.length];

    for (int i = 0; i < data.length; i++) {
      float avg = 0;
      for (int j = 0; j < data[i].length; j += 2) {
        avg += data[i][j] / data[i].length * 2;
      }

      avgData[i] = avg;
    }

  
    float[][] maxAndMinElectricityConsumption = getMaxAndMinElectricityConsumption(data);
    float[][] generatedData = new float[data.length][];

    for (int i = 0; i < avgData.length; i++) {
      generatedData[i] = new float[] { maxAndMinElectricityConsumption[i][0], maxAndMinElectricityConsumption[i][1], avgData[i] };
    }
    return generatedData;
  }
}