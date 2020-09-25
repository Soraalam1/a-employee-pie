public interface IPayable extends Comparable<IPayable> {
    double calculatePay();
    String getType();
    int compareTo(IPayable person);
}
