# CSC320MOD4 – Loops

Java console programs that practice `for`, `while`, `do-while` and nested loops, plus `break`/`continue` and character-by-character string processing.

## Overview

This is **CSU Global CSC320 (Programming I), Module 4**, which covers loops (Chapter 4 of *Programming in Java with zyLabs*). It is an Eclipse project targeting JDK 24. The `src/` folder holds the module assignment and two loop examples. The repository root holds zyLabs-style practice programs. Every file is a standalone program in the default package with its own `main`.

## Module assignment – `src/FloatingPointStats.java`

This file was committed as "Assignment Upload". It reads **five floating-point values** and reports statistics about them.
- A `while (count < MAX_VALUES)` loop prompts `Enter value n of 5`. Each line is parsed with `Double.parseDouble` inside a `try/catch`.
- Invalid entries are retried, and the failure counter resets after each good value. After **3 consecutive bad inputs** the program exits.
- Inside the loop it keeps a running `sum`, a `max` that starts at `Double.NEGATIVE_INFINITY`, and a `min` that starts at `Double.POSITIVE_INFINITY`.
- At the end it prints the total, average, maximum, minimum and **20% interest on the total**, all formatted as currency.

Sample run (verified):
```
Enter five floating-point values.
Enter value 1 of 5: 1.5
Enter value 2 of 5: abc
Invalid entry. Please enter a valid number.
Enter value 2 of 5: 2.5
...
Total: $16.00
Average: $3.20
Maximum: $5.00
Minimum: $1.50
Interest on total at 20%: $3.20
```

## Loop examples (`src/`)

| File | What it does |
|------|--------------|
| `NestedLoopExample.java` | Reads a number of rows and a maximum value. An outer `for` loop runs once per row. An inner `while (true)` loop multiplies `row × column` and prints only the even products, then `break`s when the product passes the maximum. The comments explain why a condition-driven `while` is used inside a count-driven `for`. |
| `UserInputLoopExample.java` | A "Word Analyzer". An outer `while (true)` loop reads words until `quit`, and an inner `for` loop prints each character with its position. |

## zyLabs practice programs (repository root)

| File | What it does |
|------|--------------|
| `CharacterChecker.java` | Prints `yes` if the input token is all digits and `no` otherwise, using `Character.isDigit`, `continue` and `break`. |
| `CountDown.java` | For an input from 11 to 100, counts down and stops at the first number whose digits match (a multiple of 11). For example, `20` → `20 19 … 11`. |
| `DrawRightTriangle.java` | Draws a right triangle of a chosen character and height, one row per loop iteration. |
| `IncrementPrintDoWhile.java` | Uses a `do-while` loop to print from a low number to a high number in steps of 10, with an error if the range is reversed. |
| `PalindromeChecker.java` | Removes spaces, builds the reversed string with a `for` loop, and compares the two. |
| `PalindromeCheckerMaxEfficiency.java` | The same check written with `String.replace`, `StringBuilder.reverse()` and a case-insensitive comparison. |
| `PasswordModifier.java` | Strengthens a password by substituting characters (`i→!`, `a→@`, `m→M`, `B→8`, `o→.`) and appending `q*s`. |
| `PhoneNumberDecoder.java` | zyBooks starter that converts phone letters to digits. Only `a–c`/`A–C → 2` is implemented, and the other letters print `?` (the starter's `FIXME` is still in the code). |
| `SimonSays.java` | Compares two color-sequence strings character by character and counts matches until the first mismatch. |
| `SpaceCommaPeriodRemover.java` | Counts the characters in a line, not counting spaces, commas or periods. |
| `SpaceRemover.java` | Prints the input line with all spaces removed. |
| `SystemOfLinearEquationsSolver.java` | Reads the coefficients of two linear equations (`a b c d e f` for `ax+by=c`, `dx+ey=f`) and **brute-forces** every integer x and y from −10 to 10 with nested loops, printing any solution or `No solution`. |
| `TextReverse.java` | Reverses each input line until `quit`, `Quit` or `q`. |
| `test.py` | A short Python script, added in the "Test push from VS Code" commit, that loops until the user enters a number from 1 to 10. |

`SystemOfLinearEquationsSolver.class` (root) and `bin/FloatingPointStats.class`/`src/FloatingPointStats.class` are compiled copies that were committed along with the source.

## Build and run

JDK 11 or newer (the programs use `String.strip()`).

```bash
# module assignment
javac -d bin src/FloatingPointStats.java
java -cp bin FloatingPointStats

# any root-level practice program, e.g.
javac SystemOfLinearEquationsSolver.java
echo "8 7 38 3 -5 -1" | java SystemOfLinearEquationsSolver   # prints: 3 2

# Python script
python3 test.py
```

## Concepts demonstrated
- `for`, `while`, `do-while` and `while (true)` loops with `break` exit conditions
- Nested loops (multiplication rows, brute-force equation solving)
- `continue` to skip characters
- Sentinel-controlled input loops (`quit`)
- Running totals, min/max tracking and input validation with attempt limits
- String traversal with `charAt`, `StringBuilder.reverse()`

## Required
- [ ] Chapter 4 in Programming in Java with zyLabs
- [ ] Oracle. (2022). The for statement.
- [ ] Oracle. (2022). The while and do-while statements.

## Recommended
- [ ] GeeksforGeeks. (n.d.). Loops in Java.
- [ ] Tutorialspoint. (2020). Ways to read input from console in Java.

## Video
- [ ] Gassner, D. (2018). Create looping code blocks. [Video]. LinkedIn Learning.

## Assignments
- [ ] Discussion Forum
- [ ] Critical Thinking Assignment
