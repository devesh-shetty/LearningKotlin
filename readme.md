# LearningKotlin

Kotlin is a JVM language, and so the compiler will emit Java bytecode. Because of this, of course, Kotlin code can call Java code, and vice versa. Kotlin is a strongly typed language.

**In Kotlin, everything is an object.**

## Vals and vars

Kotlin has two keywords for declaring variables, val and var.

### var

1. The var is a mutable variable (similar to declaring variable in Java).

```
var name = 'Devesh'
```

2. var can be **initialized** later.

```
var name: String
name = "kotlin"
```

3. Since the variables defined with 'var' are mutable, they can be reassigned.

```
var name = "Devesh"

name = "Devesh Shetty"
```
### val

The keyword 'val' is used to declare a read-only variable (equivalent to declaring a final variable in Java).

A val must be initialized when it is created, since it cannot be changed later.

NOTE: A read only variable does not mean the instance itself is automatically immutable. 
The instance may still allow its member variables to be changed via functions or properties, but the variable itself cannot change its value or be reassigned to another value.

```
val name = "Devesh Shetty"
```

## Type inference

We don't always need to declare types explicitly.

```
val name = "Devesh Shetty"
```
Type inference can also be used in single-line functions where the return value can be inferred from the expression in the function.
```
fun incrementByOne(x: Int) = x + 1
```

Explicitly stating the type:
```
var explicitNumber: Number = 90.5
```

## Basic data types

1. Everything in Kotlin is an object.

2. Kotlin promotes the primitives to full objects.

### Number

The built-in number types:

|Type   |Width |
|-------|------|
|Long   |64    |
|Int    |32    |
|Short  |16    |
|Byte   |8     |
|Double |64    |
|Float  |32    |

To create number literals:
```
    //val of type Int
    val int = 123
    
    //val of type Long
    val long = 1234L
    
    //val of type Double (used as default for floating point numbers)
    val double = 90.898
    
    //val of type Float 
    val float = 80.90F
    
    //val of type Hexadecimal
    val hexadecimal = 0xAB
    
    //val of type Binary
    val binary = 0b010101
```

**Kotlin does not support automatic widening of numbers, so conversion must be invoked explicitly.**

```
val intVal = 989
val longVal = intVal.toLong()
```

**Unlike in Java, the usual bitwise operators - shift right, shift left, and, or, xor - are supported by Kotlin but these are not built in operators, rather named functions.**

```
val leftShiftResult = 1 shl 2

val andResult = 1 and 0

// inverse is a unary operator and so is invoked using dot syntax
val invResult = 1.inv()
```

### Boolean

Conjunction and disjunction are lazily evaluated, so if the left-hand side satisfies the clause, then the right-hand side will not be evaluated.

```
val x = 5
val y = 3
val z = 10

val isTrue = x > y && x < z
val isValid = z > 10 || x < y
```

### Chars

1. Chars represent a single character.

2. Character literals use single quotes.

**char type is not treated as a number, as used in Java**

### Strings

**Strings are immutable**

Strings can be created using: 

1. Double quotes

```
//Double quotes create an escaped string (special characters such as \t will be escaped)
val stringDouble = "string with \t tab space"
```

2. Triple quotes
```
//Triple quotes create a raw string
val stringTriple = """ 
raw string is useful for strings that span many lines
"""
```

### Arrays

arrays are a part of the collection classes

We can create an array using:

1. arrayOf() function
```
val array = arrayOf(1, 2, 3)
```

2. initial size and a function to generate each element
```
val perfectSquares = Array(10, {k -> k * k})
```

**To avoid boxing types that will ultimately be represented as primitives in JVM, Kotlin provides alternative array classes that are specialised for each of the primitive types.**
The provided classes are ByteArray, CharArray, ShortArray, IntArray, LongArray, BooleanArray, FloatArray and DoubleArray.

## Packages
Packages allow code to be split into namespaces.

## String templates

String templates are a simple and effective way of embedding values, variables, or even expressions inside a string without the need of pattern replacement or string concatenation.
```
val name = "Devesh"
var greeting = "Hello $name. Your name has ${name.length} characters"
```

## Range
A range is defined as an interval that has a start value and an end value.
```
val oneToTen = 1 .. 10

//create a range from 10 to 1
val tenToOne = 10.downTo(1)
    
//create a range from 1 to 100
val threeToHundred = 3.rangeTo(100)
//use step() function to modify each successive term in the range
val multiplesOfThree = threeToHundred.step(3)

val countingTenToOne = (1 .. 10).step(2).reversed()
```

## Loops
Kotlin supports the while loop and  for loop.

**Any object can be used inside a for loop provided that it implements a function called iterator making this an extremely flexible construct**
