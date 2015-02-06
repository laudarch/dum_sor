package pop2.dum_sor;

import org.qremia.evolution.neutrino.Game;
import org.qremia.evolution.neutrino.Graphics;
import org.qremia.evolution.neutrino.Graphics.PixmapFormat;
import org.qremia.evolution.neutrino.Screen;

public class LoadingScreen extends Screen {
	public LoadingScreen(Game game) {
		super(game);
	}

	public void update(float deltaTime)
	{
		Graphics g = game.getGraphics();
		Assets.background   = g.newPixmap("background.png", PixmapFormat.RGB565);
		Assets.logo         = g.newPixmap("logo.png", PixmapFormat.ARGB4444);
		Assets.mainMenu     = g.newPixmap("mainmenu.png", PixmapFormat.ARGB4444);
		Assets.townLightOn  = g.newPixmap("townLightOn.png", PixmapFormat.ARGB4444);
		Assets.townLightOff = g.newPixmap("townLightOff.png", PixmapFormat.ARGB4444);
		Assets.buttons      = g.newPixmap("buttons.png", PixmapFormat.ARGB4444);
        Assets.ready        = g.newPixmap("ready.png", PixmapFormat.ARGB4444);
        Assets.pause        = g.newPixmap("pausemenu.png", PixmapFormat.ARGB4444);
        Assets.numbers      = g.newPixmap("numbers.png", PixmapFormat.ARGB4444);
        Assets.gameOver     = g.newPixmap("gameover.png", PixmapFormat.ARGB4444);

		Assets.switchClick = game.getAudio().newSound("switchClick.ogg");
        Assets.btnClick    = game.getAudio().newSound("btnClick.ogg");
		Assets.dum         = game.getAudio().newSound("dum.ogg");
		Assets.sor         = game.getAudio().newSound("sor.ogg");
	    Assets.bgmusic     = game.getAudio().newMusic("bgMuzik.mp3");

		Settings.load(game.getFileIO());

		game.setScreen(new MainActivity(game));
	}

	public void present(float deltaTime)
	{

	}

	public void pause()
	{

	}

	public void resume()
	{

	}

	public void dispose()
	{

	}
}
