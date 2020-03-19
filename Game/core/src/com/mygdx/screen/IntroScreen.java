package com.mygdx.screen;

import com.badlogic.gdx.Gdx;
import com.mygdx.game.HeroesOfOlympus;
import com.mygdx.level.*;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.video.VideoPlayer;
import com.badlogic.gdx.video.VideoPlayerCreator;

import javax.swing.*;
import java.io.FileNotFoundException;

@SuppressWarnings("ALL")
public class IntroScreen implements Screen {

	HeroesOfOlympus game;

	Texture nextButton;
	TextureRegion myTextureRegion;
	TextureRegionDrawable myTexRegionDrawable;
	ImageButton button;

	Stage stage;
	float x;
	float y;
	String text;
	VideoPlayer video;
	VideoPlayerCreator creator;
	boolean finished = false, videoLoaded = false;
	FileHandle videoFile;

	IntroScreen(HeroesOfOlympus game) throws FileNotFoundException {
		this.game = game;

		//Initialise creator
        creator = new VideoPlayerCreator();
		//Initialise video
		video = VideoPlayerCreator.createVideoPlayer();

		video.setOnVideoSizeListener(new VideoPlayer.VideoSizeListener() {
			@Override
			public void onVideoSize(float width, float height) {
				videoLoaded = true;
			}
		});
		video = creator.createVideoPlayer();
		//Create file handle to locate internal file
		videoFile = Gdx.files.internal("scene1.mp4");
		//Check if file exists
		System.out.println("Exists?: " + videoFile.exists());
		//play the specified file
		//video.play(videoFile);

		int videoWidth = video.getVideoWidth();
		int videoHeight = video.getVideoHeight();
		System.out.println("VideoSize: " + videoWidth + " : " + videoHeight);

		// it is important to do a resize after starting the video
		video.resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

		//Set when the video is finished player to true on completion listener
		video.setOnCompletionListener(new VideoPlayer.CompletionListener() {
			@Override
			public void onCompletionListener(FileHandle file) {
				finished = true;
				System.out.println("onCompletionListener");
			}
		});
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		if (Gdx.input.isTouched()) {
			this.dispose();
			game.setScreen(new MainGameScreen(game, new Level1()));
			if (video.isPlaying()) video.stop();
		}

		if (videoLoaded) {
			if (!video.render()) {
				// end video
				videoLoaded = false;
				this.dispose();
				game.setScreen(new MainGameScreen(game, new Level1()));
				if (video.isPlaying()) video.stop();
//                video.play(videoFile);
//                Gdx.app.log(getClass().getSimpleName(), "playing video");
			}
		}

	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}