package javacourse.primitivedatatypes;

public class JavaCourse {
    public static void main(String[] args) {
        System.out.println("Hi, Rajaram");
        int age = 28;
        int firstNumber = 35, secondNumber = 12, thirdNumber = 6;
        int total = firstNumber + secondNumber + thirdNumber;
        int lastNumber = 1000 - total;
        System.out.println("My Age is : " + age);
        System.out.println(total + " and " + lastNumber);

//        Primitive Data Types
        /*Byte*/
        byte minValueByte = Byte.MIN_VALUE;
        byte maxValueByte = Byte.MAX_VALUE;
        System.out.println("---Byte Primitive Data type---");
        System.out.println("Minimum Value for Byte = " + minValueByte);
        System.out.println("Maximum Value for Byte = " + maxValueByte);
        System.out.println();

        /*Short*/
        short minValueShort = Short.MIN_VALUE;
        short maxValueShort = Short.MAX_VALUE;
        System.out.println("---Short Primitive Data type---");
        System.out.println("Minimum Value for Short = " + minValueShort);
        System.out.println("Maximum Value for Short = " + maxValueShort);
        System.out.println();

        /*Integer*/
        int minValueInteger = Integer.MIN_VALUE;
        int maxValueInteger = Integer.MAX_VALUE;
        System.out.println("---Integer Primitive Data type---");
        System.out.println("Minimum Value for Integer = " + minValueInteger);
        System.out.println("Maximum Value for Integer = " + maxValueInteger);

        /*Long*/
        System.out.println();
        long minValueLong = Long.MIN_VALUE;
        long maxValueLong = Long.MAX_VALUE;
        System.out.println("---Long Primitive Data type---");
        System.out.println("Minimum Value for Long = " + minValueLong);
        System.out.println("Maximum Value for Long = " + maxValueLong);

        /*Float*/
        System.out.println();
        float minValueFloat = Float.MIN_VALUE;
        float maxValueFloat = Float.MAX_VALUE;
        System.out.println("---Float Primitive Data type---");
        System.out.println("Minimum Value for Float = " + minValueFloat);
        System.out.println("Maximum Value for Float = " + maxValueFloat);

        /*Double*/
        System.out.println();
        double minValueDouble = Double.MIN_VALUE;
        double maxValueDouble = Double.MAX_VALUE;
        System.out.println("---Double Primitive Data type---");
        System.out.println("Minimum Value for Double = " + minValueDouble);
        System.out.println("Maximum Value for Double = " + maxValueDouble);


    }
}
