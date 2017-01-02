package com.alsash.sqldelight.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alsash.sqldelight.R;
import com.alsash.sqldelight.data.Team;

import java.text.SimpleDateFormat;

import butterknife.BindView;
import butterknife.ButterKnife;

public final class TeamRow extends LinearLayout {
    @BindView(R.id.team_name)
    TextView teamName;
    @BindView(R.id.coach_name)
    TextView coachName;
    @BindView(R.id.founded)
    TextView founded;

    @SuppressLint("SimpleDateFormat")
    private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public TeamRow(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);
    }

    public void populate(Team team) {
        teamName.setText(team.name());
        coachName.setText(team.coach());
        founded.setText(getContext().getString(R.string.founded, df.format(team.founded().getTime())));
    }
}
