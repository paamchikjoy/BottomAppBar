package com.example.bottomappbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class MainActivity extends AppCompatActivity {

    private BottomAppBar bottomAppBar;
    private LinearLayout mLinearlayout;
    private BottomSheetBehavior mBottomSheetBehaviour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomAppBar=findViewById(R.id.bottom_app_bar);
        mLinearlayout=findViewById(R.id.bottom_sheet_layout);
        mBottomSheetBehaviour= BottomSheetBehavior.from(mLinearlayout);

        setSupportActionBar(bottomAppBar);
        mBottomSheetBehaviour.setState(BottomSheetBehavior.STATE_HIDDEN);
        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mBottomSheetBehaviour =BottomSheetBehavior.from(mLinearlayout);
                mBottomSheetBehaviour.setState(BottomSheetBehavior.STATE_EXPANDED);
                bottomAppBar.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_END);
            }
        });

    }

   @Override
       public boolean onCreateOptionsMenu(Menu menu) {
       super.onCreateOptionsMenu(menu);
       getMenuInflater().inflate(R.menu.bottom_app_bar_menu,menu);
       return true;
   }
}