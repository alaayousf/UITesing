package com.testing.uitest;

import android.widget.ListView;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;


@RunWith(AndroidJUnit4.class)
public class RecycelerViewActivityTest {

    private int lesId = R.id.recy_allList;
    private RecyclerView listView;

    @Rule
    public ActivityScenarioRule<RecycelerViewActivity> homeActivityActivityScenarioRule2 = new ActivityScenarioRule<>(RecycelerViewActivity.class);


    @Before
    public void setUpTest() {
        homeActivityActivityScenarioRule2.getScenario().onActivity(new ActivityScenario.ActivityAction<RecycelerViewActivity>() {
            @Override
            public void perform(RecycelerViewActivity activity) {

                listView=activity.findViewById(lesId);
            }
        });
    }


    @Test
    public void listView_isCorrect() {
        // check list view is visible
        onView(withId(lesId)).check(matches(isDisplayed()));
    }



}