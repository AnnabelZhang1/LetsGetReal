public abstract class Number{

  public abstract double getValue();

  public int compareTo(Number other){
      if ((this.getValue())==(other.getValue()))
        return 0;
      else if ((this.getValue()) < (other.getValue()))
        return -1;
      else
        return 1;
  }

  public boolean equals(Number other){
    if (this.getValue() != 0){
        double within = (Math.abs(this.getValue() - other.getValue())) / this.getValue();
        if (Math.abs(within) <= 0.0000001)
          return true;
        return false;
      }
    else
      return this.getValue() == other.getValue();
  }

  public static void main (String[] args){
    Number a = new RealNumber(1.00024);
    Number b = new RealNumber(1.00024);
    Number c = new RealNumber(0.005);

    System.out.println(a.compareTo(b));
    System.out.println(b.compareTo(c));
  }
}
