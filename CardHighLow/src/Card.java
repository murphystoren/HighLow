
public class Card
	{

		public static void main(String[] args)
			{
			}
		private String rank, suit;
		private int value;
		public Card (String rk, String st, int vl)
			{
			rank=rk;
			suit=st;
			value=vl;
			}
		public String getRank()
			{
				return rank;
			}
		public void setRank(String rank)
			{
				this.rank = rank;
			}
		public String getSuit()
			{
				return suit;
			}
		public void setSuit(String suit)
			{
				this.suit = suit;
			}
		public int getValue()
			{
				return value;
			}
		public void setValue(int value)
			{
				this.value = value;
			}
	}

