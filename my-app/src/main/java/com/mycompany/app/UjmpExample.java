
package com.mycompany.app;

import org.ujmp.core.Matrix;

public class UjmpExample {
    public static void main(String[] args) {
        // Create the matrix A (3×3)
        double[][] aArray = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0,10.0}
        };
        Matrix A = Matrix.Factory.importFromArray(aArray);

        // Create vector b (3×1) as a matrix
        double[][] bArray = {
            {3.0},
            {3.0},
            {4.0}
        };
        Matrix b = Matrix.Factory.importFromArray(bArray);

        // Solve A * x = b
        // Using UJMP: x = A.inv().mtimes(b)
        Matrix x = A.inv().mtimes(b);

        // Compute residual r = A*x - b
        Matrix r = A.mtimes(x).minus(b);

        // Display results
        System.out.println("Matrix A:");
        System.out.println(A);

        System.out.println("Vector b:");
        System.out.println(b);

        System.out.println("Solution x:");
        System.out.println(x);

        System.out.println("Residual r = A*x - b:");
        System.out.println(r);

        // Norm of residual: using e.g. infinity norm approximated by r.abs().max() or similar
        // double infNorm = r.abs().max();  // simplistic
        // System.out.printf("Infinity norm of residual: %.5f%n", infNorm);

        // Determinant of A
        double detA = A.det();
        System.out.printf("Determinant of A: %.5f%n", detA);

        // Transpose of A
        Matrix At = A.transpose();
        System.out.println("Transpose of A:");
        System.out.println(At);

        // Compute A * A^T
        Matrix product = A.mtimes(At);
        System.out.println("A * A^T:");
        System.out.println(product);
    }
}
