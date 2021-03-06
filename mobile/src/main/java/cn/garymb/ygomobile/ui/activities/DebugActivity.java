package cn.garymb.ygomobile.ui.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import cn.garymb.ygomobile.lite.R;

public class DebugActivity extends BaseActivity {

    private RecyclerView rv_list;
    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.debug_activity);

        initView();

    }

    private void initView() {
        rv_list=$(R.id.rv_list);
        toolbar=$(R.id.toolbar);

        setSupportActionBar(toolbar);
        enableBackHome();

    }
}
