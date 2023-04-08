public class Money implements Expression
{
    public Money(int amount, String currency)
    {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount)
    {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount)
    {
        return new Money(amount, "CHF");
    }

    public Money times(int multiplier)
    {
        return new Money(amount * multiplier, currency);
    }

    Expression plus(Money addend)
    {
        return new Sum(this, addend);
    }

    public Money reduce(Bank bank, String to)
    {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }

    public String currency()
    {
        return currency;
    }

    @Override
    public boolean equals(Object object)
    {
        Money money = (Money) object;
        return amount == money.amount && currency.equals(money.currency());
    }

    public String toString()
    {
        return amount + " " + currency;
    }

    protected int amount;

    protected String currency;
}
