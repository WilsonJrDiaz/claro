package com.example.importanttodos

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TodoTests {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun add_update_todo() {
        val title = "claro"
        val updateTitle = "Carlos Slim"

        Espresso.onView(ViewMatchers.withId(R.id.todo_title)).perform(ViewActions.typeText(title))
        Espresso.onView(ViewMatchers.withId(R.id.todo_save_button)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.todo_name)).check(ViewAssertions.matches(
            ViewMatchers.withText(title))).perform(ViewActions.click())


        Espresso.onView(ViewMatchers.withId(R.id.todo_name)).perform(ViewActions.replaceText(updateTitle))
        Espresso.onView(ViewMatchers.withId(R.id.update_button)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.todo_name)).check(ViewAssertions.matches(
            ViewMatchers.withText(updateTitle)))
    }
}