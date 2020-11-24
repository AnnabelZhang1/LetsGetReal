public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *  If the denominator is negative, negate both numerator and denominator
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno)
    {
      super(0.0);//this value is ignored!
      if (deno == 0)
        {
          numerator = 0;
          denominator = 1;
        }
        else if (deno < 0)
        {
          numerator = -1 * nume;
          denominator = -1 * deno;
        }
        else
        {
          numerator = nume;
          denominator = deno;
        }
      }

  public double getValue()
    {
      return (((double)numerator) / ((double)denominator));
    }

  public int getNumerator()
    {
      return numerator;
    }

  public int getDenominator()
    {
      return denominator;
    }

  public RationalNumber reciprocal()
    {
      RationalNumber recip = new RationalNumber(denominator, numerator);
      return recip;
    }

  public boolean equals(RationalNumber other)
    {
      return other.getValue() == this.getValue();
    }

  public String toString()
    {
      return numerator + "/" + denominator;
    }

  private static int gcd(int a, int b)
    {
      a = Math.abs(a);
      b = Math.abs(b);
      if (a < b)
        {
          int temp = b;
          a = b;
          b = temp;
        }
      int remainder = a % b;
      while (remainder != 0)
        {
          remainder = a % b;
          a = b;
          b = remainder;
        }
      return a;
    }

  private void reduce()
    {
      int greatestcd = gcd(numerator, denominator);
      numerator = numerator / greatestcd;
      denominator = denominator / greatestcd;
    }

  public RationalNumber multiply(RationalNumber other)
    {
      RationalNumber product = new RationalNumber(numerator * other.getNumerator(), denominator * other.getDenominator());
      return product;
    }

  public RationalNumber divide(RationalNumber other)
    {
      RationalNumber quotient = new RationalNumber(numerator * other.getDenominator(), denominator * other.getNumerator());
      return quotient;
    }

  public RationalNumber add(RationalNumber other)
    {
      RationalNumber sum = new RationalNumber(numerator + other.getNumerator(), denominator + other.getDenominator());
      return sum;
    }

  public RationalNumber subtract(RationalNumber other)
    {
      RationalNumber difference = new RationalNumber((numerator * other.getDenominator()) - other.getNumerator(), denominator * other.getDenominator());
      return difference;
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
