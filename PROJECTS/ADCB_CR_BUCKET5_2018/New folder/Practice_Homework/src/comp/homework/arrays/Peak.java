package comp.homework.arrays;

public class Peak {

		    public static int[] PeakElements(int[] arr) {
		        int n = arr.length;
		        int[] tempPeaks = new int[n]; 
		        int peakCount = 0;
		        
		        
		        if (n == 1) {
		            return new int[] {arr[0]};
		        }
		        
		        
		        if (arr[0] >= arr[1]) {
		        	tempPeaks[peakCount] = arr[0];
		        	peakCount++;
		        }
		        
		        
		        for (int i = 1; i < n - 1; i++) {
		            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
		            	tempPeaks[peakCount] = arr[i];
		            	peakCount++;
		            }
		        }
		        
		        
		        if (arr[n - 1] >= arr[n - 2]) {
		            tempPeaks[peakCount++] = arr[n - 1];
		        }
		        
		        
		        int[] peaks = new int[peakCount];
		        for (int i = 0; i < peakCount; i++) {
		            peaks[i] = tempPeaks[i];
		        }
		        
		        return peaks;
		    }

		    public static void main(String[] args) {
		        int[] array = {1, 3, 5, 4, 2};
		        System.out.println("These are the arrays from which to find peak elements :");
		        for (int i = 0; i < array.length; i++) {
		        	
		            System.out.print(array[i] + " ");
		        }
		        System.out.println("");
		        int[] peakElements = PeakElements(array);
		        for (int peak : peakElements) {
		            System.out.println("the peak element is : "+peak);  
		        }
		    }
		}

	
