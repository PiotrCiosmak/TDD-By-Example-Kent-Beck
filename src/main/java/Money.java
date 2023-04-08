public class Money
{
    @Override
    public boolean equals(Object object)
    {
        Money money = (Money) object;
        return amount == money.amount;
    }

    protected int amount;
}
