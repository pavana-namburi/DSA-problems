# 🧠 Bit Manipulation Cheat Sheet (Java)

## 🔹 1. Core Idea

Everything is binary (0s and 1s)

Example: 5 = 101\
6 = 110

------------------------------------------------------------------------

## 🔹 2. Basic Operators

### AND (&)

1 & 1 = 1\
else = 0

Use: Check if a bit is ON\
Example: 5 & 1 = 1 → odd

------------------------------------------------------------------------

### OR (\|)

1 \| 0 = 1\
Use: Turn ON a bit

------------------------------------------------------------------------

### XOR (\^)

same → 0\
different → 1

Properties:\
a \^ a = 0\
a \^ 0 = a

------------------------------------------------------------------------

### NOT (\~)

\~5 = -(5 + 1) = -6

------------------------------------------------------------------------

### LEFT SHIFT (\<\<)

1 \<\< 4 = 16 (2\^4)\
x \<\< k = x \* (2\^k)

------------------------------------------------------------------------

### RIGHT SHIFT (\>\>)

8 \>\> 1 = 4

------------------------------------------------------------------------

## 🔹 3. Important Patterns

Check ith bit: (n & (1 \<\< i)) != 0

Set ith bit: n \| (1 \<\< i)

Clear ith bit: n & \~(1 \<\< i)

Toggle ith bit: n \^ (1 \<\< i)

Remove last set bit: n & (n - 1)

Check power of 2: (n & (n - 1)) == 0 (n \> 0)

Count set bits: while(n \> 0){ n = n & (n - 1); count++; }

------------------------------------------------------------------------

## 🔹 4. Must-Know Tricks

Odd/Even: (n & 1) == 1

Swap: a = a \^ b\
b = a \^ b\
a = a \^ b

Single number: XOR all elements

Lowest set bit: n & -n

Subsets: for(int i = 0; i \< (1 \<\< n); i++)

------------------------------------------------------------------------

## 🔹 5. Java Built-in Methods

Integer.bitCount(n)\
Integer.highestOneBit(n)\
Integer.lowestOneBit(n)\
Integer.numberOfLeadingZeros(n)\
Integer.reverse(n)

------------------------------------------------------------------------

## 🔹 Final Takeaway

Focus on: &, \|, \^\
1 \<\< i\
n & (n - 1)
