public class Franc
{
    Franc(int amount)
    {
        this.amount = amount;
    }

    Franc times(int multiplier)
    {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object object)
    {
        Franc Franc = (Franc) object;
        return amount == Franc.amount;
    }

    private int amount;
}
