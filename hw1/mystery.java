package hw1;

public class mystery {
    public static int mystery(int[] inputArray, int k) { 
        int x = inputArray[k]; 
        int answer = k; 
        int index = k + 1; 
        while (index < inputArray.length) {
             if (inputArray[index] < x) { 
                 x = inputArray[index]; 
                 answer = index; 
                } 
                 index = index + 1; 
        }return answer; 
    }

}

// what mystery returns if inputArray = [3, 0, 4, 6, 3] and k=2.

// Method returns: 4
