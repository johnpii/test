public class Matriz {
    private int strok;
    private int stolbzov;
    private double[][] array1 = new double[strok][stolbzov];

    public double[][] summa(double[][] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return array1;
    }

    public double[][] naChislo(int mnozh) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = array1[i][j] * mnozh;
            }
        }
        return array1;
    }

    public void printResult() {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.println(" " + array1[i][j]);
            }
            System.out.println();
        }
    }

    public double[][] umnozh(double[][] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = array1[i][j] * array2[i][j];
            }
        }
        return array1;
    }

    public int getStrok() {
        return strok;
    }

    public void setStrok(int strok) {
        this.strok = strok;
    }

    public int getStolbzov() {
        return stolbzov;
    }

    public void setStolbzov(int stolbzov) {
        this.stolbzov = stolbzov;
    }

    public double[][] getArray1() {
        return array1;
    }

    public void setArray1(double[][] array1) {
        this.array1 = array1;
    }
}
