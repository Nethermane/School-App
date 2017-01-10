package com.mcs.schoolapp;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class AppScreen implements Screen {
	private Stage stage;
	private BitmapFont font;
	
	//called whenever the Game class switches to this screen
	//similar to a constructor method
	@Override
	public void show() {
		stage = new Stage();
		//Gdx.files.internal just opens a file from inside the android assets folder
		System.out.println(Gdx.files.internal("fonts/OpenSans-Bold.ttf").exists());
		FreeTypeFontGenerator fontGenerator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/OpenSans-Bold.ttf"));
		FreeTypeFontParameter parameter = new FreeTypeFontParameter();
		//arbitrary styling
		parameter.size = 70;
		parameter.color = Color.WHITE;
		parameter.magFilter = TextureFilter.Linear;
		parameter.minFilter = TextureFilter.Linear;
		//telling it to generate a font and assign in to the field "font"
		font = fontGenerator.generateFont(parameter);
		TextButton.TextButtonStyle style = new TextButton.TextButtonStyle();
		style.font = font;
		//making the actual button
		TextButton buttonExample = new TextButton("LOOK, TEXT", style);
		//centers it
		buttonExample.setFillParent(true);
		//putting it onto a stage
		stage.addActor(buttonExample);
	}
	
	@Override
	public void render(float delta) {
		//every actor on the stage "acts", does any movement/actions
		stage.act(delta);
		//renders every actor
		stage.draw();

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

	//this is called whenever the game switches away from this screen
	@Override
	public void hide() {
		this.dispose();

	}
	//this is always called manunally, in this case it disposes of the font after the screen changes
	@Override
	public void dispose() {
		//when the 
		font.dispose();

	}

}
