package bizzBuzzGames;

import javax.swing.JOptionPane;

public class BizzBuzzMethods
{
	BizzBuzzMethods() // constructor 
	{
		String decision;

		decision = whatGame(); // decide what game you want to play

		decisionForGame(decision); // takes decision and sends player to the proper game.
	}

	public String whatGame()
	{
		String decision;

		decision = JOptionPane.showInputDialog("Would you like to play BIZZ, BUZZ, or BIZZ-BUZZ?\nEnter the name of the game you want to play\nEnter \"Quit\" to end game");

		return decision;
	}

	public void decisionForGame(String decision) // method for picking which game to play
	{
		if (decision.equalsIgnoreCase("BIZZ"))
		{
			playBizz();

		} else if (decision.equalsIgnoreCase("BUZZ"))
		{
			playBuzz();

		} else if (decision.equalsIgnoreCase("BIZZ-BUZZ"))
		{
			playBizzBuzz();

		} else if (decision.equalsIgnoreCase("Quit"))
		{
			JOptionPane.showMessageDialog(null, "Thanks for playing!!");

		} else if (decision != "BIZZ" || decision != "bizz" || decision != "BUZZ" || decision != "buzz" || decision != "BIZZ-BUZZ" || decision != "bizz-buzz")
		{
			JOptionPane.showMessageDialog(null, "Please enter the name of the game again");
		} else
		{
			JOptionPane.showMessageDialog(null, "End of program");
		}
	}

	public void playBizzBuzz()
	{
		displayGameBizzBuzz(); // introduction message for which game you are playing

		for (int beginCount = 1; beginCount <= 100; beginCount++)
		{
			if (beginCount % 4 == 0 && beginCount % 7 == 0) // when remainder of beginCount divided by 4 or 7 has a remainder of zero display Bizz Buzz
			{
				JOptionPane.showMessageDialog(null, "Bizz Buzz!!");

			} else if (beginCount % 4 == 0) // when remainder of beginCount divided by 4 has a remainder of zero display Buzz
			{
				JOptionPane.showMessageDialog(null, "Buzz!!");

			} else if (beginCount % 7 == 0) // when remainder of beginCount divided by 7 has a remainder of zero display Bizz
			{
				JOptionPane.showMessageDialog(null, "Bizz!!");

			} else
			{
				JOptionPane.showMessageDialog(null, beginCount); // if conditions above are not met it displays the number 
			}
		}

		thanksForPlayingBizzBuzz(); // message to thanking player for playing
	}

	public void playBizz()
	{
		displayGameBizz(); // introduction message for which game you are playing

		for (int beginCount = 1; beginCount <= 100; beginCount++)
		{
			if (beginCount % 7 == 0) // when remainder of beginCount divided by 7 has a remainder of zero display Bizz
			{
				JOptionPane.showMessageDialog(null, "Bizz!!");

			} else
			{
				JOptionPane.showMessageDialog(null, beginCount);
			}
		}

		thanksForPlayingBizz(); // message to thanking player for playing
	}

	public void playBuzz()
	{
		displayGameBuzz(); // introduction message for which game you are playing

		for (int beginCount = 1; beginCount <= 100; beginCount++)
		{
			if (beginCount % 4 == 0) // when remainder of beginCount divided by 4 has a remainder of zero display Buzz
			{
				JOptionPane.showMessageDialog(null, "Buzz!!");

			} else
			{
				JOptionPane.showMessageDialog(null, beginCount);
			}
		}

		thanksForPlayingBuzz(); // message to thanking player for playing 
	}

	public void displayGameBizz()
	{
		JOptionPane.showMessageDialog(null, "You are playing Bizz. Lets start counting!!\nRemember multiples of seven you yell out BIZZ!!!");
	}

	public void displayGameBuzz()
	{
		JOptionPane.showMessageDialog(null, "You are playing Buzz. Lets start counting!!\nRemember multiples of four you yell out BUZZ!!!");
	}

	public void displayGameBizzBuzz()
	{
		JOptionPane.showMessageDialog(null, "You are playing Bizz-Buzz. Lets start counting!!\nRemember multiples of seven you yell out BIZZ!!!\nMultiples of four yell out BUZZ!!\nIf number is a multiple of seven and four yell out BIZZ-BUZZ!!!");
	}

	public void thanksForPlayingBizz()
	{
		JOptionPane.showMessageDialog(null, "Thanks for playing Bizz");
	}

	public void thanksForPlayingBuzz()
	{
		JOptionPane.showMessageDialog(null, "Thanks for playing Buzz");
	}

	public void thanksForPlayingBizzBuzz()
	{
		JOptionPane.showMessageDialog(null, "Thanks for playing Bizz-Buzz");
	}
}
