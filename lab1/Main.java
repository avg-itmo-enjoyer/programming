package main;

import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.cbrt;
import static java.lang.Math.atan;
import static java.lang.Math.log;
import static java.lang.Math.PI;


class Main {

  final static short R_START = 5;
  final static short R_SIZE = 19 - 5 + 1;

  final static short X_SIZE = 11;
  final static short MIN_X_VAL = -12;
  final static short MAX_X_VAL = 2;
  
  public static void main(String[] args) {
    
    // 1-st part
    short[] r = new short[R_SIZE];
    for (short i = 0 ; i < R_SIZE; i++) {
      r[i] = (short) (i + R_START);
    }

    // 2-nd part
    double[] x = new double[X_SIZE];
    for (short i = 0; i < X_SIZE; i++) {
      x[i] = Math.random() * (MAX_X_VAL - MIN_X_VAL) + MIN_X_VAL;
    }

    // 3-rd part
    double[][] w = new double[R_SIZE][X_SIZE];
    for (short i = 0; i < R_SIZE; i++) {
      for (short j = 0; j < X_SIZE; j++) {
        w[i][j] = calculate(r[i], x[j]);
      }
    }

    printMatrix(w);
  }

  private static double calculate(short r_i, double x_j) {
    double res;
    switch (r_i) {
    	case 18:
    		res = cbrt(atan((x_j - 5) / 14));
    		break;
    	case 8:
    	case 9:
    	case 11:
    	case 12:
    	case 14:
    	case 16:
    	case 17:
    	  res = log(pow(2 * PI / pow(sin(x_j), 2), 2));
    	  break;
    	default:
    	  res = (log(pow(pow(cos(x_j), 2) / 2, 2)) + 1) / 4;
    		break;
    }
    return res;
  }

  private static void printMatrix(double[][] matrix) {
    for (double[] row : matrix) {
      for (double cell : row) {
        System.out.printf("%.2f\t", cell);
      }
      System.out.println();
    }
  }
}
