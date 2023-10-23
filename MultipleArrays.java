public class MultipleArrays {

//two dimensional array can be see as a dimensional of values

//two dimensional array doesn't have to be a uniform matrix

    //example of a non-uniform two dimensional array
    int[][] array1 = {
            {1,2},
            {11,12,13},
            {21, 22, 23, 24, 26}
    };
}
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
}

