#Assignment 1 COMP 352

##Question 1

###Algorithm moveOddNumbers(arr)

    Input array arr of integers
    Output arr sorted with all the odd numbers at the end

    _Variables_
    numOdds <- 0
    num <- 0

    for i=0 to i<arr length do
        if arr[i] is odd then
            increment numOdds by 1

    for i=0 to i<arr length-numOdds do
        if arr[i] is odd then
            num <- arr[i]
            for j=0 to j<arr length-numOdds do
                arr[j] <- arr[j+1]
            arr[arr.length-1] <- num
            decrement i by 1

    print arr

_a) What is the time complexity of your algorithm, in terms of Big-O?_

1+(n+1)+n
n
n

1+(n+1)+n
n
n
n(1+(n+1)+n)
n
n
n

1

7n + 2n + 2 + 2n + 2 + 2n^2 + 2n
2n^2 + 13n + 4

double for loop = n^2 --> O(n^2)

_b) What is the space complexity of your algorithm, in terms of Big-O?_


##Question 2

###Algorithm largestAndSmallestProduct(arr)

    Input array arr of integers
    Output two largest integers, their index, and product, and the two smallest integers, their index, and product

    _Variables_
    firstMax <- arr[0]
    secondMax <- arr[1]
    maxIndex1 <- 0
    maxIndex2 <- 1

    firstMin <- arr[0]
    secondMin <- arr[1]
    minIndex1 <- 0
    minIndex2 <- 1

    for i=0 to i<arr length do
        if arr[i] is greater than firstMax then
            secondMax <- firstMax
            firstMax <- arr[i]

            maxIndex2 <- maxIndex1
            maxIndex1 <- i

        else if arr[i] is greater than secondMax then
            secondMax <- arr[i]
            maxIndex2 <- i

        if arr[i] is less than firstMin
            secondMin <- firstMin
            firstMin <- arr[i]

            minIndex2 <- minIndex1
            minIndex1 <- i

        else if arr[i] is less than secondMin
            secondMin <- arr[i]
            minIndex2 <- i

    print: "The two indices with largest product between their values are: "
                + "index " + maxIndex1 + " and index " + maxIndex2 + ", storing values "
                + firstMax + " and " + secondMax + ", and the value of their product"
                + "is " + (firstMax * secondMax) + "."

    print: "The two indices with smallest product between their values are: "
                + "index " + minIndex1 + " and index " + minIndex2 + ", storing values "
                + firstMin + " and " + secondMin + ", and the value of their product"
                + "is " + (firstMin * secondMin) + "."

_a) Briefly justify the motive(s) behind your design._
Finding the max product is simply finding the two largest integers. Since all integers are greater than 0, that is simple. Similarly to the max product, the smallest product is just multiplying the two smallest integers.

_b) What is the time complexity of your solution? You must specify such complexity using the Big-O notation. Explain clearly how you obtained such complexity._

There is one for loop based on n so O(n). It does not matter what is inside the loop or how many statements there are.

O(n)

###Question 3
_a) 8000000n^2 log n + n^3 is O(n^3 log n)_


_b) 106n^2 + 3n^7 + 5n^3 is Θ(n^3)_ FALSE
106n^2 + 3n^7 + 5n^3

_c) 0.1n^3 + 0.0000005n^6 is Θ(n^3)_ FALSE


_d) n^4 + 0.0000001n^3 is Ω(n^3)_
n^4 + 0.0000001n^3 >= 0.0000001n^3 >= n

_e) n! is Θ(2^n)_


_f) n^n is Ω (n!)_
