# LearningKotlin

Kotlin is a JVM language, and so the compiler will emit Java bytecode. Because of this, of course, Kotlin code can call Java code, and vice versa.

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
### Val

The keyword 'val' is used to declare a read-only variable (equivalent to declaring a final variable in Java).

A val must be initialized when it is created, since it cannot be changed later.

NOTE: A read only variable does not mean the instance itself is automatically immutable. 
The instance may still allow its member variables to be changed via functions or properties, but the variable itself cannot change its value or be reassigned to another value.

```
val name = "Devesh Shetty"

```

