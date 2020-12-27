public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0); //this value is ignored!
    if (deno == 0){
      numerator = 0;
      denominator = 1;
    }
    else if (deno < 0){
      numerator = -1 * nume;
      denominator = -1 * deno;
    }
    else{
      numerator = nume;
      denominator = deno;
      reduce();
    }
  }

  public double getValue(){
    return (((double)numerator) / ((double)denominator));
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    RationalNumber recip = new RationalNumber(denominator, numerator);
    return recip;
  }

  public boolean equals(RationalNumber other){
    return other.getValue() == this.getValue();
  }

  public String toString(){
   if (numerator == 0)
      return "0";
   else if (denominator == 1)
      return "" + numerator;
    return numerator + "/" + denominator;
  }

  private static int gcd(int a, int b){
    a = Math.abs(a);
    b = Math.abs(b);
    if (a == 0 || b == 0)
      return 1;
    else if (a < b){
        int temp = a;
        a = b;
        b = temp;
      }
    int remainder = a % b;
    while (remainder != 0){
        a = b;
        b = remainder;
        remainder = a % b;
      }
    return b;
  }

  private void reduce(){
    int greatestcd = gcd(numerator, denominator);
    numerator = numerator / greatestcd;
    denominator = denominator / greatestcd;
  }

  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(numerator * other.getNumerator(), denominator * other.getDenominator());
  }

  public RationalNumber divide(RationalNumber other){
    return new RationalNumber(numerator * other.getDenominator(), denominator * other.getNumerator());
  }

  public RationalNumber add(RationalNumber other){
    return new RationalNumber(numerator * other.getDenominator() + other.getNumerator() * denominator, denominator * other.getDenominator());
  }

  public RationalNumber subtract(RationalNumber other){
    return new RationalNumber(numerator * other.getDenominator() - other.getNumerator() * denominator, denominator * other.getDenominator());
  }

  public static void main(String[] args)
    {
      RationalNumber a = new RationalNumber(1, 2);
      RationalNumber b = new RationalNumber(9, 1);
      RationalNumber c = new RationalNumber(1, 2);
      RationalNumber d = new RationalNumber(210, 30);
      RationalNumber e = new RationalNumber(210, 30);

      System.out.println(a.getValue());
      System.out.println(a.getNumerator());
      System.out.println(a.getDenominator());

      System.out.println(a.reciprocal());
      System.out.println(b.reciprocal());

      System.out.println(a.equals(c));
      System.out.println(a.equals(b));

      System.out.println(a.toString());

      System.out.println(gcd(36, 18));

      d.reduce();
      System.out.println(d.getValue()); //infinity.. ?

      System.out.println(a.multiply(c).getValue());
      System.out.println(b.multiply(c).getValue());
      System.out.println(a.divide(c).getValue());
      System.out.println(c.divide(e).getValue());

      System.out.println(a.add(b).getValue());
      System.out.println(a.subtract(c).getValue());
    }
}
