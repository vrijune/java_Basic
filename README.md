Industry Lab 04a: Arrays
======
## Exercise One: Arrays

Consider the following array:
```java
int[] numbers = {-9, 2, 7, 5, 124, -5, 1, 144};
```
1. What would be the output of the following statements?
    ```java
    System.out.println(numbers[0]);
    System.out.println(numbers[numbers.length - 1]);
    System.out.println(numbers[numbers[1]]);
    System.out.println(numbers[0] * numbers[1]);
    System.out.println(numbers.length);
    ```
2. Declare an array of doubles named `amounts`.
3. Construct the `amounts` array declared in 2) above, big enough to hold 100 elements.
4. Write a Java statement which assigns 22.75 to element 0 of the `amounts` array.

## Exercise Two: Looping through an array
Do the following **on paper**!

Complete the method below so that it adds up all the elements in the `values` array, then returns the total value.

```java
private double getTotal(double[] values) {
    double totalValue = 0;
    for (;;) {
        // TODO complete this for loop
    }
    return totalValue;
}
```

## Exercise Three: More Arrays
Complete all methods in `ictgradschool.industry.arrays.morearrays.MoreArrays.java`. Instructions for what each method does is written in the comments in the file, as are example inputs and outputs.
