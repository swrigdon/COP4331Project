package constants;

import com.badlogic.gdx.graphics.Texture;

public class GameConstants {
	
	//directions
	public static final int UP = 0 ; 
	public static final int RIGHT = 1 ; 
	public static final int DOWN = 2 ; 
	public static final int LEFT = 3 ; 
	
	//player variables
	public static final float PLAYER_BASE_SPEED = 12 ; 
	public static final int PLAYER_STARTING_DIRECTION = UP ;
	public static final long PLAYER_BASE_ATTACK_SPEED = 600000000L ; 
	public static final float PLAYER_STARTING_HEALTH = 100 ; 
	
	//enemy variables
	public static final int ENEMY_STARTING_DIRECTION = UP ;
	public static final float ENEMY_STARTING_HEALTH = 100 ; 
	public static final float ENEMY_STARTING_DAMAGE = 25 ;
        public static final float ENEMY_DAMAGE_SCALE = 5;
	public static final float ENEMY_BASE_SPEED = 3 ; 
	public static final long ENEMY_BASE_ATTACK_SPEED = 800000000L ; 
	
	//level variables
	public static final int PLAYER_START_X = 2 ; 
	public static final int PLAYER_START_Y = 2 ; 
	public static final int BASE_NUM_ENEMIES = 5 ; 
	public static final int CAP_NUM_ENEMIES = 20 ; 
        public static final int NUM_GROUND_ITEMS = 3;
        
        //Potion variables
        public static final int BASE_HEALTH_POTION = 50;
        public static final long BASE_ATTACK_POTION = 100000000L;
        public static final int BASE_MOVE_POTION = 3;
        public static final int SCALE_FACTOR_POTION = 10;
	
	//visual constants
	public static final int PLAYER_VIEW_X = 1920 ;
	public static final float PLAYER_VIEW_Y = 1080 ;
	
	//textures 
	public static final Texture FLOOR_TEXTURE = new Texture("floorTest.png"); 
	public static final Texture WALL_TEXTURE = new Texture("wallTest.png");
	public static final Texture PLAYER_TEXTURE = new Texture("tempTest.png");
        public static final Texture ARROW_UP_TEXTURE = new Texture("arrowUpTest.png");
        public static final Texture ARROW_DOWN_TEXTURE = new Texture("arrowDownTest.png");
        public static final Texture ARROW_LEFT_TEXTURE = new Texture("arrowLeftTest.png");
        public static final Texture ARROW_RIGHT_TEXTURE = new Texture("arrowRightTest.png");
        public static final Texture FIREBALL_TEXTURE = new Texture("fireball.png");
        public static final Texture ITEM_HEALTH = new Texture("healthpot2.png");
        public static final Texture ITEM_ATTACK = new Texture("attackspeedpot.png");
}
