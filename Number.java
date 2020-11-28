public abstract class Number{

  public abstract double getValue();
    /*return 0 when this Number equals the other RealNumber
      return a negative value when this Number is smaller than the other Number
      return a positive value when this Number is larger than the other Number
      */
  public int compareTo(Number other){
      if ((this.getValue())==(other.getValue()))
        return 0;
      else if ((this.getValue()) < (other.getValue()))
        return -1;
      else
        return 1;
  }

  public boolean equals(Number other){
    if (this.getValue() != 0)
      {
        double within = (Math.abs(this.getValue() - other.getValue())) / this.getValue();
        if (within <= 0.00001)
          return true;
        return false;
      }
    else
      return this.getValue() == other.getValue();
  }
}
