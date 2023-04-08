public class Dollar
{
    Dollar(int amount)
    {
        this.amount = amount;
    }

    Dollar times(int multiplier)
    {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object object)
    {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }

    int amount;
}
