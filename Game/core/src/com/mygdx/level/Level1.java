package com.mygdx.level;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game.Enemy;
import com.mygdx.game.Hero;
import com.mygdx.game.Location;
import com.mygdx.screen.MainGameScreen;

public class Level1 extends AbstractLevel{

	Hero achille,helen,hercules,hypolyta,thesius;
	Enemy titan,enemy1,enemy2,enemy3,enemy4,enemy5,enemy6;
	
	public Level1()
	{
		achille = new Hero(TextureRegion.split(new Texture(Gdx.files.internal("Heroes/AchillesHealthBar.png")),64,64),"Achille",1,1,15);
		achille.setPosition(320, 256);
		mapCollisions.add(new Location(320, 256));
		heroes.add(achille);
		
		helen = new Hero(TextureRegion.split(new Texture(Gdx.files.internal("Heroes/HelenHealthBar.png")),64,64),"Helen",3,5,10);
		helen.setPosition(64, 192);
		mapCollisions.add(new Location(64, 192));
		heroes.add(helen);
		
		hercules = new Hero(TextureRegion.split(new Texture(Gdx.files.internal("Heroes/HerculesHealthBar.png")),64,64),"Hercules",2,3,20);
		hercules.setPosition(192, 384);
		mapCollisions.add(new Location(192, 384));
		heroes.add(hercules);
		
		hypolyta = new Hero(TextureRegion.split(new Texture(Gdx.files.internal("Heroes/HippolytaHealthBar.png")),64,64),"Hypolyta",3,2,10);
		hypolyta.setPosition(384,640);
		mapCollisions.add(new Location(384, 640));
		heroes.add(hypolyta);
		
		thesius = new Hero(TextureRegion.split( new Texture(Gdx.files.internal("Heroes/ThesiusHealthBar.png")),64,64),"Thesius",1,15,10);
		thesius.setPosition(64, 512);
		mapCollisions.add(new Location(64, 512));
		heroes.add(thesius);
		
		titan = new Enemy(TextureRegion.split(new Texture(Gdx.files.internal("Level1/CyclopsHealthBar.png")), 64, 64),"Titan",1,15,10);
		titan.setPosition(MainGameScreen.WIDTH-64, MainGameScreen.HEIGHT/2);
		mapCollisions.add(new Location(MainGameScreen.WIDTH-64, MainGameScreen.HEIGHT/2));
		enemies.add(titan);	
		
		enemy1 = new Enemy(TextureRegion.split(new Texture(Gdx.files.internal("Level1/SkeletonBowHealthBar.png")), 64, 64),"Enemy1",1,15,10);
		enemy1.setPosition(MainGameScreen.WIDTH-192, MainGameScreen.HEIGHT/2-128);
		mapCollisions.add(new Location(MainGameScreen.WIDTH-192, MainGameScreen.HEIGHT/2-128));
		enemies.add(enemy1);
		
		enemy2 = new Enemy(TextureRegion.split(new Texture(Gdx.files.internal("Level1/SkeletonBowHealthBar.png")), 64, 64),"Enemy2",1,15,10);
		enemy2.setPosition(MainGameScreen.WIDTH-192, MainGameScreen.HEIGHT/2);
		mapCollisions.add(new Location(MainGameScreen.WIDTH-192, MainGameScreen.HEIGHT/2));
		enemies.add(enemy2);
		
		enemy3 = new Enemy(TextureRegion.split(new Texture(Gdx.files.internal("Level1/SkeletonBowHealthBar.png")), 64, 64),"Enemy3",1,15,10);
		enemy3.setPosition(MainGameScreen.WIDTH-192, MainGameScreen.HEIGHT/2+128);
		mapCollisions.add(new Location(MainGameScreen.WIDTH-192, MainGameScreen.HEIGHT/2+128));
		enemies.add(enemy3);
		
		enemy4 = new Enemy(TextureRegion.split(new Texture(Gdx.files.internal("Level1/SkeletonSpearHealthBar.png")), 64, 64),"Enemy4",1,15,10);
		enemy4.setPosition(MainGameScreen.WIDTH-320, MainGameScreen.HEIGHT/2-192);
		mapCollisions.add(new Location(MainGameScreen.WIDTH-320, MainGameScreen.HEIGHT/2-192));
		enemies.add(enemy4);
		
		enemy5 = new Enemy(TextureRegion.split(new Texture(Gdx.files.internal("Level1/SkeletonSpearHealthBar.png")), 64, 64),"Enemy5",1,15,10);
		enemy5.setPosition(MainGameScreen.WIDTH-320, MainGameScreen.HEIGHT/2-64);
		mapCollisions.add(new Location(MainGameScreen.WIDTH-320, MainGameScreen.HEIGHT/2-64));
		enemies.add(enemy5);
		
		enemy6 = new Enemy(TextureRegion.split(new Texture(Gdx.files.internal("Level1/SkeletonSpearHealthBar.png")), 64, 64),"Enemy6",1,15,10);
		enemy6.setPosition(MainGameScreen.WIDTH-320, MainGameScreen.HEIGHT/2+64);
		mapCollisions.add(new Location(MainGameScreen.WIDTH-320, MainGameScreen.HEIGHT/2+64));
		enemies.add(enemy6);
		
	}
}