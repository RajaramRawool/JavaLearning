package javacourse.codingexercises.oops;

public class ComplexNumber {
//    Instance Variables/ Fields
    private double real;
    private double imaginary;

//    Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
//    Instance Methods
    public double getReal(){
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }
    public void add(ComplexNumber complexNumber) {
        add(complexNumber.real, complexNumber.imaginary);
    }
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(ComplexNumber complexNumber) {
        subtract(complexNumber.real, complexNumber.imaginary);
    }
}
