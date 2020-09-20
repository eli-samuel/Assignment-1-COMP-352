#Assignment 1 COMP 352

##Question 1



##Question 2

###Algorithm largestAndSmallestProduct(arr)

    Input array arr of integers
    Output two largest integers, their index, and product, and the two smallest integers, their index, and product

    _Variables_
    firstMax = arr[0]
    secondMax = arr[1]
    maxIndex1 = 0
    maxIndex2 = 1

    firstMin = arr[0]
    secondMin = arr[1]
    minIndex1 = 0
    minIndex2 = 1

    for int i=0 to i<arr length do
        if arr[i] is greater than firstMax then
            set secondMax to firstMax
            set firstMax to arr[i]

            set maxIndex2 to maxIndex1
            set maxIndex1 to i

        else if arr[i] is greater than secondMax then
            set secondMax = arr[i]
            set maxIndex2 to i

        if arr[i] is less than firstMin
            set secondMin to firstMin
            set firstMin to arr[i]

            set minIndex2 to minIndex1
            set minIndex1 to i

        else if arr[i] is less than secondMin
            set secondMin to arr[i]
            set minIndex2 to i

    print: "The two indices with largest product between their values are: "
                + "index " + maxIndex1 + " and index " + maxIndex2 + ", storing values "
                + firstMax + " and " + secondMax + ", and the value of their product"
                + "is " + (firstMax * secondMax) + "."

    print: "The two indices with smallest product between their values are: "
                + "index " + minIndex1 + " and index " + minIndex2 + ", storing values "
                + firstMin + " and " + secondMin + ", and the value of their product"
                + "is " + (firstMin * secondMin) + "."
