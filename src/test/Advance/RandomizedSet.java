package test.Advance;


import java.util.List;

public class RandomizedSet {
    int[] val;

    int index;

    RandomizedSet(int[] value) {
        this.val = value;
    }

    public Boolean insert(int value) {
        if (this.val[0] == 0) {
            this.val[0] = value;
            return true;
        }
        //checkValueIsThere(value);
        if (!checkValueIsThere(value)) {
            int existingArrayLength = this.val.length;
            int[] newArray = new int[existingArrayLength + 1];
            for (int i = 0; i < newArray.length - 1; i++) {
                newArray[i] = this.val[i];
            }
            newArray[newArray.length - 1] = value;
            showSetValues(newArray);
            this.val = newArray;
            return true;
        }
        return false;
    }

    public boolean remove(int value) {
        int len = this.val.length;
        if (checkValueIsThere(value)) {

            int[] resultArray = new int[len - 1];
            int k = 0;
            for (int i = 0; i < this.val.length; i++) {
                if (this.val[this.index] != this.val[i]) {
                    resultArray[k++] = this.val[i];
                }
            }

           /* if (this.index == len-1) {
                len--;
                for (int i = 0; i < len; i++) {
                    resultArray[i] = this.val[i];
                }
            }
            for (int start = this.index + 1; start < this.val.length; start++) {
                this.val[start - 1] = this.val[start];
            }*/
/*
            for(int i=0;i<len;i++){
                resultArray[i] = this.val[i];
            }*/
            this.val = resultArray;
            showSetValues(this.val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        int randomValue = 0;
        if(this.val.length == 0){
            System.out.println("Sorry the Array is Empty, Insert the Array");
            return -1;
        }
        randomValue = buildRandomValue();
        return this.val[randomValue];
    }

    static int start = 0;

    public int buildRandomValue() {
        int len = this.val.length;

        int[] input = new int[len];
        for (int i = 0; i < len; i++) {
            input[i] = i;
        }
        start += 1;
        if (start > len - 1) {
            start = start % len;
        }

        System.out.println(start);


        return input[start];
    }

    public Boolean checkValueIsThere(int value) {
        Boolean isThere = false;
        for (int i = 0; i < val.length; i++) {
            if (val[i] == value) {
                isThere = true;
                this.index = i;
                break;
            }
        }
        if (isThere) {
            return true;
        }
        return false;
    }

    public void showSetValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ,");
        }
    }

}
