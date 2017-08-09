package com.vegetablecorp.musicalstructure;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class PlayActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView album;

    /**
     * Handles playback of all the sound files
     */
    private MediaPlayer mMediaPlayer;

    /**
     * Handles audio focus when playing a sound file
     */
    private AudioManager mAudioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        album = (ImageView) findViewById(R.id.album);
        album.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.store:
                Intent intent2 = new Intent(this, StoreActivity.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.album:
                toLibrary();;
                break;
            case R.id.skip_previous:
                skipPrevious();
                break;
            case R.id.play:
                play();
                break;
            case R.id.pause:
                pause();
                break;
            case R.id.stop:
                stop();
                break;
            case R.id.skip_next:
                skipNext();
                break;
            case R.id.view_playlist:
                viewPlaylist();
                break;
            default:
                break;
        }
    }

    private void toLibrary(){
        Intent intent = new Intent(this, LibraryActivity.class);
        startActivity(intent);
    }

    private void skipPrevious() {

    }

    private void play() {
        Intent intent = new Intent(Intent.ACTION_VIEW);;
    }

    private void pause() {
        mMediaPlayer.pause();
    }


    private void stop() {
        mMediaPlayer.stop();
    }

    private void skipNext() {
    }

    private void viewPlaylist() {
        toLibrary();
    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }


}
