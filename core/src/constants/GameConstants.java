package constants;

import com.badlogic.gdx.graphics.Texture;

public class GameConstants {
	
	//directions
	public static final int UP = 0 ; 
	public static final int RIGHT = 1 ; 
	public static final int DOWN = 2 ; 
	public static final int LEFT = 3 ; 
	
	//player variables
	public static final float PLAYER_BASE_SPEED = 3 ; 
	public static final int PLAYER_STARTING_DIRECTION = UP ;
	public static final long PLAYER_BASE_ATTACK_SPEED = 600000000L ; 
	public static final float PLAYER_STARTING_HEALTH = 100 ; 
	
	//enemy variables
	public static final int ENEMY_STARTING_DIRECTION = UP ;
	public static final float ENEMY_STARTING_HEALTH = 100 ; 
	public static final float ENEMY_STARTING_DAMAGE = 100 ;
	public static final float ENEMY_BASE_SPEED = 3 ; 
	public static final long ENEMY_BASE_ATTACK_SPEED = 600000000L ; 
	
	//level variables
	public static final int PLAYER_START_X = 2 ; 
	public static final int PLAYER_START_Y = 2 ; 
	public static final int BASE_NUM_ENEMIES = 5 ; 
	public static final int CAP_NUM_ENEMIES = 20 ; 
	
	//visual constants
	public static final int PLAYER_VIEW_X = 1920 ;
	public static final float PLAYER_VIEW_Y = 1080 ;
	
	//textures 
	public static final Texture FLOOR_TEXTURE = new Texture("floorTest.png"); 
	public static final Texture WALL_TEXTURE = new Texture("wallTest.png");
	public static final Texture PLAYER_TEXTURE = new Texture("tempTest.png");
}
