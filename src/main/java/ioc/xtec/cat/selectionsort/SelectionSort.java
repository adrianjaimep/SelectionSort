package ioc.xtec.cat.selectionsort;

public class SelectionSort {

    
     public static void main(String[] args) {
        System.out.println("Adrian Jaime Paniagua");
        System.out.println("He aprés molt fent el mòdul 8 de DAW, encara que hagi estat dur!!!");
        // La resta del teu codi de l'algorisme SelectionSort...
    }
     
   public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public boolean contains(int[] arr, int value) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }

        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
    
}
