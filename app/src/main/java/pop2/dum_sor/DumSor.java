package pop2.dum_sor;

import org.qremia.evolution.neutrino.Screen;
import org.qremia.evolution.neutrino.impl.AndroidGame;

public class DumSor extends AndroidGame {
	public Screen getStartScreen()
	{
		return new LoadingScreen(this);
	}
}
