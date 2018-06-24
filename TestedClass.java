package ua.prog.kiev.lesson1.taskOne;

import ua.prog.kiev.lesson1.taskOne.SumAnnotation;

public class TestedClass {

    public TestedClass() {
    }

    @SumAnnotation(intOne = 3, intTwo = 5)
    public int Sum(int numberOne, int numberTwo) {
        int sum = 0;

        sum = numberOne + numberTwo;
        return sum;
    }
}
