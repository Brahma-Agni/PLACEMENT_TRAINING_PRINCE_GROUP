
class jack {
    int num;

    public jack(int num) {
        this.num = num;
    }

    public boolean isPerfect() {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}


public class PerfectNumber {

    public static void main(String[] args) {
        int number = 28; // Example number
        jack pefectnum = new jack(number);
        if (pefectnum.isPerfect()) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
