public class RealNumber extends Number{
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
        double within = (Math.abs(other.getValue() - value)) / value;
        if (within <= 0.00001)
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
    if (other.getValue() == 0)
      throw new ArithmeticException("Cannot divide by zero");
    RealNumber quotient = new RealNumber(value / other.getValue());
    return quotient;
  }

  public RealNumber subtract(RealNumber other){
    RealNumber difference = new RealNumber(value - other.getValue());
    return difference;
  }


  public static void main(String[] args)
    {
      RealNumber a = new RealNumber(1.0008);
      RealNumber b = new RealNumber(1.0007);
      RealNumber c = new RealNumber(8.343);
      RealNumber d = new RealNumber(0);

      System.out.println(a.equals(b));
      System.out.println(b.equals(b));

      System.out.println(a.add(b).getValue());
      System.out.println(a.add(d).getValue());

      System.out.println(c.multiply(d).getValue());
      System.out.println(a.multiply(b).getValue());

      try
        {
          System.out.println(c.divide(b).getValue());
          System.out.println(c.divide(d).getValue());
        }
      catch (ArithmeticException e){
        e.printStackTrace();}

      System.out.println(a.subtract(b).getValue());
      System.out.println(a.subtract(d).getValue());
    }
}
