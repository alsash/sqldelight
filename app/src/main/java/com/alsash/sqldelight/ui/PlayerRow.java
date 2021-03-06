package com.alsash.sqldelight.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alsash.sqldelight.R;
import com.alsash.sqldelight.data.Player;
import com.alsash.sqldelight.data.Team;

import butterknife.BindView;
import butterknife.ButterKnife;

public final class PlayerRow extends LinearLayout {
    @BindView(R.id.player_name)
    TextView playerName;
    @BindView(R.id.team_name)
    TextView teamName;
    @BindView(R.id.player_number)
    TextView playerNumber;

    public PlayerRow(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);
    }

    public void populate(Player player, Team team) {
        playerName.setText(player.first_name() + " " + player.last_name());
        playerNumber.setText(String.valueOf(player.number()));
        teamName.setText(team.name());
    }
}
