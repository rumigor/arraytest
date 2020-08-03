package testarray;

public class ArrayClass {
    public int[] returnArrayAfter4 (int [] array){
        int index = 0;
        for (int i = array.length-1; i >= 0; i--) {
            if (array[i] == 4) {
                index = i+1;
                break;
            }
        }
        if (array[0] != 4 && index == 0){
            throw new RuntimeException();
        }
        int [] newArray = new int[array.length - index];
        if (newArray.length >= 0) System.arraycopy(array, index, newArray, 0, newArray.length);
        return newArray;
    }

    public boolean isArrayRight(int [] array) {
        int one = 0;
        int four = 0;
        for (int value : array) {
            if (value != 1 && value != 4) {
                return false;
            } else if (value == 1) {
                one++;
            } else {
                four++;
            }
        }
        return one != 0 && four != 0;
    }
}
