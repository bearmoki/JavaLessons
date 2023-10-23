import java.lang.reflect.Array;
import java.util.Arrays;

public class MultipleArrays {

//two dimensional array can be see as a dimensional of values

//two dimensional array doesn't have to be a uniform matrix

    //example of a non-uniform two dimensional array
    int[][] array1 = {
            {1,2},
            {11,12,13},
            {21, 22, 23, 24, 26}
    };

// here we have an array with 3 elements
//    each element is an array of integers (a nested array)
//    each nested array is a different length

    // Can initialize a 2d array and define the size of the nested arrays
    int[][] array2 = new int[3][3];
// this statement says we have 3 nested arrays with 3 ints.

//    Java knows we want a 3x3 matrix of units and defaults the value with zeros

    //    You can also initialize a two-dimensional array, without specifying the  size of the nested arrays.
//    Here we're specifying only the outer array size, by specifying the length, only in the first set of square brackets
//    We've left the second set of square brackets empty.
    int[][] array3 = new int[3][];
//    The result of this initialization is an array of 3 null elements
//    limited to assigning integer arrays to these elements but they can be any length

    //    most common ways to decalre two-dimensional array:
    int[][] myDoubleArray;
    int[] myDoubleTwoArray[];

    public static void main(String[] args){
        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);

        for(int[] outer: array2){
//            System.out.println(outer);
//            prints each nested array is printed - and confirm each val is initialized to 0.
            System.out.println(Arrays.toString(outer));
        }

        for(int i =0; i < array2.length; i++){
            int innerArray[] = array2[i];
            for(int j = 0; j < innerArray.length; j++){
//                System.out.println(array2[i][j] + " ");

                array2[i][j] = (i * 10) + (j + 1);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(array2));

//        for(var outer:array2){
//            for(var element:outer){
//                System.out.println(element + " ");
//                System.out.println();
//            }
//        }

//        System.out.println(Arrays.deepToString(array2));


//        Multiple Arrays topic:
//        no requirement of nested arrays to be particular size
//        need the array creation new int[]
        array2[1] = new int[] {10, 20, 30};
        System.out.println(Arrays.deepToString(array2));


//        Can create an array of objects -
        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));
        anyArray[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArray));
        System.out.println();
        anyArray[1] = new String[][]{
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));
        System.out.println();

        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));

        System.out.println();
        System.out.println("each array and its responding element type printed out: ");
        for(Object element: anyArray){
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println();
            System.out.println("Element to String() = " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }

// array can be primitive, object, or any data.

}

