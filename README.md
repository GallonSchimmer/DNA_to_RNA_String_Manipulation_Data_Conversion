# DNA_to_RNA_String_Manipulation_Data_Conversion

[CodeWars Kata Link](https://www.codewars.com/kata/5556282156230d0e5e000089/train/java/676d78df7d411ff7949b936a)

## Problem Statement
Deoxyribonucleic acid (DNA) and ribonucleic acid (RNA) are essential molecules in biological systems, each serving unique functions. DNA contains four nucleic acid bases: Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T'). RNA is similar but substitutes Thymine with Uracil ('U'). This repository provides a solution to translate a DNA sequence into its RNA equivalent.

For example:

Input: "GCAT" Output: "GCAU"

The function should handle strings of arbitrary lengths, including empty strings. All inputs are guaranteed to be valid and contain only the characters 'G', 'C', 'A', and 'T'.

## Solution Concept
The solution leverages fundamental **string manipulation** and **iteration concepts** in computer science:
1. **String traversal** - Loop through each character in the string.
2. **Conditional substitution** - Replace 'T' with 'U' wherever found.
3. **Immutability handling** - Strings in Java are immutable; updates require constructing a new string.

These principles ensure the algorithm is efficient and adheres to Java's immutable string paradigm.

## Learning Objectives
1. Understand **string manipulation techniques** in Java.
2. Apply **conditional logic** to solve substitution problems.
3. Explore **looping mechanisms** to process strings character by character.
4. Recognize **immutability in Java** and strategies to handle it efficiently.

## Practical Applications
1. **Bioinformatics**: This problem mimics transcription in molecular biology, where DNA sequences are transcribed into RNA.
2. **Data transformation**: The algorithm provides foundational skills for data conversion tasks in software systems.
3. **Error handling**: Ensures robustness in scenarios where input size and constraints vary.

## Algorithm Details
1. **Input Validation**: The input is guaranteed to be valid; therefore, no explicit validation is required.
2. **Iteration**: Use a `for` loop to traverse the DNA string character by character.
3. **Condition Checking**:
   - Check if the current character is 'T'.
   - Replace 'T' with 'U' using the `String.replace()` method.
4. **Output Construction**: As strings are immutable in Java, replace operations create a new string which is reassigned to the variable.
5. **Return**: The modified string representing the RNA sequence is returned.

### Unit Tests

```java

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BioTest {
    @Test
    public void testDna() throws Exception {
        Bio b = new Bio();
        assertEquals("UUUU", b.dnaToRna("TTTT"));
    }
    
    @Test
    public void testDna2() throws Exception {
        Bio b = new Bio();
        assertEquals("GCAU", b.dnaToRna("GCAT"));
    }
}
