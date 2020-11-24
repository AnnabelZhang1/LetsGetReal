public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *  If the denominator is negative, negate both numerator and denominator
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
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


  /*
  *@return the value expressed as "3/4" or "8/3"

  public String toString(){
    return numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD

  private static int gcd(int a, int b){
    use euclids method or a better one
    http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    return 0;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.

  private void reduce(){

  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other

  public RationalNumber multiply(RationalNumber other){
    return null;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other

  public RationalNumber divide(RationalNumber other){
    return null;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other

  public RationalNumber add(RationalNumber other){
    return null;
  }
  /**
  *Return a new RationalNumber that this minus the other

  public RationalNumber subtract(RationalNumber other){
    return null;
  }
  */
}
