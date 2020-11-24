public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }
  //---------ONLY EDIT BELOW THIS LINE------------

  public boolean equals(RealNumber other){
    if (value != 0)
      {
        double within = Math.abs(other.getValue() - value)/value;
        if (within == 0.00001)
          return true;
        return false;
      }
    else
      return value == other.value;
  }

  public RealNumber add(RealNumber other){
     RealNumber sum = new RealNumber(other.getValue() + value);
     return sum;
  }

  public RealNumber multiply(RealNumber other){
    RealNumber product = new RealNumber(other.getValue() * value);
    return product;
  }

  public RealNumber divide(RealNumber other){
    RealNumber quotient = new RealNumber(value / other.getValue());
    return quotient;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this minus the other

  public RealNumber subtract(RealNumber other){
    return null;
  }
*/
}
