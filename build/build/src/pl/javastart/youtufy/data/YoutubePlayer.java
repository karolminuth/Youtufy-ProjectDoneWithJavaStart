package pl.javastart.youtufy.data;
 
import java.util.concurrent.atomic.AtomicBoolean;
 
public class YoutubePlayer {
 
    public final static AtomicBoolean PLAYING = new AtomicBoolean(false);
 
    public static enum PlayerState {
        UNSTARTED(-1), ENDED(0), PLAYING(1), PAUSED(2), BUFFERING(3);
 
        private int state;
 
        private PlayerState(int state) {
            this.state = state;
        }
 
        public int getState() {
            return state;
        }
 
        public static boolean isPlaying(int state) {
            return state == ENDED.getState() || state == PLAYING.getState() | state == PAUSED.getState();
        }
    }
}