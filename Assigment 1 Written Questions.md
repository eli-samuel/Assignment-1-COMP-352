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
f(n) = 2n^2 + 13n + 4
g(n) = n^2
O(n^2)

This makes sense because a double for loop = n^2 --> O(n^2)

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

    print: "index " + maxIndex1 + " and index " + maxIndex2 + ", values " + firstMax
                + " and " + secondMax + ", their product is " + (firstMax * secondMax)

    print: "index " + minIndex1 + " and index " + minIndex2 + ", values " + firstMin
                + " and " + secondMin + ", their product is " + (firstMin * secondMin)

_a) Briefly justify the motive(s) behind your design._
Finding the max product is simply finding the two largest integers. Since all integers are greater than 0, that is simple. Similarly to the max product, the smallest product is just multiplying the two smallest integers.

_b) What is the time complexity of your solution? You must specify such complexity using the Big-O notation. Explain clearly how you obtained such complexity._

There is one for loop based on n so O(n). It does not matter what is inside the loop or how many statements there are.

O(n)

###Question 3
_a) 8000000n^2 log n + n^3 is O(n^3 log n)_
f(x) exists in O(g(x)) if there exists c, x0 > 0 such that f(x) <= c*g(x) for all x >= x0
f(n) = 8000000n^2 log n + n^3
g(n) = n^3 log n
let c = 8000000

value of n     f(n)               c*g(n)
   1            1                   0
   2            32000000log2+8      32000000log2
   3            72000000log3+27     72000000log3

_b) 106n^2 + 3n^7 + 5n^3 is Θ(n^3)_ FALSE
f(n) = 10^6n^2 + 3n^7 + 5n^3
g(n) = n^3
let c1 = 10^5, c2 = 10^5

<!-- value of n     c1*g(n)      f(n)               c2*g(n)
   1                        1 000 008          1         
   2                        4 000 424          40
   3                        9006696            135

c2*g(n) < f(n) for n > 0
However, for any c1, c1*g(n) < f(n) at some point
Thus this is true -->

lim f(n) as n -> infinity = n^7
lim c*g(n) as n-> infinity = n^3

Therefore, there is no upper bound for g(n) = n^3

_c) 0.1n^3 + 0.0000005n^6 is Θ(n^3)_ FALSE
f(n) = 0.1n^3 + 0.0000005n^6
g(n) = n^3
let c1 = x, c2 = y

lim f(n) as n -> infinity = n^6
lim c*g(n) as n-> infinity = n^3

Therefore, there is no upper bound for g(n) = n^3

_d) n^4 + 0.0000001n^3 is Ω(n^3)_
f(n) = n^4 + 0.0000001n^3
g(n) = n^3
let c = 1

value of n     f(n)               c*g(n)
   1            >1                  1
   2            >16                 8
   3            >81                 27

For all values of n >= 1, c*g(n) > f(n), thus Ω(n^3) is true.

_e) n! is Θ(2^n)_
f(n) = n!
g(n) = 2^n
let c1 = x, c2 = 1

c2*g(n) < f(n) for n > 3

lim f(n) as n -> infinity > lim c*g(n) as n-> infinity

Therefore, there is no upper bound for g(n) = 2^n


_f) n^n is Ω(n!)_
f(n) = n^n
g(n) = n!
let c = 1

value of n     f(n)               c*g(n)
   1            1                  1
   2            4                  2
   3            27                 6

   For any c1, c1*g(n) < f(n) at some point


##Programming Part 1

###Algorithm RevealStr(s, p)

    Input string s of random size and random masks, printwriter p to print to a file
    Output strings with all the masks filled

    _Variables_
    arr <- s.split("")
    newStr <- ""
    star <- false

    for i=0 to i<arr length do
        if arr[i] is a * then
            star <- true
            newStr <- ""
            for j=0 to j<arr length do
                if i is j then
                    newStr <- newStr + 1
                else
                    newStr <- newStr + arr[j]

            RevealStr(newStr, p)

            newStr <- ""
            for j=0 to j<arr length do
                if i is j then
                    newStr <- newStr + 0
                else
                    newStr <- newStr + arr[j]

            RevealStr(newStr, p)
            return

        if !star and i is arr.length then
            print <- ""
            for j=0 to j<arr.length do
                print <- print + arr[j]
            output print to file

##Programming Part 1

###Algorithm RevealStr(s, p)

    Input string s of random size and random masks, printwriter p to print to a file
    Output strings with all the masks filled

    _Variables_

    stack <- instantiate new stack
    push s to stack
    index <- 0

    while stack is not empty do
        result <- pop from stack

        if there is a * in result then
            index <- index of * in result
            for num=0 to num<=1 do
                result = result substring from beginning to index + num + result substring from index+1 to end
                push result to the stack

        else
            output result to file
