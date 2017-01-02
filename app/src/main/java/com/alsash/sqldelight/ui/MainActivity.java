package com.alsash.sqldelight.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.alsash.sqldelight.R;

import butterknife.ButterKnife;
import butterknife.OnClick;


public final class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.list)
    public void showPlayers() {
        startActivity(new Intent(this, PlayersActivity.class));
    }

    @OnClick(R.id.teams)
    public void showTeams() {
        startActivity(new Intent(this, TeamsActivity.class));
    }
}
